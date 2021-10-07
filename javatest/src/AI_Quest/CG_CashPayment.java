package AI_Quest;

public class CG_CashPayment extends CG_Payment{
	private String cashReceiptNumber;

	public CG_CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber) {
		super(shopName, productName, productPrice);
		this.cashReceiptNumber = cashReceiptNumber;
	}
	@Override
	public String toString() {
		return  "������ ���������� ���ҵǾ����ϴ�.\n"+
				"[  ���� ���� ���� ]\n"+
				"������ : "+shopName+"\n"+
				"��ǰ�� : "+productName+"\n"+
				"��ǰ���� : "+productPrice+"\n"+
				"���ݿ�������ȣ : "+cashReceiptNumber;
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
			throw new CG_PayException("������ �߸��Ǿ����ϴ�");
		}
	}
}
