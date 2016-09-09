package JavaStudy.tryhelloworld.interfaceExam;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	default int exec(int i, int j){
		return i+j;
	}
//인터페이스가 변경이 되면, 인터페이스를 구현하는 모든 클래스들이 해당 메소드를 구현해야 하는 문제가 있다. 이런 문제를 해결하기 위하여 인터페이스에 메소드를 구현해 놓을 수 있도록 하였다. default
	
	public static int exec2(int i, int j){
		return i*j;
	}
	//인터페이스에 static 메소드를 선언함으로써, 인터페이스를 이용하여 간단한 기능을 가지는 유틸리티성 인터페이스를 만들 수 있게 되었다.
}
