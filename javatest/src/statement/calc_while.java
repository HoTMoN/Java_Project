package statement;
// 8�� 16�� ���ð���:calc�� �����ϰ� ���Ḧ �����ϱ� ������ �޴��� ��µǸ鼭 ���õ� �� �ֵ��� �����ϱ�
// while or do while�� ���
import java.util.Scanner;

public class calc_while {
	public static void main(String[] args) {
		System.out.println("***********�̴ϰ���********");
		System.out.println("1. ���ϱ�");
		System.out.println("2. ���ϱ�");
		System.out.println("3. ����");
		System.out.println("4. ������");
		System.out.println("����");
		System.out.print("�����ڸ� �����ϼ���.");
		Scanner key = new Scanner(System.in);
		int Cal = key.nextInt();
		while(Cal <=4) {
		System.out.print("���ڸ� �Է��ϼ���");
		int num1 = key.nextInt();
		int num2 = key.nextInt();
		int result = 0; // ���� ����� ������ ����
						// �� �ȿ� ����Ǵ� ������ ���ú����̸� ���ú����� �ݵ�� �ʱⰪ�� �־�� �Ѵ�.
		switch(Cal) {
			case 1 :
				result = num1+num2;
				break;
			case 2 :
				result = num1*num2;
				break;
			case 3 :
				result = num1-num2;
				break;
			case 4 :
				result = num1/num2;
				break;
		}
		System.out.println("�����=>"+result);
		}
	}
}
		/*
		int A = num1+num2;
		int B = num1*num2;
		int C = num1-num2;
		int D = num1/num2;
		switch(Cal) {
		case 1 :
			System.out.println("�����=>"+ A);
			break;
		case 2 : 
			System.out.println("�����=>"+ B);
			break;
		case 3 :
			System.out.println("�����=>"+ C);
			break;
		case 4 : 
			System.out.println("�����=>"+ D);
			break;
		default :
			System.out.println("ERROR");
		}
		
	}

}
*/