package statement;
//while���� do-while���� ������

public class DoWhileTest01 {
	public static void main(String[] args) {
		int num = 10;
		while(num<10) {
			//while���� ���� ��� ������ �������� ������ ������ �ڵ尡 �� ���� ������� �ʴ´�.
			System.out.println("while�� ����ϴ� ��� �ڹ����α׷���:"+num);
			num++;
		}
		//���� �Ǵ��ϴ� ������ �� �ȿ� �־���ϴ� ��Ȳ
		num = 5;
		do {
			System.out.println("while�� ����ϴ� ���!! �ڹ����α׷���:"+num);
		}while(num>11);
	}
}