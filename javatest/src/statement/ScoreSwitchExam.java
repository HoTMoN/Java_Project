package statement;

import java.util.Scanner;
//ScroeMultiIfExam을 수정해서 ScoreSwitchExam 작성하기
// - if문 대신 switch문 사용
public class ScoreSwitchExam {
	public static void main(String[]args){
		//0 ~ 59 : F학점
		//60 ~ 69 : D학점
		//70 ~ 79 : C학점
		//80 ~ 89 : B학점
		//90 ~ 100 : A학점
		//110 or -40 : 잘못입력
		// [출력형태]
		//점수:___
		//____학점
		//Scanner 클래스를 이용해서 입력받도록
		//0부터 100까지 입력되면 학점평가, 외의 숫자는 잘못입력으로 출력되도록 구현
		//메일 제출하기
		
		Scanner key = new Scanner(System.in);		
		System.out.print("점수입력:");
		int jumsu = key.nextInt();
		if(jumsu<0 | jumsu>100) {
			System.out.println("잘못입력");
		}else {
			//hint : 정수/정수 = 정수
			switch(jumsu/10) {
				case 10 :
				case 9 :
					System.out.println("A학점");
					break;
				case 8 :
					System.out.println("B학점");
					break;
				case 7 :
					System.out.println("C학점");
					break;
				case 6 :
					System.out.println("D학점");
					break;
				default:
					System.out.println("F학점");
			}
		}
	}
}
		
		