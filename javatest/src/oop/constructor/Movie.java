package oop.constructor;

//MovieŬ������ �����ڸ޼ҵ带 �߰��ϰ� MovieTest
//Ŭ�������� MovieŬ������ �߰��� �����ڸ޼ҵ带 ȣ���ؼ�
//�۾��ϵ��� ó���ϱ�

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
			System.out.println(this.title+"("+this.genre+") �����Դϴ�.");
	}
}