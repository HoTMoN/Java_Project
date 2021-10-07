package Practice;

public class Quest5_0821 {
	public static void main(String args[]) {
		Quest5_0821 p5=new Quest5_0821();
		System.out.println(p5.gcd(2,5));
		System.out.println(p5.gcd(5,15));
		System.out.println(p5.gcd(250,30));
	}
	public int gcd(int num1,int num2) {
		int c = 1;
			if(num1>num2){
				for(int i = 1;i<=num2;i++) {
					if(num1%i==0&num2%i==0) {
						c = i;
					}
				}
				return c;
			}else {
				for(int i =1;i<=num1;i++) {
					if(num1%i==0&num2%i==0) {
						c = i;
					}
				}
				return c;
			}
			
	}
}