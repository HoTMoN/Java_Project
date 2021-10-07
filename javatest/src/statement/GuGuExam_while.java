package statement;

import java.util.Scanner;

public class GuGuExam_while {
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		System.out.println("Ãâ·Â ´Ü:"+num);
		for(int i=1;i<=9;i++) {
		System.out.println(num+"*"+i+"="+(num*i));
		}
	}
}
