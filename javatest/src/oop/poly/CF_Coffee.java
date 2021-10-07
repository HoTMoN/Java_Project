package oop.poly;

public class CF_Coffee extends CF_Beverage {
	static int amount;

	public CF_Coffee() {
		super();
	}
	
	public CF_Coffee(String name) { //객체가 생성된 것이 커피를 주문하는것과 동일
		super(name);
		//amount = amount + 1;
		amount++;  // 수량누적
		calcPrice(); // 가격계산
	}
	@Override
	public void calcPrice() {
		if(getName().equals("Cappuccino")) {
			price = 3000;
		}else if(getName().equals("CafeLatte")) {
			price = 2500;
		}else if(getName().equals("Americano")) {
			price = 1500;
		}else {
			price = 0;
		}
	}

	public static void main(String[] args) {
		
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}

