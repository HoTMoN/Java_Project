package editplus;
// 논리연산자
// - and : &
// - or : |
public class OprTest03{
	public static void main(String[] args){
		int age = 15;
		int gender = 1;

		int num1 = 100;
		int num2 = 200;
		// &연산자(and)
		System.out.println("==========&연산=========");
		System.out.println((num1<num2) & (num1>=100));
		System.out.println((num1<num2) & (num1>100));
		System.out.println((num1>num2) & (num1>=100));
		System.out.println((num1>num2) & (num1>100));

		System.out.println("========|연산=======");
		System.out.println((num1<num2) | (num1>=100));
		System.out.println((num1<num2) | (num1>100));
		System.out.println((num1>num2) | (num1>=100));
		System.out.println((num1>num2) | (num1>100));

		System.out.println();  // Enter키를 누른것과 같은 결과
		//! (not)
		System.out.println(!true);
		System.out.println(!false);
	
	}
}