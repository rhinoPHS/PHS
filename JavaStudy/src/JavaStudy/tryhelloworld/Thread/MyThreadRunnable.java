package JavaStudy.tryhelloworld.Thread;
/*
   Runnable�������̽��� �����ؼ� �����带 ����� ���
   Runable �������̽��� ������ �ִ� run()�޼ҵ带 �����Ѵ�.
 */
public class MyThreadRunnable implements Runnable {
	String str;
	public MyThreadRunnable(String str){
		this.str = str;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<10 ; i++){
			System.out.println(str);
			
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
