package JavaStudy.tryhelloworld.Thread;

public class JoinExam {
	public static void main(String[] args) {
		ThreadJoin thread = new ThreadJoin();
		 // Thread ���� 
        thread.start(); 
        System.out.println("Thread�� ����ɶ����� ��ٸ��ϴ�.");
        try {
            // �ش� �����尡 ���⶧���� ����
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread�� ����Ǿ����ϴ�."); 
	}

}
/*
Thread�� ����ɶ����� ��ٸ��ϴ�.
MyThread5 : 0
MyThread5 : 1
MyThread5 : 2
MyThread5 : 3
MyThread5 : 4
Thread�� ����Ǿ����ϴ�.
*/