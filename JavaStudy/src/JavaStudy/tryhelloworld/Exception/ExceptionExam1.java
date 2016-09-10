package JavaStudy.tryhelloworld.Exception;

public class ExceptionExam1 {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try{
			int k = i / j;
			System.out.println(k);
		}catch(ArithmeticException e){  //어떤 Exception이 발생할지 모를 때는 catch(Exception  e)와 같이 Exception 클래스를 이용
			System.out.println("0으로 나눌 수 없습니다 :"+e.toString());
		}finally {
			System.out.println("오류가 발생하든 안하든 무조건 실행되는 블록입니다.");
		}
		System.out.println("출력안됨");
		// finally 블록을 사용하는 것과 사용하지 않고 그냥 다음 줄에 코들르 적었을 때 차이
		// 경우에 따라서 차이가 있을 수 있다. try-catch 블록에서 return문이 있는 경우에도 finally 블록은 무조건 실행된다
		// 하지만 그냥 블록은 실행되지 않는다.
	}

}
//Exception 처리하지 않았을때는 프로그램이 강제 종료되었는데 catch라는 블록으로 Exception을 처리하니 강제종료되지 않고 잘 실행되는 것을 알 수 있다.
//
//try블록에서 여러종류의 Exception이 발생한다면 catch라는 블록을 여러개 둘 수 있다.
//
//Exception클래스들은 모두 Exception클래스를 상속받으므로, 예외클래스에 Exception을 두게 되면 어떤 오류가 발생하든지 간에 하나의 catch블록에서 모든 오류를 처리할 수 있다.