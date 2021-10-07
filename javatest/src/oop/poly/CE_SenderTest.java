package oop.poly;
import java.util.Scanner;

public class CE_SenderTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("********Sender시스템********");
		System.out.println("1. Email로 전송");
		System.out.println("2. SMS로 전송");
		System.out.println("3. Band로 전송");
		System.out.println("4. KaKao로 전송");
		System.out.print("원하는 작업을 선택하세요:");
		int work = key.nextInt();
		CE_Sender sender = null;
		
		switch(work){
			case 1:
				sender = new CE_EmailSender("메일로전송",100);
				break;
			case 2:
				sender = new CE_SMSSender("단문자",80);
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
