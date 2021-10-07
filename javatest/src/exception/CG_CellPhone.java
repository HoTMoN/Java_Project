package exception;

public class CG_CellPhone {
	String model;
	double battery;
	
	public CG_CellPhone(String model) {
		this.model = model;
	}
	public void call(int time) throws IllegalArgumentException{
		battery = battery - (0.5*time);
		if(time<0) {
			throw new IllegalArgumentException("통화시간 입력오류");
		}
		System.out.println("통화 시간 : "+time+"분");
		if(battery < 0) {
			battery = 0;
		}		
	}
	public void charge(int time) throws IllegalArgumentException{
		battery = battery + (3*time);
		if(time<0) {
			throw new IllegalArgumentException("충전시간 입력오류");
		}else {
			System.out.println("충전 시간 : "+time+"분");
		}
		if(battery > 100) {
			battery = 100;
		}
	}
	
	public void printBattery() {
		System.out.println("남은 배터리 양 : "+battery);
	}
	public boolean equals(Object otherObject) {
		boolean state = false;
		//Object 타입의 객체를 입력받고 , 입력받은 객체가 CellPhone 타입의 클래스이면서 모델 번호가 같은 경우에 true 를 리턴한다.
		if(otherObject instanceof CG_CellPhone) {
			//매개변수로 전달받은 객체가 Object이므로 Cellphone의 맴버를 사용하기 위해서 캐스팅
			CG_CellPhone obj = (CG_CellPhone)otherObject;
			if(this.model.equals(obj.model)) {
				state = true;
			}
		}
		return state;
	}		
}

