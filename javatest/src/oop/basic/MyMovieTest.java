package oop.basic;

public class MyMovieTest {
	public static void main(String[] args) {
		MyMovie m1 = new MyMovie();
		m1.title = "��ȣ��";
		m1.genre = "���";
		m1.cost = 9000;
		System.out.println("����:"+m1.title+", �帣:"+m1.genre+", ����:"+m1.cost);
		
		
		MyMovie m2 = new MyMovie();
		m2.title = "Frozen2";
		m2.genre = "�ִϸ��̼�";
		m2.cost = 10000;
		System.out.println("����:"+m2.title+", �帣:"+m2.genre+", ����:"+m2.cost);
	}

}
