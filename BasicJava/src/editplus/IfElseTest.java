package editplus;
/*
 IfElseTest.java

 점수를 저장할 수 있는 변수를 선언하고 다음과 같은 출력형태로 출력되도록 작성하세요.
 90이상은 pass로 출력
 90미만은 fail로 출력

 [출력]
 ____점은_____
 */

public class IfElseTest{
	public static void main(String[] args){
		int num = 85;
		if (num>=90){
			System.out.println(num + "점수는" + "pass");}
			else{
				System.out.println(num + "점수는" + "fail");}
		}
}