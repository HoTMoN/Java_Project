package oop.basic;

import java.util.Random;

public class IfTest01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(100)+1;
		//myMethodUtil�� �и��� �޼ҵ带 ȣ���ؼ� ����� �����ϰ� Ȯ��
		MyMethodUtil util = new MyMethodUtil();		
		util.scoreCheck(num);
	}		   
}