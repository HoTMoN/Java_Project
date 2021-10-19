package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			// 1. ���Ͽ���
			fr = new FileReader("src/data/input.txt");
			int count = 0; //����Ƚ��
			long start = System.nanoTime(); //����ð�
			// 2. ���Ͽ�����
			while (true) {
				int data = fr.read();
				if (data == -1) {// ������ ���� ������ -1�� �����ϹǷ�
					break;
				}
				System.out.print((char)data);
				count++;
			}
			long end = System.nanoTime();
			System.out.println("����Ƚ��=>"+count);
			System.out.println("����ð�=>"+(end-start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//3. ���ϴݱ�
			try {
				if(fr!=null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
