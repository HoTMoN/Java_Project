package statement;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		System.out.println("***********미니계산기********");
		System.out.println("1. 더하기");
		System.out.println("2. 곱하기");
		System.out.println("3. 빼기");
		System.out.println("4. 나누기");
		System.out.println("종료");
		System.out.print("연산자를 선택하세요.");
		Scanner key = new Scanner(System.in);
		int Cal = key.nextInt();
		if(Cal<=0 | Cal>4) {
			System.out.println("잘못입력");
			System.exit(0); //현재시스템을 종료
		}else {
		System.out.print("숫자를 입력하세요");
		int num1 = key.nextInt();
		int num2 = key.nextInt();
		int result = 0; // 연산 결과를 저장할 변수
						// 블럭 안에 선언되는 변수는 로컬변수이며 로컬변수는 반드시 초기값을 주어야 한다.
		switch(Cal) {
			case 1 :
				result = num1+num2;
				break;
			case 2 :
				result = num1*num2;
				break;
			case 3 :
				result = num1-num2;
				break;
			case 4 :
				result = num1/num2;
				break;
		}
		System.out.println("계산결과=>"+result);
	}
}
		}
		/*
		int A = num1+num2;
		int B = num1*num2;
		int C = num1-num2;
		int D = num1/num2;
		switch(Cal) {
		case 1 :
			System.out.println("계산결과=>"+ A);
			break;
		case 2 : 
			System.out.println("계산결과=>"+ B);
			break;
		case 3 :
			System.out.println("계산결과=>"+ C);
			break;
		case 4 : 
			System.out.println("계산결과=>"+ D);
			break;
		default :
			System.out.println("ERROR");
		}
		
	}

}
*/