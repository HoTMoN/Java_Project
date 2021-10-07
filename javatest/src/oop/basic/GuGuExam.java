package oop.basic;

import java.util.Scanner;

public class GuGuExam {
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		int dan = key.nextInt();
		System.out.println("Ãâ·Â ´Ü:"+dan);
		
		MyMethodUtil obj = new MyMethodUtil();
		obj.printGuGu(dan);
	}
}
