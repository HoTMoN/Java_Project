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
//A���� Z���� ����ϼ���
//hint system.out.println(65)�� ������ �����ϸ� 65�� ���.
//		System.out.println((char)65) �� ������ �����ϸ� ���ڷ� ���.
//[�������]
//ABCDEFGH...Z

//AlphaExam.java