package oop.inheritance;

public class StaticDemo {
	int num;
	static int staticNum;
	public StaticDemo() {
		num++;
		staticNum++;
	}
	public void display() {
		System.out.println("num="+num+",staticnum="+staticNum);;
	}
}
