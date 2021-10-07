package oop.poly;

public abstract class CF_Beverage {
	private String name;
	protected int price;
	
	public CF_Beverage() {	
	}
	
	public CF_Beverage(String name) {
		this.name = name;
	}
	public abstract void calcPrice();
	
	public void print() {
		System.out.println(name+" 이며, 가격은 "+price);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
