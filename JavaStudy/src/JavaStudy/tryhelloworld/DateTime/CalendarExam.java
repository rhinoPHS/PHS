package JavaStudy.tryhelloworld.DateTime;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); // 월은 0부터 시작합니다
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(cal.HOUR,5);
		//Calendar.DATE
		System.out.println(cal.get(Calendar.HOUR));
	}

}
