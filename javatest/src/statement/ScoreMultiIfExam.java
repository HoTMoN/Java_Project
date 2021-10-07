package statement;

import java.util.Scanner;

public class ScoreMultiIfExam {
	public static void main(String[]args){
		//다중if, if문을 중첩
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
		int num = key.nextInt();
		
		System.out.println("점수:"+num);
		if(num<0) {
			System.out.println("잘못입력");
		}else if(num<60) {
			System.out.println("F학점");
		}else if(num<70) {
			System.out.println("D학점");
		}else if(num<80) {
			System.out.println("C학점");
		}else if(num<90) {
			System.out.println("B학점");
		}else if(num<=100) {
			System.out.println("A학점");
		}else if(num>100) {
			System.out.println("잘못입력");
		}
	}
}
		
		
		