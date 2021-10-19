package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null; //�⺻ �б� ���+����
		try {
//			fr = new FileReader("src/data/input.txt");
//			br = new BufferedReader(fr);
			br = new BufferedReader(new FileReader("src/data/input.txt"));
			int count = 0; //����Ƚ��
			long start = System.nanoTime(); //����ð�
			// 2. ���Ͽ�����
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
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
