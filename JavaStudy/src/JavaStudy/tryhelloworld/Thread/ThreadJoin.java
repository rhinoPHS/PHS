package JavaStudy.tryhelloworld.Thread;
/*
 *  join()�޼ҵ�� �����尡 ���⶧���� ��ٸ��� �Ѵ�.
	�ϴ� 0.5�ʾ� ���鼭 ���ڸ� ����ϴ� MyThread5�� �ۼ��� ������ �ϰڽ��ϴ�.
 */
public class ThreadJoin extends Thread {
	public void run(){
		for(int i = 0; i<5; i++){
			System.out.println("MyThread5 : "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block				e.printStackTrace();
			}
		}
	}//run

}
