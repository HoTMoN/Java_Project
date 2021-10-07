package editplus;
/*
ScoreExam.java 작성
1. 변수를 세 개 선언
2. 국어, 영어, 수학 점수를 임의로 저장
3. 출력결과를 다음과 같이 작성
	[출력결과]  
	총점 : _________
	평균 : _________
*/
public class ScoreExam{
	public static void main(String[] args){
		int korean = 98;
		int Math = 88;
		int English = 80;
		int result = korean + Math + English;
		int average = result/3;
		System.out.println("result : "+result);
		System.out.println("average : "+average);
		}
}