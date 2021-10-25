package mapred.exam.test;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

//맵리듀스를 실행하기 위한 클래스
public class TestDriver extends Configured implements Tool {

	@Override
	public int run(String[] optionlist) throws Exception {
		GenericOptionsParser optionParser = new GenericOptionsParser(getConf(), optionlist);

		String[] otherArgs = optionParser.getRemainingArgs();
		Job job = new Job(getConf(), "test");

		job.setMapperClass(TestMapper.class);
		job.setReducerClass(TestReducer.class);
		job.setJarByClass(TestDriver.class);

		// shuffle할 때 사용할 클래스를 사용자정의 클래스가 실행되도록 등록하기
		job.setPartitionerClass(TestPartitioner.class);
		job.setGroupingComparatorClass(GroupKeyComparator.class);
		job.setSortComparatorClass(MyKeyComparator.class);
		job.setMapOutputKeyClass(MyKey.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);

		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);

		FileInputFormat.addInputPath(job, new Path(otherArgs[0]));
		FileOutputFormat.setOutputPath(job, new Path(otherArgs[1]));

		job.waitForCompletion(true);
		return 0;

	}

	public static void main(String[] args) throws Exception {
		ToolRunner.run(new Configuration(), new TestDriver(), args);
	}

}