package AI_Quest;

public abstract class CE_Content {
	String title;
	int price;
	
	public CE_Content() {
	}
	
	public CE_Content(String title) {
		super();//?
		this.title = title;
	}
	public abstract void totalPrice();
	
	public void show() {
		System.out.println(title+" 비디오의 가격은 "+price+"원 입니다.");
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}