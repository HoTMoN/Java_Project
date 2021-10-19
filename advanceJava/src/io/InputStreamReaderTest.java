package io;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		//InputStream�� InputStreamReader�� �����ؼ� Ű����� �Է��� �ѱ��� �� ��µ� �� �ֵ��� ����
		InputStreamReader in = new InputStreamReader(System.in);
		try {
			// read�޼ҵ尡 �� byte�� �о �����ϹǷ� ��ü�� �� �������� �ݺ��ؼ� �о�� �Ѵ�. while
			while (true) {
				int data = in.read();
				if (data == -1) {
					break;
				}
				// ASCII�ڵ带 ����
				System.out.print((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
