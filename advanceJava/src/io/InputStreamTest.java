package io;

import java.io.IOException;
import java.io.InputStream;

//InputStream을 이용해서 키보드로 입력받는 문자열을 읽기

public class InputStreamTest {
	public static void main(String[] args) {
		InputStream in = System.in;
		try {
			// read메소드가 한 byte씩 읽어서 리턴하므로 전체를 다 읽으려면 반복해서 읽어야 한다.
			while (true) {
				int data = in.read();
				if (data == -1) {
					break;
				}
				// ASCII코드를 리턴
				System.out.print((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
