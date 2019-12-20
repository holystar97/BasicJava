package oop1219;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test06_Gregorian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GregorianCalendar now= new GregorianCalendar();
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DATE));
		
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		
		//2020년이 윤년인지 확인하시오 
		System.out.println(now.isLeapYear(2020));
		
		
		
	}
}
