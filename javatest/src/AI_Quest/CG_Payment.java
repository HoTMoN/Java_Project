package AI_Quest;

public abstract class CG_Payment implements CG_Payable {
	protected String shopName;
	protected String productName;
	protected long productPrice; 
	
	public CG_Payment(String shopName, String productName, long productPrice) {
		super();
		this.shopName = shopName;
		this.productName = productName;
		this.productPrice = productPrice;

	}
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	
	

}
