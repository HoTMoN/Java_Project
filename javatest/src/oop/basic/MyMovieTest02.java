package oop.basic;

import java.util.Scanner;

public class MyMovieTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("---------영화등록체계----------");
		System.out.println("1. 영화등록");
		System.out.println("2. 영화수정");
		System.out.println("3. 영화삭제");
		System.out.println("4. 영화조회");
		System.out.println("기타 원하는작업을 선택하세요");
		int ch = key.nextInt();
		switch(ch) {
		case 1:
			System.out.println("@@@@@@@@영화등록@@@@@@@@");
			System.out.println("제목:");
			String title = key.next();
			System.out.println("장르");
			String genre = key.next();
			System.out.println("가격");
			int cost = key.nextInt();
			
			MyMovie m = new MyMovie();
			m.title = title;
			m.genre = genre;
			m.cost = cost;
			System.out.println("제목:"+m.title);
			System.out.println("장르:"+m.genre);
			System.out.println("가격:"+m.cost);
			break;
		case 2:
			System.out.println("@@@@@@@@영화수정@@@@@@@@");
			break;
		case 3:
			System.out.println("@@@@@@@@영화삭제@@@@@@@@");
			break;
		case 4:
			System.out.println("@@@@@@@@영화조회@@@@@@@@");
			break;
		}
	}

}
