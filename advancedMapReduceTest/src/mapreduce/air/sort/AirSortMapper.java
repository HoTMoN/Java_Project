package mapreduce.air.sort;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AirSortMapper extends Mapper<LongWritable, Text, CustomKey, IntWritable> {
	CustomKey outputKey = new CustomKey();
	static final IntWritable outputval = new IntWritable(1);

	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, CustomKey, IntWritable>.Context context)
			throws IOException, InterruptedException {
		if (key.get() > 0) { // 번 제외
			String[] line = value.toString().split(","); // ,로 단어분리
			if (line != null & line.length > 0) {
				// 출발지연
				if (!line[15].equals("NA") && Integer.parseInt(line[15]) > 0) {
					outputKey.setYear(line[0]);
					outputKey.setMonth(Integer.parseInt(line[1]));
					context.write(outputKey, outputval);
				}
			}
		}
	}
}
