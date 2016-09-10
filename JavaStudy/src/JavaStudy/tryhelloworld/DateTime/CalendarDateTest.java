package JavaStudy.tryhelloworld.DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDateTest {
		  public static void main(String[] args){
			    SimpleDateFormat ft = new SimpleDateFormat("yyyy³â M¿ù ddÀÏ");
			    Calendar cal = Calendar.getInstance();
			    cal.add(cal.DATE,100);
			    String st = ft.format(cal.getTime());
			    System.out.println(st);
		  }
}
