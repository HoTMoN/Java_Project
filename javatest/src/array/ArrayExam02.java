package array;



public class ArrayExam02 {
	public static void main(String[] args) {
		//int�� �迭������ �����ϰ�
		//98,100,78,99,86���� �ʱ�ȭ
		//�迭�� ����� ������ �հ�� ����� ����ϱ�
		//[�������]
		//�迭����� ����:______
		//�迭����� ���:______
		int[] myarr = new int[] {98,100,78,99,86};
		int sum = 0;
		double avg = 0.0;
		for(int i=0;i<myarr.length;i++) {
			sum = sum+myarr[i];
		}
		avg = (double)sum/myarr.length;
		System.out.println("�迭����� ����:"+sum);
		System.out.println("�迭����� ���:"+avg);
		
	}

}
