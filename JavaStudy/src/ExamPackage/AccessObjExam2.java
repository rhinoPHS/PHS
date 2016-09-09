package ExamPackage;

import JavaStudy.tryhelloworld.AccessObj;

//접근제한자 실습 다른 패키지 일 때
public class AccessObjExam2 extends AccessObj {
	public static void main(String[] args) {
		AccessObjExam2 obj = new AccessObjExam2();
		System.out.println(obj.public1);
		System.out.println(obj.protected2); //오류
		//System.out.println(obj.private3);   // 오류
		//System.out.println(obj.default4);  //오류
	}
}
