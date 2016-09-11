package JavaStudy.tryhelloworld.Thread;
/*
   Runnable인터페이스를 구현해서 쓰레드를 만드는 방법
   Runable 인터페이스가 가지고 있는 run()메소드를 구현한다.
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
