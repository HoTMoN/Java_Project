package AI_Quest;

import java.util.Scanner;

public class Quest2 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("초기값을 정수로 입력하세요 : ");
		int a = key.nextInt();
		System.out.print("마지막값을 정수로 입력하세요 : ");
		int b = key.nextInt();
		System.out.print("증가분을 정수로 입력하세요 : ");
		int c = key.nextInt();
		int sum = 0;
		for(int i = a;i<=b;i=i+c) { 
			sum = sum+i;
		}
		if(sum>=1000) {
			sum = sum+2000;
			System.out.println("총합은 "+sum+" 입니다");
		}else {
		System.out.println("총합은 "+sum+" 입니다");
		}
	}
}
