package array;

public class ArgsExam {
	public static void main(String[] args) {
		//���ڸ� 5�� �Է� �޾� �հ� ����� ���ؼ� ����ϼ���.
		// 100 150 200 250 300 ����
		// - �����ϱ�
		// - for������ �۾�
		int sum = 0; 
		double avg = 0;
		for(int i = 0;i<args.length;i++) {
			sum = sum + Integer.parseInt(args[i]);
		}
		avg = sum/args.length;
		System.out.println("��: "+sum);
		System.out.println("��� :"+avg);
	}
}
