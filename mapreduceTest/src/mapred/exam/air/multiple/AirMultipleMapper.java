package mapred.exam.air.multiple;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AirMultipleMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	Text outputKey = new Text();
	static final IntWritable outputval = new IntWritable(1);

	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		if (key.get() > 0) {// 0번라인 제외
			String[] line = value.toString().split(",");
			if (line != null & line.length > 0) { // key =>구분값, 년도
				if (!line[15].equals("NA") && Integer.parseInt(line[15]) > 0) {
					int result = Integer.parseInt(line[15]);
					if (result > 0) {
						if (Integer.parseInt(line[0]) < 1990) { // 1980년대
							outputKey.set("1980," + line[0] + "년" + line[1] + "월");
							context.write(outputKey, outputval);
						} else if (Integer.parseInt(line[0]) < 2000 & Integer.parseInt(line[0]) >= 1990) {// 1990년대
							outputKey.set("1990," + line[0] + "년" + line[1] + "월");
							context.write(outputKey, outputval);
						} else { // 2000년 이후
							outputKey.set("2000," + line[0] + "년" + line[1] + "월");
							context.write(outputKey, outputval);
						}
					}
				}
			}
		}
	}
}