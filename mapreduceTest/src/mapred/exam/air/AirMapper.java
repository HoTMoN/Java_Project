package mapred.exam.air;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AirMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	Text outputKey = new Text();
	static final IntWritable outputval = new IntWritable(1);

	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		if (key.get() > 0) {
			String[] line = value.toString().split(","); // 한 라인을 ,를 기준으로 단어 분리
			if (line != null & line.length > 0) { // 분리된 결과가 null이 아니거나 결과가 있을때만 작업
				if (!line[15].equals("NA") && Integer.parseInt(line[15])>0) {
					outputKey.set(line[1]+"월");// 월
					int result = Integer.parseInt(line[15]);
					if (result > 0) {// 양수 => 시간딜레이 음수 => 일찍 출발
						context.write(outputKey, outputval);
					}
				}
			}
		}
	}
}
