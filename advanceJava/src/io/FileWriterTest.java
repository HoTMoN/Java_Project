package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		//1. ���Ͽ���
		//=> �Ű������� ���޵� ������ �����ϸ� ������ ���� �۾�������
		//	 ������ ���� ��� ���� ������ �����ؼ� �۾�
		//	 �⺻ �����ڴ� ���� �����
		//FileWriter fw = new FileWriter("src/data/output.txt");
		FileWriter fw = new FileWriter("src/data/output.txt",true);
		//2. ���Ͽ�����
		fw.write(97);
		fw.write("���ڿ�����\n");
		fw.write("test");
		//3. ���ϴݱ�
		fw.close();
	}
}
