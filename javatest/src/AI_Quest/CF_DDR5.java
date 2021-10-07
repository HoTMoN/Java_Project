package AI_Quest;

public class CF_DDR5 extends CE_Content{
	String company;
	
	public CF_DDR5() {
	}
	
	public CF_DDR5(String title, String company) {
		super(title);
		this.company = company;
	}
	
	@Override
	public void totalPrice() {
		if(company.equals("LG")) {
			price = 100000;
		}else if(company.equals("SAMSUNG")) {
			price = 150000;
		}else if(company.equals("SK")) {
			price = 100000;
		}else {
			price = 50000;
		}
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
}
