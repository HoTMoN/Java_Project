package statement;

//�⺻�� ������ ����Ǵ� ���ͷ�

public class PrimitiveTypeValueTest {
	public static void main(String[] args) {
		//������ ���ͷ�
		boolean boolVal = true;//false
		System.out.println(boolVal);
		
		//���������ͷ� - byte, short, int, long(���������ͷ��� �⺻Ÿ���� int)
		//1)byte - �Ҵ�Ǵ¸޸� ũ�� : 1byte, ������ǥ������ : -2^7 ~ 2^7-1
		//byte b = 100;
		//    ---	----
		// 	  ����  ���ͷ�
		//    byte   int
		byte b = 127;
		System.out.println("byte ���� : " +b);
		
		//2) short - 2byte, -2^15 ~ 2^15-1
		short s = 32767;
		System.out.println("short ���� : " +s);
		
		//3) int - 4byte, -2^31 ~ 2^31-1
		int i = 2147483647;
		System.out.println("int ���� : " +i);
		
		//4) long - 8byte, -2^63 ~ 2^63-1
		//long Ÿ���� ���ͷ��� ���̻縦 �߰��Ѵ�. L, l
		long l = 2147483648L;
		System.out.println("long ���� : " +l);
		
		//�Ǽ��� - float,double �Ҽ��ڸ��� ǥ���ϱ� ���� Ÿ��(�Ǽ������ͷ� �⺻Ÿ���� double)
		//1) float - 4byte
		float f = 10.5f;
		System.out.println("float�� ���� : "+f);
		
		//2) double - 8byte
		double d = 10.5;
		System.out.println("double�� ���� : "+d);
		
		//char�� ������ ���ͷ� - ''
		char c = 'A';
		System.out.println("char�� ���� : " +c);
		
		//String�� ������ ���ͷ� - String�� ������������ ���ֻ��ǹǷ� �⺻��ó�� ����� �� �ִ�.
		String str = "��������String�� ���ͷ��� ū����ǥ�� ǥ��";
		System.out.println("String�� ���� : " + str);
	}
}