package hdfs.exam;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/*
 * hadoop�� hdfs�� api�� ����
 * - hdfs�� ����� ������ �о �ֿܼ� ����ϱ�
*/
public class HDFSTest02 {
	public static void main(String[] args) {
		// 1. ���������� ��ü�� ����
		Configuration conf = new Configuration();
		// 2. HDFS�� �����ϱ� ���� �����Ǵ� ��ü�� ����
		FileSystem hdfs = null;
		// 3. HDFS�� ���� input�ϱ� ���� ��Ʈ����ü ����
		FSDataInputStream hdfsIn = null;
		try {
			hdfs = FileSystem.get(conf);
			Path inPath = new Path(args[0]);
			hdfsIn = hdfs.open(inPath);
			//4. �Է½�Ʈ���� ���ؼ� �����͸� �д´�.
			//String data = hdfsIn.readUTF(); //�Է½�Ʈ������ ���ڿ��� �о ����
			int data = hdfsIn.read();
			
			System.out.println("hdfs���� ���� ������:"+(char)data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
