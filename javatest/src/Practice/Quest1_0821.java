package Practice;

import java.util.Scanner;

public class Quest1_0821 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���.:");
		int num = key.nextInt();
		if(num <2 | num>9) {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			System.exit(0);
		}else {
			for(int i = 1;i<=9;i++) {
				System.out.println(num+" * "+i+" = "+num*i);
			}
		}
	}
}