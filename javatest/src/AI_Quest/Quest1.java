package AI_Quest;

import java.util.Scanner;

public class Quest1 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("1���� ũ�� 10���� ���� ������ �Է��ϼ���");
		int num = key.nextInt();
		if(num<2 | num>9) {
			System.out.println("�߸��� ���ڸ� �Է��߽��ϴ�.");
			System.exit(0);
		}else {for(int i=1; i<=9; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
			}	
		}
	}
}
