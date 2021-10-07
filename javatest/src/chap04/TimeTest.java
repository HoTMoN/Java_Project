package chap04;
/*
TimeTest.java작성하기
아래의 변수를 선언하고, 다음과 같은 조건을 만족하도록 작업하세요
time은 초 데이터임
int time = 8000;

[출력형태]
_____시______분_____초

*/
public class TimeTest{
	public static void main(String[] args){
		int time = 8000;
		int hour = 3600;
		int minute = 60;
		int second = 1;
		int result1 = time/hour;
		int result2 = (time-hour*result1)/minute;
		int result3 = (time - result1*hour - result2*minute)/second;
		System.out.println(result1+"시"+result2+"분"+result3+"초");
	}
}