package JavaStudy.tryhelloworld.Exception;

public class ExceptionExam1 {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try{
			int k = i / j;
			System.out.println(k);
		}catch(ArithmeticException e){  //� Exception�� �߻����� �� ���� catch(Exception  e)�� ���� Exception Ŭ������ �̿�
			System.out.println("0���� ���� �� �����ϴ� :"+e.toString());
		}finally {
			System.out.println("������ �߻��ϵ� ���ϵ� ������ ����Ǵ� ����Դϴ�.");
		}
		System.out.println("��¾ȵ�");
		// finally ����� ����ϴ� �Ͱ� ������� �ʰ� �׳� ���� �ٿ� �ڵ鸣 ������ �� ����
		// ��쿡 ���� ���̰� ���� �� �ִ�. try-catch ��Ͽ��� return���� �ִ� ��쿡�� finally ����� ������ ����ȴ�
		// ������ �׳� ����� ������� �ʴ´�.
	}

}
//Exception ó������ �ʾ������� ���α׷��� ���� ����Ǿ��µ� catch��� ������� Exception�� ó���ϴ� ����������� �ʰ� �� ����Ǵ� ���� �� �� �ִ�.
//
//try��Ͽ��� ���������� Exception�� �߻��Ѵٸ� catch��� ����� ������ �� �� �ִ�.
//
//ExceptionŬ�������� ��� ExceptionŬ������ ��ӹ����Ƿ�, ����Ŭ������ Exception�� �ΰ� �Ǹ� � ������ �߻��ϵ��� ���� �ϳ��� catch��Ͽ��� ��� ������ ó���� �� �ִ�.