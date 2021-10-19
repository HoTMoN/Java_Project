package io;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		//InputStream을 InputStreamReader로 변경해서 키보드로 입력한 한글이 잘 출력될 수 있도록 변경
		InputStreamReader in = new InputStreamReader(System.in);
		try {
			// read메소드가 한 byte씩 읽어서 리턴하므로 전체를 다 읽으려면 반복해서 읽어야 한다. while
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
