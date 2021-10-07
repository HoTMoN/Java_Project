package oop.poly;

public class CF_Tea extends CF_Beverage {
	static int amount;

	public CF_Tea() {
		System.out.println(amount);
	}
	
	public CF_Tea(String name) {
		super(name);
		amount++;
		calcPrice();
		
	}
	@Override
	public void calcPrice() {
		if(getName().equals("lemonTea")) {
			price = 1500;
		}else if(getName().equals("ginsengTea")) {
			price = 2000;
		}else if(getName().equals("redginsengTea")) {
			price = 2500;
		}else {
			price = 0;
		}
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
