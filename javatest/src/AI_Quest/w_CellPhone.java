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
			throw new IllegalArgumentException("��ȭ�ð� �Է¿���");
		}
		System.out.println("��ȭ �ð� : "+time+"��");
		if(battery < 0) {
			battery = 0;
		}		
	}
	public void charge(int time) throws IllegalArgumentException{
		battery = battery + (3*time);
		if(time<0) {
			throw new IllegalArgumentException("�����ð� �Է¿���");
		}else {
			System.out.println("���� �ð� : "+time+"��");
		}
		if(battery > 100) {
			battery = 100;
		}
	}
	
	public void printBattery() {
		System.out.println("���� ���͸� �� : "+battery);
	}
	public boolean equals(Object otherObject) {
			return true;
	}
}

