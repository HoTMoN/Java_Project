package mapred.exam.air.multiple;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

public class AirMultipleReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
	IntWritable resultVal = new IntWritable(); // 출력값
	Text resultKey = new Text(); // 출력키
	MultipleOutputs<Text, IntWritable> multiOut;

	@Override
	protected void setup(Reducer<Text, IntWritable, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		multiOut = new MultipleOutputs<Text, IntWritable>(context);
	}

	@Override
	protected void reduce(Text key, Iterable<IntWritable> values,
			Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		// 1. Mapper에서 전달받은 key에서 구분값을 분리
		String[] data = key.toString().split(",");
		resultKey.set(data[1]);
		// 2. key에 추가됐던 구분자별로 output
		if (data[0].equals("1980")) {
			int sum = 0;
			for (IntWritable value : values) {
				sum = sum + value.get();
			}
			resultVal.set(sum); // output value에 추가하기
			// multiout에 write
			multiOut.write("1980", resultKey, resultVal);
		} else if (data[0].equals("1990")) {
			int sum = 0;
			for (IntWritable value : values) {
				sum = sum + value.get();
			}
			resultVal.set(sum); // output value에 추가하기
			// multiout에 write
			multiOut.write("1990", resultKey, resultVal);
		} else {
			
			int sum = 0;
			for (IntWritable value : values) {
				sum = sum + value.get();
			}
			resultVal.set(sum); // output value에 추가하기
			// multiout에 write
			multiOut.write("2000", resultKey, resultVal);
		}
	}

	@Override
	protected void cleanup(Reducer<Text, IntWritable, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		multiOut.close();
	}

}
