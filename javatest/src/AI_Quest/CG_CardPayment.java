package AI_Quest;

public class CG_CardPayment extends CG_Payment{
	private String cardNumber;
	private String cardPassword;
	private int monthlyInstallment;

	public CG_CardPayment(String shopName, String productName, long productPrice, String cardNumber,
			String cardPassword, int monthlyInstallment) {
		super(shopName, productName, productPrice);
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.monthlyInstallment = monthlyInstallment;
	}
	@Override
	public String toString() {
		return "�ſ�ī�尡 ���������� ���ҵǾ����ϴ�.\n"+
						"[  �ſ�ī�� ���� ���� ]\n"+
						"������ 	: "+shopName+"\n"+
						"��ǰ�� : "+productName+"\n"+
						"��ǰ���� : "+productPrice+"\n"+
						"�ſ�ī���ȣ : "+cardNumber+"\n"+
						"�Һΰ��� : "+monthlyInstallment;
	}
		
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardPassword() {
		return cardPassword;
	}
	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}
	public int getMonthlyInstallment() {
		return monthlyInstallment;
	}
	public void setMonthlyInstallment(int monthlyInstallment) {
		this.monthlyInstallment = monthlyInstallment;
	}
	@Override
	public void pay() throws CG_PayException {
		if(productPrice<=0 | monthlyInstallment < 0) {
			throw new CG_PayException("�����̳� �Һΰ������� �߸��Ǿ����ϴ�");
		}
	}
}
