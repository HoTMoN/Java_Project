package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputStreamTest {
	public static void main(String[] args) {
		/*
		 * 1. ���Ͽ��� - API�� �̿��ؼ� �۾�(FIle IO�� ó���ϴ� API�� �����ϸ� ���ο��� �ڵ����� open)
		 * 2. ���Ͽ�����(�ݺ��۾�)
		 * 3. ���ϴݱ� - �����۾��� ��� �ݵ�� �ʿ�
		 */
		FileInputStream fis = null;
		try {
			// 1. ���Ͽ���
			fis = new FileInputStream("src/data/input.txt");
			// 2. ���Ͽ�����
			while (true) {
				int data = fis.read();
				if (data == -1) {// ������ ���� ������ -1�� �����ϹǷ�
					break;
				}
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//3. ���ϴݱ�
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
