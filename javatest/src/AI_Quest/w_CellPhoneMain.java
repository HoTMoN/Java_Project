package AI_Quest;

public class w_CellPhoneMain {
 
	public static void main(String[] args) { 
		w_CellPhone myPhone = new w_CellPhone("SCH-600");
		
		myPhone.charge( 20 );  //20�а� ������ �Ѵ�.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50�а� ������ �Ѵ�.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();
		
		try {
			myPhone.call( -20 );  //��ȭ�ð��� �߸� �ԷµǾ���.
		} catch(IllegalArgumentException e) {
			System.out.println( e.getMessage() ); 
		} 
		
		w_CellPhone yourPhone = new w_CellPhone("SCH-600");
		
		if( myPhone.equals(yourPhone) ) {
			System.out.println("���� ���Դϴ�.");
		} else {
			System.out.println("�ٸ� ���Դϴ�.");
		} 
	} 
}
