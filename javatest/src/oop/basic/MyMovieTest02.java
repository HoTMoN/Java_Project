package oop.basic;

import java.util.Scanner;

public class MyMovieTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("---------��ȭ���ü��----------");
		System.out.println("1. ��ȭ���");
		System.out.println("2. ��ȭ����");
		System.out.println("3. ��ȭ����");
		System.out.println("4. ��ȭ��ȸ");
		System.out.println("��Ÿ ���ϴ��۾��� �����ϼ���");
		int ch = key.nextInt();
		switch(ch) {
		case 1:
			System.out.println("@@@@@@@@��ȭ���@@@@@@@@");
			System.out.println("����:");
			String title = key.next();
			System.out.println("�帣");
			String genre = key.next();
			System.out.println("����");
			int cost = key.nextInt();
			
			MyMovie m = new MyMovie();
			m.title = title;
			m.genre = genre;
			m.cost = cost;
			System.out.println("����:"+m.title);
			System.out.println("�帣:"+m.genre);
			System.out.println("����:"+m.cost);
			break;
		case 2:
			System.out.println("@@@@@@@@��ȭ����@@@@@@@@");
			break;
		case 3:
			System.out.println("@@@@@@@@��ȭ����@@@@@@@@");
			break;
		case 4:
			System.out.println("@@@@@@@@��ȭ��ȸ@@@@@@@@");
			break;
		}
	}

}
