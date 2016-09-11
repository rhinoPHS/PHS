package JavaStudy.tryhelloworld.Thread;
/*
 * �ڹٿ��� Thread�� ����� ����� ũ�� Thread Ŭ������ ��ӹ޴� ����� Runnable�������̽��� �����ϴ� ����� �ִ�.
Thread�� ��� �޾Ƽ� �����带 �����ϴ� ���
java.lang.ThreadŬ������ ��ӹ޴´�. �׸��� Thread�� ������ �ִ� run()�޼ҵ带 �������̵��Ѵ�.
10�� �ݺ��ϸ鼭 str�� ����ϴ�.
 */
public class MyThreadinherit extends Thread {
	String str;
	public MyThreadinherit(String str){
		this.str=str;
	}
	@Override
	public void run() {
		for(int i = 0; i<10; i++){
			System.out.println(str);
			
			try {
                //��ǻ�Ͱ� �ʹ� ������ ������ �������� �� Ȯ�� �� �� ��� Thread.sleep() �޼��带 �̿��ؼ� ���ݾ� 
                //�����ٰ� ����� �� �ְ��Ѵ�. 
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
