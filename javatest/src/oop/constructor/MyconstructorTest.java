package oop.constructor;

public class MyconstructorTest {
	public static void main(String[] args) {
		Myconstructor abc = new Myconstructor();
		abc.setId("jang");
		abc.setName("�嵿��");
		abc.setPass("1234"); //��ȣȭ�� �� ����
		abc.setTelNum("010");
		abc.setSsn("730111");
		abc.setAddr("����");
		abc.setNickname("¯");
		abc.print();
		
		Myconstructor abc2 = new Myconstructor("�̹�ȣ", "lee", "1234");
		abc2.setTelNum("010");
		abc2.setSsn("850111");
		abc2.setAddr("��õ");
		abc2.setNickname("F4");
		abc2.print();
		
		Myconstructor abc3 = new Myconstructor("����", "jang2", "1234","õ��", "010");
		abc3.setSsn("900111");
		abc3.setNickname("duke");
		abc3.print();
		
		System.out.println("============================");
		
		Myconstructor abc4 = new Myconstructor("�����", "kim", "1234","û��", "010","600603","��");
		abc4.print();
	}
}
