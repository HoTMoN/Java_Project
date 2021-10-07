package AI_Quest;

public class CE_Video extends CE_Content{
	String gerne;

	public CE_Video(String title, String gerne) {
		super(title);
		this.gerne = gerne;
	}
	@Override
	public void totalPrice() {
		if(gerne.equals("new")) {
			price = 2000;
		}else if(gerne.equals("comic")){
			price = 1500;
		}else if(gerne.equals("child")){
			price = 1000;
		}else {
			price = 500;
		}
	}
	
	public String getGerne() {
		return gerne;
	}
	public void setGerne(String gerne) {
		this.gerne = gerne;
	}
	
}
