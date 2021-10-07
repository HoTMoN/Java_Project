package AI_Quest;

import java.util.Scanner;

public class BE_FareTest {
	public static void main(String[] args) {
		System.out.println("----Menu----------------");
		System.out.println("1. 가정용 (liter당 50원)");
		System.out.println("1. 상업용 (liter당 45원)");
		System.out.println("1. 공업용 (liter당 30원)");
		System.out.println("------------------------");
		System.out.println("메뉴를 선택하세요=>");
		System.out.println("------------------------");
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		System.out.println("사용량을 입력하세요=>");
		int num1 = key.nextInt();
		System.out.println("=========================");
		switch(num) {
			case 1 :
				System.out.println("사용자코드:"+num);
				System.out.println("사용요금:"+50*num1);
				System.out.println("총사용요금:"+(50*num1)*1.05);
				break;
			case 2 :
				System.out.println("사용자코드:"+num);
				System.out.println("사용요금:"+45*num1);
				System.out.println("총사용요금:"+(45*num1)*1.05);
				break;
			case 3 :
				System.out.println("사용자코드:"+num);
				System.out.println("사용요금:"+30*num1);
				System.out.println("총사용요금:"+(30*num1)*1.05);
				break;
			default : 
				System.exit(0);
		}
		System.out.println("=========================");
	}
}
