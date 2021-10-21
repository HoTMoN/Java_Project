package mapred.exam.stock.option;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class StockOptionMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	Text outputKey = new Text();
	static final IntWritable outputval = new IntWritable(1);
	String jobType;

	@Override
	protected void setup(Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		jobType = context.getConfiguration().get("jobType");
	}

	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		if (key.get() > 0) {
			String[] line = value.toString().split(","); 
			if (line != null & line.length > 0) { 
				if (jobType.equals("up")) {	// 상승
					if (Double.parseDouble(line[6]) - Double.parseDouble(line[3]) > 0) {
						outputKey.set(line[2].substring(0,4) + "년");
						context.write(outputKey, outputval);
					}
				} else if (jobType.equals("equal")) { //보합
					if (Double.parseDouble(line[6]) - Double.parseDouble(line[3]) == 0) {
						outputKey.set(line[2].substring(0,4) + "년");
						context.write(outputKey, outputval);
					}
				} else if (jobType.equals("down")) { //하락
					if (Double.parseDouble(line[6]) - Double.parseDouble(line[3]) < 0) {
						outputKey.set(line[2].substring(0,4) + "년");
						context.write(outputKey, outputval);
					}
				}
			}
		}
	}
}
