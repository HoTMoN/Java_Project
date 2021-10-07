package oop.poly;
import java.util.Scanner;

public class CE_SenderTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("********Sender�ý���********");
		System.out.println("1. Email�� ����");
		System.out.println("2. SMS�� ����");
		System.out.println("3. Band�� ����");
		System.out.println("4. KaKao�� ����");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
		int work = key.nextInt();
		CE_Sender sender = null;
		
		switch(work){
			case 1:
				sender = new CE_EmailSender("���Ϸ�����",100);
				break;
			case 2:
				sender = new CE_SMSSender("�ܹ���",80);
				break;
			case 3:
				sender = new CE_BandSender("Band",90);
				break;
			case 4:
				sender = new CE_KaKaoSender("KaKao",120);
				break;	

		}
		CE_SenderLogic s = new CE_SenderLogic();
		s.run(sender);
	}
}
