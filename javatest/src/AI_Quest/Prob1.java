package AI_Quest;

public class Prob1 {
	public static void main(String[] args) {
		BI_Emp emp = new BI_Emp();
		emp.setId("12345");
		emp.setName("ȫ�浿");
		emp.setBaseSalary(50000);
		System.out.println( emp.toString() );
		System.out.println( "���� = " + emp.getSalary( 30 ) );
		
	}
}
 