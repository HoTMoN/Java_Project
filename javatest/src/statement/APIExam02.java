package statement;

import java.util.Random;

public class APIExam02 {
	public static void main(String[] args) {
		//RandomŬ������ nextInt()�޼ҵ带 ȣ���Ͽ� �������� ������ ���� ������·� ����ϼ���.
		// - RandomŬ���� �������� : rand
		// [�������]
		//������:______
		
		Random rand = new Random();
		int result = rand.nextInt();
		
		System.out.println("������" + result);
		
		//1���� 100���� �������� ���
		//[�������]]
		//������:________
		//nextInt(����)
		//0�� ����, ����ڰ� �Է��� ���ڴ� ���Ե��� �ʴ´�.
		Random rand1 = new Random();
		int result2 = rand1.nextInt(100)+1;
		System.out.println("������: "+result2);
		}
}
