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
			System.out.println("그런 과정명은 없습니다.");			
		}
	}
	public void print(){
		System.out.println(this.name+" 씨의 과정명은 "+this.subject+" 이고 교육비는 "+this.fee+" 이며 환급금은 "+this.returnFee+"입니다.");
	}
}
