package oop.basic;

import java.util.Scanner;

public class PersonTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("********�λ�����ý���*********");
		System.out.println("1. ������");
		System.out.println("2. �����ȸ");
		System.out.println("3. �������");
		System.out.println("4. �������");
		System.out.println("5. ��������ȸ");
		System.out.println("���ϴ� �۾��� �����ϼ���:");
		int choiceJob = key.nextInt();
		switch(choiceJob) {
		case 1:
			System.out.println("===========������===========");
			System.out.println("����:");
			String name = key.next();
			System.out.println("����");
			int age = key.nextInt();
			System.out.println("�ּ�");
			String addr = key.next();
			
			PersonMethod p = new PersonMethod();
			//�ڹٿ����� ������ ������ ���� �ִ� �����ʹ� ������ ������ ó��
			p.name = name; //P.name���� ����� ������Person�� ���� �ִ� ��������̰� = �����ʿ� ������ name ������
			p.age = age;   //Scanner�� ���ؼ� �ܺο��� �Է¹��� ���� ������ ��������
			p.addr = addr; //�������� name�� ����Ǿ� �ִ� ���� heap�� �Ҵ�� Person�� �ɹ������� name�� �����ϰڴٴ� �ǹ�
			System.out.println("����:"+p.name);
			System.out.println("����:"+p.age);
			System.out.println("�ּ�:"+p.addr);
			break;
		case 2:
			System.out.println("============�����ȸ===========");
			break;
		case 3:
			System.out.println("============�������===========");
			break;
			
		}
	}
}
