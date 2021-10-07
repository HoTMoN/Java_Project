package statement;

public class For2DExam03 {
	public static void main(String[] args) {
		int sum = 0;
		for(int row=0;row<=20;row=row+5) {
			for(int i = 1;i<=5;i++) {
				sum = row+i;
				if(sum<(1+(i-1)*6)) {
					System.out.print("");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
/*
 * for(int row=1;row<=5;row++) 
 * for(int i=1;i<=5;i++)
 * if(i<=row)
 * System.out.print("*"); 
 * System.out.println(); 
 * or
 * for(int row=1;row<=5;row++) 
 * for(int i=1;i<=row;i++)
 */
