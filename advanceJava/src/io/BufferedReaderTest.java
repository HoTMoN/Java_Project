package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null; //기본 읽기 기능+성능
		try {
//			fr = new FileReader("src/data/input.txt");
//			br = new BufferedReader(fr);
			br = new BufferedReader(new FileReader("src/data/input.txt"));
			int count = 0; //실행횟수
			long start = System.nanoTime(); //실행시간
			// 2. 파일엑세스
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
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
