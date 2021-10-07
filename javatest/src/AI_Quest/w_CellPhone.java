package AI_Quest;

public class w_CellPhone {
	String model;
	double battery;
	
	public w_CellPhone(String model) {
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
			return true;
	}
}

