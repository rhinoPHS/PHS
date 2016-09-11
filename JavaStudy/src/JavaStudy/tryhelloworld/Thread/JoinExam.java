package JavaStudy.tryhelloworld.Thread;

public class JoinExam {
	public static void main(String[] args) {
		ThreadJoin thread = new ThreadJoin();
		 // Thread 시작 
        thread.start(); 
        System.out.println("Thread가 종료될때까지 기다립니다.");
        try {
            // 해당 쓰레드가 멈출때까지 멈춤
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread가 종료되었습니다."); 
	}

}
/*
Thread가 종료될때까지 기다립니다.
MyThread5 : 0
MyThread5 : 1
MyThread5 : 2
MyThread5 : 3
MyThread5 : 4
Thread가 종료되었습니다.
*/