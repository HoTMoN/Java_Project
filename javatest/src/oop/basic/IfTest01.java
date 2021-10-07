package oop.basic;

import java.util.Random;

public class IfTest01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(100)+1;
		//myMethodUtil로 분리한 메소드를 호출해서 결과를 동일하게 확인
		MyMethodUtil util = new MyMethodUtil();		
		util.scoreCheck(num);
	}		   
}