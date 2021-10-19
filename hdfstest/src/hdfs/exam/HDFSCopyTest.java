package hdfs.exam;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HDFSCopyTest {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		FileSystem hdfs = null;
		FSDataOutputStream hdfsout = null;
		FSDataInputStream hdfsIn = null;
		Path inPath = new Path(args[0]); // input�� path - ������Ű�����
		Path outPath = new Path(args[1]); // output�� path - ������Ű�����
		try {
			hdfs = FileSystem.get(conf);
			hdfsIn = hdfs.open(inPath);
			hdfsout = hdfs.create(outPath);
			while (true) {
				int data = hdfsIn.read();
				if (data == -1) {
					break;
				}
				System.out.print((char) data);
				hdfsout.write((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}