package statement;

import java.util.Scanner;
//ScroeMultiIfExam�� �����ؼ� ScoreSwitchExam �ۼ��ϱ�
// - if�� ��� switch�� ���
public class ScoreSwitchExam {
	public static void main(String[]args){
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
		System.out.print("�����Է�:");
		int jumsu = key.nextInt();
		if(jumsu<0 | jumsu>100) {
			System.out.println("�߸��Է�");
		}else {
			//hint : ����/���� = ����
			switch(jumsu/10) {
				case 10 :
				case 9 :
					System.out.println("A����");
					break;
				case 8 :
					System.out.println("B����");
					break;
				case 7 :
					System.out.println("C����");
					break;
				case 6 :
					System.out.println("D����");
					break;
				default:
					System.out.println("F����");
			}
		}
	}
}
		
		