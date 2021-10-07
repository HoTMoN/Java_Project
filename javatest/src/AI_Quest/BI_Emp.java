package AI_Quest;

public class BI_Emp {
	private String id;
	private String name;
	private int baseSalary;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getBaseSalary() {
		return this.baseSalary;
	}
	public String toString() {
		return (this.name+"("+this.id+") "+"사원의 기본급은 "+this.baseSalary+"원 입니다.");
	}
	public double getSalary(int bonus) {
		return (this.baseSalary+this.baseSalary*bonus);
	}
}
