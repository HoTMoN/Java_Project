package Practice;

public class Quest4_0821 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
		char encodedChar;
		for(int i=0; i<sourceString.length(); i++) {
			char currentChar = sourceString.charAt(i);
			if(currentChar ==' ') {
				encodedChar = (char)(currentChar);
			}else if(currentChar == 'x' | currentChar =='y' | currentChar == 'z') {
				encodedChar = (char)(currentChar-23);
			}else {
				encodedChar = (char)(currentChar+3);
		// ���α׷��� ������ ����.	
		// ���� : ���� 'a'�� �������� 97�̸�, 'z'�� 122�Դϴ�. 
		
		// ���α׷� ������ ��.
			}
			encodedString = encodedString+encodedChar;
		}
		System.out.println("��ȣȭ�� ���ڿ� : "+encodedString);
	}
}
