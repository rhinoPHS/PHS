package JavaStudy.tryhelloworld.Exception;
/*
 * ����� ���� Exception
	Exception Ŭ������ ��� �޾� ������ checked Exception
		�ݵ�� ������ ó�� �ؾ߸� �ϴ� Exception
		���� ó������ ������ ������ ������ �߻� ��Ų��.
		
	RuntimeException Ŭ������ ��� �޾� ������ unChecked Exception
		���� ó������ �ʾƵ� ������ �ÿ��� ������ �߻���Ű�� �ʴ´�.

RuntimeException�� ��ӹ��� UserException��ü
 */
public class UserException extends RuntimeException {
	public UserException(String msg){
		super(msg);
	}
	public UserException(Exception ex){
		super(ex);
	}

}
