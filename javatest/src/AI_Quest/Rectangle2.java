package AI_Quest;

public class Rectangle2 {
	private String Color;
	private int width;
	private int length;
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setColor() {
	}
	public int area() {
		return this.length*this.width;
	}
	public int perimeter() {
		return 2*(this.length+this.width);
	}
}
