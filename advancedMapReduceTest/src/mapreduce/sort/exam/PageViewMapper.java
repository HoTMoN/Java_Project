package mapreduce.sort.exam;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class PageViewMapper extends Mapper<LongWritable, Text, MyKey, Text> {
	MyKey outputKey = new MyKey();
	Text outputVal = new Text();

	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, MyKey, Text>.Context context)
			throws IOException, InterruptedException {
		String line = value.toString();
		String[] data = line.split("\\t");
		// data[2] - productId, data[9] - userId
		outputKey.setProductId(data[2]);
		outputKey.setUserId(data[9]);
		outputVal.set(data[9]);
		context.write(outputKey, outputVal);

	}
}
