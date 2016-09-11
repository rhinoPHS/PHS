package JavaStudy.tryhelloworld.Thread;

/*
 *  Runable 인터페이스를 구현한 MyThread2 사용하는 방법
	MyThread2는 Thread를 상속받지 않았기 때문에 Thread가 아니다.
	Thread를 생성하고, 해당 생성자에 MyThread2를 넣어서 Thread를 생성한다.
	Thread 클래스가 가진 start()메소드를 호출한다.
 */

public class MyThreadRunnableExam {
	public static void main(String[] args) {
		MyThreadRunnable r1 = new MyThreadRunnable("a");
		MyThreadRunnable r2 = new MyThreadRunnable("b");
		
//		r1.run();          a 후 b 후 main end thread nono
//		r2.run();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		System.out.println("main end");
	}

}
