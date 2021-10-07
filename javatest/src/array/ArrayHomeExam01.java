package array;

import java.util.Random;

/* [출력형태] - Scanner
* 배열요소에 저장될 값 :________
* 배열요소에 저장될 값 :________
* 배열요소에 저장될 값 :________
* 배열요소에 저장될 값 :________
* 배열요소에 저장될 값 :________
* 랜덤수로 25 저장 -> 홀수
* 랜덤수로 42 저장 -> 짝수
* 랜덤수로 33 저장 -> 홀수
* 랜덤수로 17 저장 -> 홀수
* 랜덤수로 8 저장 -> 짝수*/

public class ArrayHomeExam01 {
	public static void main(String[] args) {
		/* int형 배열을 선언하고 아래와 같은 조건이 만족할 수 있도록 작업 [조건] 
		 * 1. int형 데이터 5개를 저장할 수 있도록 정의
		 * 2. Random값(1부터 50까지의 값)을 배열변수의 각 요소에 저장하기(Scanner로 입력 받아서 저장해도 좋음)
		 * 3. 배열 요소에 저장된 값이 짝수인지 홀수인지 판별하여 출력하기
		 * [출력형태] - Random
		 * 랜덤수로 25 저장 -> 홀수
		 * 랜덤수로 42 저장 -> 짝수
		 * 랜덤수로 33 저장 -> 홀수
		 * 랜덤수로 17 저장 -> 홀수
		 * 랜덤수로 8 저장 -> 짝수 */
		
		int [] myarr = new int[5];
		myarr[0] = (int) Math.floor(Math.random()*50);
		myarr[1] = (int) Math.floor(Math.random()*50);
		myarr[2] = (int) Math.floor(Math.random()*50);
		myarr[3] = (int) Math.floor(Math.random()*50);
		myarr[4] = (int) Math.floor(Math.random()*50);
			for(int i=0; i<5; i++) {
				if(myarr[i]%2==0) {
					System.out.println("랜덤수로 "+myarr[i]+" 저장 -> "+"짝수");
				}else {
					System.out.println("랜덤수로 "+myarr[i]+" 저장 -> "+"홀수");
				}
		}
	}
}
/*
 * int[] myarr = new int[5];
 *  Random rand = new Random();
 *  public ArrayHomeExam01() * { 
 *  for(int i=0;i<myarr.length;i++) { 
 *  myarr[i] = rand.nextInt();
 * if(myarr[i]%2==0) {
 * System.out.println("랜덤수로 :"+myarr[i]+"저장 -> 짝수");
 *  }else {
 * System.out.println("랜덤수로 :"+myarr[i]+"저장 -> 홀수");
 */

