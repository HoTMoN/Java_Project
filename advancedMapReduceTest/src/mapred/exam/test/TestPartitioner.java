package mapred.exam.test;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Partitioner;

public class TestPartitioner extends Partitioner<MyKey, IntWritable>{
	
	//getPartition메소드는 어떤 리듀서로 보낼지 정의하는 메소드
	//세 번째 매개변수로 전달되는 numPartitions은 리듀스태스크의 갯수
	@Override
	public int getPartition(MyKey key, IntWritable value, int numPartitions) {
		return key.getProductId().hashCode() % numPartitions ;
	}

	
}
