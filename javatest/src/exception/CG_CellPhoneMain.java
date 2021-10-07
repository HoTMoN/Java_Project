package exception;

public class CG_CellPhoneMain {
 
	public static void main(String[] args) { 
		CG_CellPhone myPhone = new CG_CellPhone("SCH-600");
		
		myPhone.charge( 20 );  //20분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300분간 통화를 한다.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40분간 통화를 한다.
		myPhone.printBattery();
		
		try {
			myPhone.call( -20 );  //통화시간이 잘못 입력되었다.
		} catch(IllegalArgumentException e) {
			System.out.println( e.getMessage() ); 
		} 
		
		CG_CellPhone yourPhone = new CG_CellPhone("SCH-600");
		
		if( myPhone.equals(yourPhone) ) {
			System.out.println("동일 모델입니다.");
		} else {
			System.out.println("다른 모델입니다.");
		} 
	} 
}
