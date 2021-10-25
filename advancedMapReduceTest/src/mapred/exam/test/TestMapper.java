package mapred.exam.test;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class TestMapper extends Mapper<LongWritable, Text, MyKey, IntWritable> {
	MyKey outputKey = new MyKey();
	static final IntWritable outputval = new IntWritable(1);

	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, MyKey, IntWritable>.Context context)
			throws IOException, InterruptedException {
		if (key.get() > 0) { // 번 제외
			String[] line = value.toString().split("\t"); // 공백으로 단어분리
			if (line != null & line.length > 0) {
				//if (!line[15].equals("NA") && Integer.parseInt(line[15]) > 0) {
					outputKey.setProductId(line[2]);
					outputKey.setUserId(line[9]);
					context.write(outputKey, outputval);
				
			}
		}
	}
}
