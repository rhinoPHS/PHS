package JavaStudy.tryhelloworld;
//접근제한자 실습 같은 패키지 일 때
public class AccessObjExam {
	public static void main(String[] args) {
		AccessObj obj = new AccessObj();
		System.out.println(obj.public1);
		System.out.println(obj.protected2);
		//System.out.println(obj.private3);   // 오류
		System.out.println(obj.default4);
	}
}
