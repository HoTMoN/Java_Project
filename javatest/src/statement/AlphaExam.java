package statement;

public class AlphaExam {
	public static void main(String[] args) {
		char c = 'Z';
		System.out.println((int)c);
		for(int i=65;i<91;i++) {
			System.out.print((char)i);
		}
		System.out.println();
		for(char alpha='A';alpha<='Z';alpha++) {
			System.out.print(alpha);
		}
	}

}
//A부터 Z까지 출력하세요
//hint system.out.println(65)이 문장을 실행하면 65가 출력.
//		System.out.println((char)65) 이 문장을 실행하면 문자로 출력.
//[출력형태]
//ABCDEFGH...Z

//AlphaExam.java