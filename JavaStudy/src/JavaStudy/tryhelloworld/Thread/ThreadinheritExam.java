package JavaStudy.tryhelloworld.Thread;

public class ThreadinheritExam {
	public static void main(String[] args) {
		MyThreadinherit t1 = new MyThreadinherit("A");
		MyThreadinherit t2 = new MyThreadinherit("B");
		
		t1.start();    //run�� �ƴ϶� start
		t2.start();
		System.out.println("!!!!");
	}

}
