package JavaStudy.tryhelloworld;

public class Taxi implements Meter {
	public int BASE_FARE = 3000; // �⺻���(�������̽��� ������ ������ ����� ������ �� �����ϴ�.)
	
	@Override
	  public void start(){
	    System.out.println("������ �����մϴ�.");
	  }

	@Override
	  public int stop(int distance){
	    int fare = BASE_FARE + distance * 2;
	    System.out.println("������ �����մϴ�. ����� " + fare + "�� �Դϴ�.");
	    return fare;
	  }
}
