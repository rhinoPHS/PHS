package JavaStudy.tryhelloworld.interfaceExam;
////MyAction�� ����ϴ� Ŭ���� ActionExam 
//public class ActionExam {
//	public static void main(String[] args) {
//		Action action = new MyAction();
//		action.exec();
//	}
//
//
//}
//MyAction�� ������� �ʰ� Action�� ��ӹ޴� �͸� Ŭ������ ���� ����ϵ��� ������ ������ �ϰڽ��ϴ�. // MyAction�� ��� ��
public class ActionExam{
	public static void main(String[] args) {
		Action action = new Action() {
			
			@Override
			public void exec() {
				// TODO Auto-generated method stub
				System.out.println("exec");
			}
		};
		action.exec();
	}
}

//������ ������ �߰�ȣ ���� �ݰ� ������, �ش� ������ �̸��� �ش��ϴ� Ŭ������ ��ӹ޴� �̸����� ��ü�� ����ٴ� ���� ���Ѵ�.
//��ȣ �ȿ��� �޼ҵ带 �����ϰų� �޼ҵ带 �߰��� �� �ִ�. �̷��� ������ �̸� ���� ��ü�� action�̶�� ���������� �����ϵ��� �ϰ�, exec()�޼ҵ带 ȣ��.
//�͸�Ŭ������ ����� ������ Action�� ��ӹ޴� Ŭ������ ���� �ʿ䰡 ���� ����̴�.
//Action�� ��ӹ޴� Ŭ������ �ش� Ŭ���������� ���ǰ� �ٸ� Ŭ���������� ������ �ʴ� ����̴�.
