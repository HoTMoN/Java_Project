package hdfs.exam;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/*
*	hadoop hdfs�� api�� ����
* - hadoop hdfs�� api�� �̿��ؼ� ������ ����
* - ����ڰ� ���ϴ� ��ο� ������ ����
*/
public class HDFSTest01 {
	public static void main(String[] args) {
		// 1. hdfs�� �����ϱ� ���ؼ� ���� ������ �о ����ؾ� �Ѵ�.
		// hadoop��ġ ������ ���� ������ �����ϱ� ���ؼ� �����Ǵ� Ŭ����
		Configuration conf = new Configuration();
		FileSystem hdfs = null;
		// 4. HDFS�� �����ϴ� ����� ó���ϴ� output��Ʈ����ü�� ����
		FSDataOutputStream hdfsout = null;
		try {
			//2. HDFS�� �����ϱ� ���ؼ� HDFS�� ������ ��ü��
			hdfs = FileSystem.get(conf);
			//3. HDFS�� ��θ� ǥ���� �� �ִ� ��ü
			//=> HDFS�� ������(�����) ������ ��θ� ������Ű������� �޾Ƽ� �����ϰڴٴ� �ǹ�
			Path path = new Path(args[0]);
			//5. HDFS�� ������ �����ϱ� ���� ��½�Ʈ���� ����
			hdfsout = hdfs.create(path);
			//6. �����͸� ����ؼ� HDFS�� ���� �����ϱ�
			hdfsout.writeUTF(args[1]);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
