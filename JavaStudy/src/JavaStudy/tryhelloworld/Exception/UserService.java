package JavaStudy.tryhelloworld.Exception;
//BizServiceŬ������ ������ ó���ϴ� �޼ҵ带 ������ �ִٰ� �����Ѵ�.
public class UserService {
	public void Usermethod(int i )throws UserException{
		System.out.println("����");
		if(i<0){
			throw new UserException("�Ű����� i�� 0�̻��̾�� �մϴ�.");
		}
		System.out.println("����");
	}

}
