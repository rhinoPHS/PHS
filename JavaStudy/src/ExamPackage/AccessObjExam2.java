package ExamPackage;

import JavaStudy.tryhelloworld.AccessObj;

//���������� �ǽ� �ٸ� ��Ű�� �� ��
public class AccessObjExam2 extends AccessObj {
	public static void main(String[] args) {
		AccessObjExam2 obj = new AccessObjExam2();
		System.out.println(obj.public1);
		System.out.println(obj.protected2); //����
		//System.out.println(obj.private3);   // ����
		//System.out.println(obj.default4);  //����
	}
}
