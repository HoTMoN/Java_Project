package AI_Quest;

import java.util.Scanner;

public class Quest2 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("�ʱⰪ�� ������ �Է��ϼ��� : ");
		int a = key.nextInt();
		System.out.print("���������� ������ �Է��ϼ��� : ");
		int b = key.nextInt();
		System.out.print("�������� ������ �Է��ϼ��� : ");
		int c = key.nextInt();
		int sum = 0;
		for(int i = a;i<=b;i=i+c) { 
			sum = sum+i;
		}
		if(sum>=1000) {
			sum = sum+2000;
			System.out.println("������ "+sum+" �Դϴ�");
		}else {
		System.out.println("������ "+sum+" �Դϴ�");
		}
	}
}
