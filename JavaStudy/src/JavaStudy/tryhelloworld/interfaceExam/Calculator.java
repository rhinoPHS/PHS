package JavaStudy.tryhelloworld.interfaceExam;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	default int exec(int i, int j){
		return i+j;
	}
//�������̽��� ������ �Ǹ�, �������̽��� �����ϴ� ��� Ŭ�������� �ش� �޼ҵ带 �����ؾ� �ϴ� ������ �ִ�. �̷� ������ �ذ��ϱ� ���Ͽ� �������̽��� �޼ҵ带 ������ ���� �� �ֵ��� �Ͽ���. default
	
	public static int exec2(int i, int j){
		return i*j;
	}
	//�������̽��� static �޼ҵ带 ���������ν�, �������̽��� �̿��Ͽ� ������ ����� ������ ��ƿ��Ƽ�� �������̽��� ���� �� �ְ� �Ǿ���.
}
