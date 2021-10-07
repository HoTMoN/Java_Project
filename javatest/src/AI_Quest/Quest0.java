package AI_Quest;

public class Quest0 {
	public static void main(String[] args) {
		int sum = 0;
		int evensum = 0;
		int oddsum = 0;
		for (int i=1; i<=1000; i=i+1) {
			sum = sum+i;
				if(i%2==0) {
					evensum = evensum+i;
				}else {
					oddsum = oddsum+i;
				}
		}
		System.out.println("ÃÑÇÕ:"+sum);
		System.out.println("Â¦¼öÇÕ:"+evensum);
		System.out.println("È¦¼öÇÕ:"+oddsum);
	}

}
