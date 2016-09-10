package JavaStudy.tryhelloworld.Exception;
/*
 * 사용자 정의 Exception
	Exception 클래스를 상속 받아 정의한 checked Exception
		반드시 오류를 처리 해야만 하는 Exception
		예외 처리하지 않으면 컴파일 오류를 발생 시킨다.
		
	RuntimeException 클래스를 상속 받아 정의한 unChecked Exception
		예외 처리하지 않아도 컴파일 시에는 오류를 발생시키지 않는다.

RuntimeException을 상속받은 UserException객체
 */
public class UserException extends RuntimeException {
	public UserException(String msg){
		super(msg);
	}
	public UserException(Exception ex){
		super(ex);
	}

}
