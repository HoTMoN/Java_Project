package AI_Quest;

import java.util.Scanner;

public class BE_FareTest {
	public static void main(String[] args) {
		System.out.println("----Menu----------------");
		System.out.println("1. ������ (liter�� 50��)");
		System.out.println("1. ����� (liter�� 45��)");
		System.out.println("1. ������ (liter�� 30��)");
		System.out.println("------------------------");
		System.out.println("�޴��� �����ϼ���=>");
		System.out.println("------------------------");
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		System.out.println("��뷮�� �Է��ϼ���=>");
		int num1 = key.nextInt();
		System.out.println("=========================");
		switch(num) {
			case 1 :
				System.out.println("������ڵ�:"+num);
				System.out.println("�����:"+50*num1);
				System.out.println("�ѻ����:"+(50*num1)*1.05);
				break;
			case 2 :
				System.out.println("������ڵ�:"+num);
				System.out.println("�����:"+45*num1);
				System.out.println("�ѻ����:"+(45*num1)*1.05);
				break;
			case 3 :
				System.out.println("������ڵ�:"+num);
				System.out.println("�����:"+30*num1);
				System.out.println("�ѻ����:"+(30*num1)*1.05);
				break;
			default : 
				System.exit(0);
		}
		System.out.println("=========================");
	}
}
