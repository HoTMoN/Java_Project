package oop.basic;

public class MyMovieTest {
	public static void main(String[] args) {
		MyMovie m1 = new MyMovie();
		m1.title = "변호인";
		m1.genre = "드라마";
		m1.cost = 9000;
		System.out.println("제목:"+m1.title+", 장르:"+m1.genre+", 가격:"+m1.cost);
		
		
		MyMovie m2 = new MyMovie();
		m2.title = "Frozen2";
		m2.genre = "애니메이션";
		m2.cost = 10000;
		System.out.println("제목:"+m2.title+", 장르:"+m2.genre+", 가격:"+m2.cost);
	}

}
