package api.utll;

import java.util.Calendar;
import java.util.GregorianCalendar;

//��¥ �ð��� ���� �۾�
public class CH_CalendarTest {
	public static void main(String[] args) {
		// ���� ��¥�� �ð� ������ ǥ���� ��ü
		Calendar cal = new GregorianCalendar();
		System.out.println(cal);
		
		System.out.print(cal.get(Calendar.YEAR)+"�� ");
		System.out.print((cal.get(Calendar.MONTH)+1)+"�� ");
		System.out.print(cal.get(Calendar.DATE)+"�� ");
		System.out.print(cal.get(Calendar.HOUR)+"�� ");
		System.out.print(cal.get(Calendar.MINUTE)+"�� ");
		System.out.println(cal.get(Calendar.SECOND)+"�� ");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTimeInMillis()/1000/60/60/24/30/12);
	
		//���ú��� 9/21���� dday�� ���ϱ�
		//=> ���ó�¥��ü, 9/21��ü �� ���� �ʿ�
		//1. Calendar��ü �� �� �����
		
		Calendar today = new GregorianCalendar();
		Calendar dday = new GregorianCalendar();
		//
		
		
		
//		Calendar cal1 = new GregorianCalendar();
//		Calendar cal2 = new GregorianCalendar();
//		cal1.set(2021, 8, 27);
//		cal2.set(2021, 9, 21);
//		System.out.println((cal2.getTimeInMillis()-cal1.getTimeInMillis())/1000/60/60/24);
		
		
	}

}
