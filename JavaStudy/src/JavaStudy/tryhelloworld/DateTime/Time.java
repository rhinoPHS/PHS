package JavaStudy.tryhelloworld.DateTime;

import java.time.*;

/*
 * Java���� �����ϴ� Date, Time API�� ������ ��� ������ ������ �������� �������� ������ �־���. 
 * JDK �ھ�� �̷� ���������� �ذ��ϰ� �� ���� �������� API���� �����ϱ� ���� ���Ӱ� �� �������� Date, Time API�� Java SE 8���� �����Ѵ�.
 * 
		���ο� API�� �ٽ� Ŭ������ ������Ʈ�� �����ϱ� ���� �پ��� factory �޼��带 ����Ѵ�.
		������Ʈ �ڱ� �ڽ��� Ư�� ��Ҹ� ������ ������Ʈ�� ������ ��� of �޼��带 ȣ���ϸ� �ǰ�, �ٸ� Ÿ������ ������ ��쿡�� from �޼��带 ȣ���ϸ� �ȴ�.
		LocalDateTime Ŭ������ �̿��ؼ� ���� �ð� time��ü ����� ���
		now�� ���� �ð��� ���Ѵ�.
 */
public class Time {

	public static void main(String[] args) {
        LocalDateTime timePoint = LocalDateTime.now(); // ������ ��¥�� �ð�

        // 2012�� 12�� 12���� �ð��� ���� ������ ������ LocalDate��ü�� ����� ���  
        LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12); // 2012-12-12 from values

            // 17�� 18�п� ���� LocalTime��ü�� ���Ѵ�.
        LocalTime lt1 = LocalTime.of(17, 18); // 17:18 (17�� 18��)the train I took home today

        // 10�� 15�� 30�ʶ�� ���ڿ��� ���� LocalTime��ü�� ���Ѵ�.
        LocalTime lt2 = LocalTime.parse("10:15:30"); // From a String
		
        LocalDate theDate = timePoint.toLocalDate();
        Month month = timePoint.getMonth();
        int day = timePoint.getDayOfMonth();
        int hour = timePoint.getHour();
        int minute = timePoint.getMinute();
        int second = timePoint.getSecond();
        // ���� ���ڷ� ����Ѵ� 1���� 1���� �����ϴ� ���� �� �� �ֽ��ϴ�. 
        System.out.println(month.getValue() + "/" + day + "  " + hour + ":" + minute + ":" + second);
	}

}
