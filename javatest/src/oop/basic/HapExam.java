package oop.basic;

import java.util.Scanner;

public class HapExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("1���� ���� ���� ���ϰ� ���� ���ڸ� �Է��ϼ���");
		int num = key.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i=i+1){
			sum = sum+i;
		}
		System.out.println("����:"+sum);
	}
}