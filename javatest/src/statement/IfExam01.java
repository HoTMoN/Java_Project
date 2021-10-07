package statement;

import java.util.Random;
import java.util.Scanner;

public class IfExam01 {
	public static void main(String[] args) {
		//랜덤수를 발생시키고 0, 음수, 양수를 판별해서 출력하기
		//ex) 2144 => 양수 -4567 => 음수 0 => 0
		//[출력형태]
		Random ran1 = new Random();
		int result = ran1.nextInt();
		if(result==0) {
			System.out.println(result + "=> 0");
			}else {
		if(result>0) {
			System.out.println(result + "=> 양수");
		}else {
			System.out.println(result + "=> 음수");
			
			//Scanner를 이용해서 작업
			Scanner key = new Scanner(System.in);
			System.out.println("숫자를 입력하세요:");
			}
		}
	}
}
