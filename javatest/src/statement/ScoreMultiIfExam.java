package statement;

import java.util.Scanner;

public class ScoreMultiIfExam {
	public static void main(String[]args){
		//����if, if���� ��ø
		//0 ~ 59 : F����
		//60 ~ 69 : D����
		//70 ~ 79 : C����
		//80 ~ 89 : B����
		//90 ~ 100 : A����
		//110 or -40 : �߸��Է�
		// [�������]
		//����:___
		//____����
		//Scanner Ŭ������ �̿��ؼ� �Է¹޵���
		//0���� 100���� �ԷµǸ� ������, ���� ���ڴ� �߸��Է����� ��µǵ��� ����
		//���� �����ϱ�
		
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		
		System.out.println("����:"+num);
		if(num<0) {
			System.out.println("�߸��Է�");
		}else if(num<60) {
			System.out.println("F����");
		}else if(num<70) {
			System.out.println("D����");
		}else if(num<80) {
			System.out.println("C����");
		}else if(num<90) {
			System.out.println("B����");
		}else if(num<=100) {
			System.out.println("A����");
		}else if(num>100) {
			System.out.println("�߸��Է�");
		}
	}
}
		
		
		