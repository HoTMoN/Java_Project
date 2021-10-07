package statement;
// 8월 16일 선택과제:calc를 실행하고 종료를 선택하기 전까지 메뉴가 출력되면서 선택될 수 있도록 수정하기
// while or do while을 사용
import java.util.Scanner;

public class calc_while {
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
		while(Cal <=4) {
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