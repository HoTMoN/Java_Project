package mapred.exam.test;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class TestReducer extends Reducer<MyKey, IntWritable, MyKey, IntWritable> {
	IntWritable resultVal = new IntWritable();
	MyKey resultKey = new MyKey();
	Text appenddata = new Text(); // 로그파일로 출력할 값을 저장할 변수

	@Override
	protected void reduce(MyKey key, Iterable<IntWritable> values,
			Reducer<MyKey, IntWritable, MyKey, IntWritable>.Context context) throws IOException, InterruptedException {
		int sum = 0;
//		Integer beforeMonth = key.getMonth();
		int count = 0;
		String beforeLogin = key.getUserId();
//		String beforeProduct = key.getProductId();
		// appenddata.set("reduce호출");
		// 한 개씩 비교하면서 month가 같으면 집계를 하고 month가 달라지면 기존의 집계한 내용을 내보내기하고 다시 초기화

		for (IntWritable value : values) {
			if (count <= 10) {
				System.out.println("reduce=>" + key);
				count++;
			}
//			if (beforeProduct != key.getProductId()) {// 최초 물건값이 달라지는 시점
//				// 결과를 내보내기
//				resultKey.setProductId(beforeProduct);
//				resultKey.setUserId(key.getUserId());
//				resultVal.set(sum);
//				context.write(resultKey, resultVal);
//				sum = 0; // 다시 집계해야 하므로 초기화
//			}
//			sum = sum + value.get();
//			beforeProduct = key.getProductId();
			if (beforeLogin != key.getUserId()) {// 최초 아이디값과 아이디값이 달라지는 시점
				// 결과를 내보내기
				resultKey.setUserId(beforeLogin);
				resultKey.setProductId(key.getProductId());
				resultVal.set(sum);
				context.write(resultKey, resultVal);
				sum = 0; // 다시 집계해야 하므로 초기화
			}
			sum = sum + value.get();
			beforeLogin = key.getUserId();
		} // end for
//		if (key.getProductId() == beforeProduct) {
//			resultKey.setProductId(beforeProduct);
//			resultKey.setUserId(key.getUserId());
//			resultVal.set(sum);
//			context.write(resultKey, resultVal);
//		}
		if (key.getUserId() == beforeLogin) {
			resultKey.setUserId(beforeLogin);
			resultKey.setProductId(key.getProductId());
			resultVal.set(sum);
			context.write(resultKey, resultVal);
		}
	}
}
