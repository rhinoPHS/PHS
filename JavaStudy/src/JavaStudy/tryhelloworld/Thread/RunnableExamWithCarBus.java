package JavaStudy.tryhelloworld.Thread;

public class RunnableExamWithCarBus {
	  public static void main(String [] argv){
		    Bus bus = new Bus();
		    /*
		    Runnable�� ������ Ŭ������ �̿��� �����带 �̿��Ҷ���
		    �Ʒ��� ���� Thread�� �����ڿ� �ش� ��ü(bus)�� �����ϸ� �˴ϴ�.
		    ������ �̴�� �����ϸ� ������ �߻��մϴ�.
		    bus�� runnable�� implements�ϰ� ���� �ʱ� �����Դϴ�.
		    */
		    Thread busThread = new Thread(bus);
		    busThread.start();
		  }

}
