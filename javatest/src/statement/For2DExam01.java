package statement;

public class For2DExam01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int row=0;row<=20;row=row+5) {
			for(int i = 1;i<=5;i++) {
				sum = row+i;
				System.out.print(sum+"\t");
				}
			System.out.println();
			
		}
	}
}

