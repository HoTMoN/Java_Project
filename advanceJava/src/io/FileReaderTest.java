package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			// 1. 파일오픈
			fr = new FileReader("src/data/input.txt");
			int count = 0; //실행횟수
			long start = System.nanoTime(); //실행시간
			// 2. 파일엑세스
			while (true) {
				int data = fr.read();
				if (data == -1) {// 파일의 끝을 만나면 -1을 리턴하므로
					break;
				}
				System.out.print((char)data);
				count++;
			}
			long end = System.nanoTime();
			System.out.println("실행횟수=>"+count);
			System.out.println("실행시간=>"+(end-start));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//3. 파일닫기
			try {
				if(fr!=null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
