package JavaStudy.tryhelloworld.Thread;
/*
 *  join()메소드는 쓰레드가 멈출때까지 기다리게 한다.
	일단 0.5초씩 쉬면서 숫자를 출력하는 MyThread5를 작성해 보도록 하겠습니다.
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
