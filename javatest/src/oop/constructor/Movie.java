package oop.constructor;

//Movie클래스에 생성자메소드를 추가하고 MovieTest
//클래스에서 Movie클래스에 추가된 생성자메소드를 호출해서
//작업하도록 처리하기

public class Movie{
	private String title;
	private String genre;
	public Movie() {
		
	}
	public Movie(String title,String genre) {
		this.title = title;
		this.genre = genre;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void play() {
			System.out.println(this.title+"("+this.genre+") 상영중입니다.");
	}
}