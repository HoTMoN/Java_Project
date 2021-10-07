package oop.basic;

import java.util.Scanner;

public class HapExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("1부터 사이 합을 구하고 싶은 숫자를 입력하세요");
		int num = key.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i=i+1){
			sum = sum+i;
		}
		System.out.println("총합:"+sum);
	}
}