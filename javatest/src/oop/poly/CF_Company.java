package oop.poly;

public class CF_Company {
	public static void main(String[] args) {
		CF_Secretary sec = new CF_Secretary("Hilery", 1, "secretary", 800);
		CF_Sales sal = new CF_Sales("Clinten", 2, "sales", 1200);
		System.out.println("name \t\t department \t salary");
		System.out.println("------------------------------------------");
		System.out.println(sec.getName() + " \t\t " + sec.getDepartment()
				+ " \t " + sec.getSalary());
		System.out.println(sal.getName() + " \t " + sal.getDepartment()
				+ " \t\t " + sal.getSalary());
		System.out.println();
		System.out.println("�μ�Ƽ�� 100 ����");
		System.out.println();
		sec.incentive(100);
		sal.incentive(100);
		System.out.println("name \t\t department \t salary \t tax");
		System.out
				.println("-----------------------------------------------------------");
		System.out.println(sec.getName() + " \t\t " + sec.getDepartment()
				+ " \t " + sec.getSalary() + " \t\t " + sec.tax());
		System.out.println(sal.getName() + " \t " + sal.getDepartment()
				+ " \t\t " + sal.getSalary() + " \t\t " + sal.tax());

	}
}