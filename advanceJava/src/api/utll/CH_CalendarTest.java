package api.utll;

import java.util.Calendar;
import java.util.GregorianCalendar;

//날짜 시간에 대한 작업
public class CH_CalendarTest {
	public static void main(String[] args) {
		// 현재 날짜와 시간 정보를 표현한 객체
		Calendar cal = new GregorianCalendar();
		System.out.println(cal);
		
		System.out.print(cal.get(Calendar.YEAR)+"년 ");
		System.out.print((cal.get(Calendar.MONTH)+1)+"월 ");
		System.out.print(cal.get(Calendar.DATE)+"일 ");
		System.out.print(cal.get(Calendar.HOUR)+"시 ");
		System.out.print(cal.get(Calendar.MINUTE)+"분 ");
		System.out.println(cal.get(Calendar.SECOND)+"초 ");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTimeInMillis()/1000/60/60/24/30/12);
	
		//오늘부터 9/21까지 dday를 구하기
		//=> 오늘날짜객체, 9/21객체 두 개가 필요
		//1. Calendar객체 두 개 만들기
		
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
