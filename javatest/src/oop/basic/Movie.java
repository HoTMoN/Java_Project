 package oop.basic;

public class Movie {
	private String title;
	private String genre;
	
	public void setTitle(String title) {
		this.title = title;
		System.out.print(title);
	}
	public void setGenre(String genre) {
		this.genre = genre;
		System.out.print("("+genre+")");
	}
	public void play() {
			System.out.println(" 상영중입니다.");
	}
	public String getTitle() {
		return this.title;
	}
	public String getGenre() {
		return this.genre;
	}

}
