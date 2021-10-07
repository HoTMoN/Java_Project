package Practice;

public class Quest4_0821 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		System.out.println("암호화할 문자열 : " + sourceString);
		char encodedChar;
		for(int i=0; i<sourceString.length(); i++) {
			char currentChar = sourceString.charAt(i);
			if(currentChar ==' ') {
				encodedChar = (char)(currentChar);
			}else if(currentChar == 'x' | currentChar =='y' | currentChar == 'z') {
				encodedChar = (char)(currentChar-23);
			}else {
				encodedChar = (char)(currentChar+3);
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		
		// 프로그램 구현부 끝.
			}
			encodedString = encodedString+encodedChar;
		}
		System.out.println("함호화된 문자열 : "+encodedString);
	}
}
