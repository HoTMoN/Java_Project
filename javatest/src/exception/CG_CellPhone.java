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
		boolean state = false;
		//Object Ÿ���� ��ü�� �Է¹ް� , �Է¹��� ��ü�� CellPhone Ÿ���� Ŭ�����̸鼭 �� ��ȣ�� ���� ��쿡 true �� �����Ѵ�.
		if(otherObject instanceof CG_CellPhone) {
			//�Ű������� ���޹��� ��ü�� Object�̹Ƿ� Cellphone�� �ɹ��� ����ϱ� ���ؼ� ĳ����
			CG_CellPhone obj = (CG_CellPhone)otherObject;
			if(this.model.equals(obj.model)) {
				state = true;
			}
		}
		return state;
	}		
}

