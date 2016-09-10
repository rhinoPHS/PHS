package JavaStudy.tryhelloworld.Exception;
//BizService클래스는 업무를 처리하는 메소드를 가지고 있다고 가정한다.
public class UserService {
	public void Usermethod(int i )throws UserException{
		System.out.println("시작");
		if(i<0){
			throw new UserException("매개변수 i는 0이상이어야 합니다.");
		}
		System.out.println("종료");
	}

}
