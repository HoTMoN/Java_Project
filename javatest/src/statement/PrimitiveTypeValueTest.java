package statement;

//기본형 변수에 저장되는 리터럴

public class PrimitiveTypeValueTest {
	public static void main(String[] args) {
		//논리형 리터럴
		boolean boolVal = true;//false
		System.out.println(boolVal);
		
		//정수형리터럴 - byte, short, int, long(정수형리터럴의 기본타입은 int)
		//1)byte - 할당되는메모리 크기 : 1byte, 데이터표현범위 : -2^7 ~ 2^7-1
		//byte b = 100;
		//    ---	----
		// 	  변수  리터럴
		//    byte   int
		byte b = 127;
		System.out.println("byte 변수 : " +b);
		
		//2) short - 2byte, -2^15 ~ 2^15-1
		short s = 32767;
		System.out.println("short 변수 : " +s);
		
		//3) int - 4byte, -2^31 ~ 2^31-1
		int i = 2147483647;
		System.out.println("int 변수 : " +i);
		
		//4) long - 8byte, -2^63 ~ 2^63-1
		//long 타입의 리터럴은 접미사를 추가한다. L, l
		long l = 2147483648L;
		System.out.println("long 변수 : " +l);
		
		//실수형 - float,double 소수자리를 표현하기 위한 타입(실수형리터럴 기본타입은 double)
		//1) float - 4byte
		float f = 10.5f;
		System.out.println("float형 변수 : "+f);
		
		//2) double - 8byte
		double d = 10.5;
		System.out.println("double형 변수 : "+d);
		
		//char형 변수의 리터럴 - ''
		char c = 'A';
		System.out.println("char형 변수 : " +c);
		
		//String형 변수의 리터럴 - String은 참조형이지만 자주사용되므로 기본형처럼 사용할 수 있다.
		String str = "참조형인String의 리터럴은 큰따옴표로 표현";
		System.out.println("String형 변수 : " + str);
	}
}
