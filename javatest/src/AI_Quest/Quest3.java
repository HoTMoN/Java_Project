package AI_Quest;

import java.util.Scanner;

public class Quest3 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("2 ~ 100 사이의 정수를 입력하세요 :");
		int num = key.nextInt();
		int a = 0;
		for(int i=2; i<=num; i++ ){
			if(num%i==0){
				a = a+1;
			}else {
				a = a;
			}			
		}
			if(a<=1) {
			System.out.println(num+" 는 소수입니다.");
		}else {
			System.out.println(num+" 는 소수가 아닙니다.");
		}
	}
}

