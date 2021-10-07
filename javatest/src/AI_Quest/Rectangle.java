package AI_Quest;

public class Rectangle {
	
	private int width;
	private int height;
	private int area;
	private String color; // ="Èò»ö" °¡´É!;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Rectangle() {
	}
	public Rectangle(int width, int height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	public void calculateArea() {
		area = height*width;
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.color = "Èò»ö";
	}	
}
