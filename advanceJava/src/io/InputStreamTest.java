package io;

import java.io.IOException;
import java.io.InputStream;

//InputStream�� �̿��ؼ� Ű����� �Է¹޴� ���ڿ��� �б�

public class InputStreamTest {
	public static void main(String[] args) {
		InputStream in = System.in;
		try {
			// read�޼ҵ尡 �� byte�� �о �����ϹǷ� ��ü�� �� �������� �ݺ��ؼ� �о�� �Ѵ�.
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
