package oop.inheritance;

import java.util.Scanner;

public class w_TestAccount {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		w_CheckingAccount acc1 = new w_CheckingAccount("111-222-333","장동건",1000000,"1234-5647-8888");
		acc1.pay("1234-5678-8888", 500000);
		System.out.println("현재잔액====>"+acc1.getBalance());
		System.out.print("카드번호:");
		String num = key.next();
		acc1.pay(num, 500000);
		System.out.println("현재잔액====>"+acc1.getBalance());
	}
}
