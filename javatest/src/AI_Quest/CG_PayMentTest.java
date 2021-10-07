package AI_Quest;


public class CG_PayMentTest {

	// main() : �������� ������.
	public static void main(String[] args) throws CG_PayException {
		
		CG_CardPayment card1 = new CG_CardPayment("11����","Javaå",17000,"123-432-111","0070",0);
		payProcess( card1 );		
		System.out.println("-------------------------------------");		
		CG_CashPayment cash1 = new CG_CashPayment("������ũ","������",2400000,"198-32");
		payProcess( cash1 );
		System.out.println("-------------------------------------");	
		
		// �Ʒ��� Exception �߻�  �׽�Ʈ �ڵ���. �ּ��� Ǯ��~ Exception ó���Ǵ��� Ȯ�� �� ������. 
		
		// Exception ���� 1. ���������� ��� �׸� �����ϼ���.
//		CG_CardPayment card2 = new CG_CardPayment("����24","�Ҽ�å",2000,"843-12-434","1234",-2);
//		payProcess( card2 );	
		
		// Exception ���� 2. ���������� ��� �׸� �����ϼ���.
		CG_CashPayment cash2 = new CG_CashPayment("G����","�ڵ���",0,"999-56");
		payProcess( cash2 );		

	}
	
	// payProcess() : �������� ������.
	public static void payProcess( CG_Payment p ) throws CG_PayException {
		p.pay();
		System.out.println( p );		
	}

}
