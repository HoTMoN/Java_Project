package AI_Quest;

public class CG_CashPayment extends CG_Payment{
	private String cashReceiptNumber;

	public CG_CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber) {
		super(shopName, productName, productPrice);
		this.cashReceiptNumber = cashReceiptNumber;
	}
	@Override
	public String toString() {
		return  "현금이 정상적으로 지불되었습니다.\n"+
				"[  현금 결제 정보 ]\n"+
				"상점명 : "+shopName+"\n"+
				"상품명 : "+productName+"\n"+
				"상품가격 : "+productPrice+"\n"+
				"현금영수증번호 : "+cashReceiptNumber;
	}
	public String getCashReceiptNumber() {
		return cashReceiptNumber;
	}
	public void setCashReceiptNumber(String cashReceiptNumber) {
		this.cashReceiptNumber = cashReceiptNumber;
	}

	@Override
	public void pay() throws CG_PayException {
		if(productPrice<=0) {
			throw new CG_PayException("가격이 잘못되었습니다");
		}
	}
}
