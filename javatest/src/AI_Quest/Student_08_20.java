package AI_Quest;

public class Student_08_20 {
	private String name;
	private String subject;
	private int fee;
	private double returnFee;
	
	public Student_08_20(String name, String subject, int fee) {
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}
	public void calcReturnFee() {
		System.out.println(subject);
		if(subject == "javaprogram") {
			this.returnFee = fee*25/100;
		
		}else if(subject == "jspprogram") {
			this.returnFee = fee*20/100;
		}else {
			System.out.println("�׷� �������� �����ϴ�.");			
		}
	}
	public void print(){
		System.out.println(this.name+" ���� �������� "+this.subject+" �̰� ������� "+this.fee+" �̸� ȯ�ޱ��� "+this.returnFee+"�Դϴ�.");
	}
}
