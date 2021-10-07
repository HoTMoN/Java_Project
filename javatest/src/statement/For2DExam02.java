package statement;

public class For2DExam02 {
	public static void main(String[] args) {
		int sum = 0;
		for (int row = 64; row <= 84; row = row + 5) {
			for (int i = 1; i <= 5; i++) {
				sum = row + i;
				if (((sum - 64) + 5) % 6 == 0) {
					System.out.print("*" + "\t");
				} else {
					System.out.print((char) sum + "\t");
				}
			}
			System.out.println();

		}
	}
}
/*
 * //´ä ±âÁØ
 * 
 * char alpha ='A'; for(int row = 1;row<=5;row++) { for(int i=1,i<=5,i++) {
 * if(row==i) { System.out.print("\t"); }else { System.out.print(alpha+"\t"); }
 * alpha++; } System.out.println();
 * 
 * } } }
 */