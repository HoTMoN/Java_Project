package statement;

import java.util.Random;
import java.util.Scanner;

public class IfExam01 {
	public static void main(String[] args) {
		//�������� �߻���Ű�� 0, ����, ����� �Ǻ��ؼ� ����ϱ�
		//ex) 2144 => ��� -4567 => ���� 0 => 0
		//[�������]
		Random ran1 = new Random();
		int result = ran1.nextInt();
		if(result==0) {
			System.out.println(result + "=> 0");
			}else {
		if(result>0) {
			System.out.println(result + "=> ���");
		}else {
			System.out.println(result + "=> ����");
			
			//Scanner�� �̿��ؼ� �۾�
			Scanner key = new Scanner(System.in);
			System.out.println("���ڸ� �Է��ϼ���:");
			}
		}
	}
}
