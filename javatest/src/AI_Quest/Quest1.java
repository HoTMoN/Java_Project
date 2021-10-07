package AI_Quest;

import java.util.Scanner;

public class Quest1 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("1보다 크고 10보다 작은 정수를 입력하세요");
		int num = key.nextInt();
		if(num<2 | num>9) {
			System.out.println("잘못된 숫자를 입력했습니다.");
			System.exit(0);
		}else {for(int i=1; i<=9; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
			}	
		}
	}
}
