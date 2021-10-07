package Practice;

public class Quest2_0821 {
	public static void main(String[] args) {
		for(int i = 2;i<=50;i++) {
			int k = 0;
			for(int j = 2;j<=i;j++) {
				if(i%j==0) {
					k = k+1;
				}else {
					k = k-1;
				}
			}
			if(k+i==3) {
				System.out.println(i);
			}
		}
	}
}
