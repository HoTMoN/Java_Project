package array;

public class Array2DExam01 {
	public static void main(String[] args) {
		/*
		 * int[][] data = new int[][] { 
		 * {1, 2, 3, 4, 5}, 
		 * {6, 7, 8, 9, 10}, 
		 * {11, 12, 13, 14, 15}, 
		 * {16, 17, 18, 19, 20}, 
		 * {21, 22, 23, 24, 25} 
		 * };
		 */
		int[][] data = new int[5][5];
		int num = 1;
		//2�����迭�� ���� ����
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data.length;j++) {
				data[i][j] = num;
				num++;
			}
		}
		
		//2�����迭�� ����� ���� ������ ����ϱ�
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data.length;j++) {
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
