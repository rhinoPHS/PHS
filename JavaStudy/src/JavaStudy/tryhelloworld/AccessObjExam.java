package JavaStudy.tryhelloworld;
//���������� �ǽ� ���� ��Ű�� �� ��
public class AccessObjExam {
	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		System.out.println(obj.public1);
		System.out.println(obj.protected2);
		//System.out.println(obj.private3);   // ����
		System.out.println(obj.default4);
	}
}
