package statement;

import java.util.Random;

public class Ifexam02 {
	public static void main(String[] args) {
		//1. 랜덤수 두 개 발생시키기
		//1) 성별코드 - 1~4까지
		//2) 나이 - 1 ~ 100
		//2. 성별과 나이를 가지고 판단해서 결과 출력하기(중첩if를 이용)
		//1) 성인남자 : 성별코드 1,3 나이 20세이상
		//2) 성인여자 : 성별코드 2,4 나이 20세이상
		//2) 청소년남자 : 성별코드 1,3 나이 20세미만
		//2) 청소년여자 : 성별코드 2,4 나이 20세미만
		//[출력형태] 성인남자(22,1)
		
		Random ran1 = new Random();//성별코드
		Random ran2 = new Random();//나이
		int result1 = ran1.nextInt(4)+1;
		int result2 = ran2.nextInt(100)+1;

		if(result1%2==0) {
			if(result2>=20) {
					System.out.println("성인여자"+"("+result2+","+result1+")");
				}else {
					System.out.println("청소년여자"+"("+result2+","+result1+")");
				}
			}else {
				if(result2>=20){
					System.out.println("성인남자"+"("+result2+","+result1+")");
				}else{
					System.out.println("청소년남자"+"("+result2+","+result1+")");}
				}
			}
		}
