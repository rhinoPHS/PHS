package JavaStudy.tryhelloworld.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * ��¥�� �ð��� ���ϱ� ���� Ŭ���� Date Ŭ����
DateŬ������ JDK 1.0�� ���������, CalendarŬ������ JDK1.1�� ���������.
Date�� ����ȭ�� ���� �κ��� ������� �ʾҴ�.
����ȭ��, ������ ���� �ð�, ��ȭ(��, �޷�, �� ��) ��� ���Ͽ� ����ϴ� ���α׷����� ����ȭ�� ���� ���α׷����̶�� �մϴ�.
DateŬ������ ���� ��κ��� �����ڿ� �޼ҵ尡 Deprecated�Ǿ� �ִ�.
Deprecated�� ���� ������ ������ ���ϰų� ������ ���� �� ������ ������� ����� ���Դϴ�.
�⺻ �����ڸ� �̿��� DateŬ���� ����
�⺻ �����ڷ� Date�ν��Ͻ��� ����� �Ǹ� ���� �ð��� ��¥ ������ Date�ν��Ͻ��� ������ �˴ϴ�.
 */
public class DateExam {

	public static void main(String[] args) {
		Date date = new Date();
		
		//toString()�޼ҵ带 �̿��Ͽ� ���� �ð��� ���ڿ��� ���մϴ�.
		System.out.println(date.toString());
		
		/*
		   java.util.SimpleDateFormat Ŭ������ �̿��ؼ� ���ϴ� ���·� ����ϴ� ���
			yyyy�� ��, MM�� ��, dd�� ���� ǥ���Ѵ�.
			hh�� �ð�, mm�� ��, ss�� �ʸ� ǥ���ϸ� a�� ����/���� �� ǥ���Ѵ�.
			zzz�� TimeZone�� ��Ÿ����. �ѱ��� ��� �ѱ�ǥ�ؽ� KST�� TimeZone�� �ش��ϴ� ���Դϴ�.
		 */
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd.E 'at' HH:mm:ss a zzz");
		System.out.println(ft.format(date));
		
		//���� �ð��� Long������ ���ϴ� ���
		System.out.println(date.getTime());
		// System�� ������ �ִ� currentTimeMillis()�޼ҵ带 �̿��ص� �˴�
		long today = System.currentTimeMillis();
		System.out.println(today);
		
		System.out.println(today-date.getTime());
		
		//Date date1 = new Date(97, 1, 23); // ���� �� ��...

	} 

}
