package JavaStudy.tryhelloworld;

public class AccessObj {
	public int public1 = 1;   //전체공개
	protected int protected2 = 2; // 전체공개 x, 같은 패키지, 다른 패키지라도 상속을 받은 경우 접근 허용
	private int private3=3; // 자기 자신만 접근 가능 
	int default4 = 4; // default 접근 제한자 : 자기자신과 같은 패키지에서만 접근할 수 있다 
	
}
