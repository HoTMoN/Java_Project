package Practice;

import java.util.Scanner;

public class Quest3_0821 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("1���� ũ�� 10���� ���� ������ �Է��ϼ���");
		int num = key.nextInt();
		int sum = 1;
		if(num<2 | num>9) {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			System.exit(0);
		}else{
			for(int i =2;i<=num;i++) {
				sum =sum*i;
			}
			System.out.println(num+" ! = "+sum);
		}	
	}
}
