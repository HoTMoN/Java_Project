package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		//1. 파일오픈
		//=> 매개변수로 전달된 파일이 존재하면 파일을 열고 작업하지만
		//	 파일이 없는 경우 새로 파일을 생성해서 작업
		//	 기본 생성자는 파일 덮어쓰기
		//FileWriter fw = new FileWriter("src/data/output.txt");
		FileWriter fw = new FileWriter("src/data/output.txt",true);
		//2. 파일엑세스
		fw.write(97);
		fw.write("문자열쓰기\n");
		fw.write("test");
		//3. 파일닫기
		fw.close();
	}
}
