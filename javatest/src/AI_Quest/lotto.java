package AI_Quest;

import java.util.Random;

public class lotto {
	public static void main(String[] args) {
		Random key = new Random();
		int [] num = new int[7]; 
		int i = 1;
		int j = 1;
		while(i<num.length) {
			if(i==1) {
				num[i] = key.nextInt(45)+1;
				System.out.println(num[1]);
				i=i+1;
				num[i] = key.nextInt(45)+1;
				System.out.println(num[i]);
				}
			if(i>1 & num[i]%num[j]==0) {
				num[i] = key.nextInt(45)+1;
				i=i-1;
				}
			if(i>1 & num[i]%num[j]>0) {
				while(i==j) {
					if(num[i]%num[j]>0) {
						j=j+1;
					}
					if(num[i]%num[j]==0) {
						num[i] = key.nextInt(45)+1;
					}
				}
			}
		}
	}
}