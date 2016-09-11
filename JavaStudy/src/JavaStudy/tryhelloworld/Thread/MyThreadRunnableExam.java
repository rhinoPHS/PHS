package JavaStudy.tryhelloworld.Thread;

/*
 *  Runable �������̽��� ������ MyThread2 ����ϴ� ���
	MyThread2�� Thread�� ��ӹ��� �ʾұ� ������ Thread�� �ƴϴ�.
	Thread�� �����ϰ�, �ش� �����ڿ� MyThread2�� �־ Thread�� �����Ѵ�.
	Thread Ŭ������ ���� start()�޼ҵ带 ȣ���Ѵ�.
 */

public class MyThreadRunnableExam {
	public static void main(String[] args) {
		MyThreadRunnable r1 = new MyThreadRunnable("a");
		MyThreadRunnable r2 = new MyThreadRunnable("b");
		
//		r1.run();          a �� b �� main end thread nono
//		r2.run();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		System.out.println("main end");
	}

}
