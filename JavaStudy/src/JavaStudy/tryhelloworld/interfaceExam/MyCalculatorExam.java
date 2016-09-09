package JavaStudy.tryhelloworld.interfaceExam;

public class MyCalculatorExam {
	public static void main(String[] args) {
		Calculator cal = new MyCalculator();
		int value = cal.exec(5, 10);
		System.out.println(value);
		
		//int value2 = cal.exec2(5, 10); 오류 static 메소드는 객체이름으로 접근불가 인터페이스명으로만 접근 가능
		int value2 = Calculator.exec2(5, 10);
		System.out.println(value2);
	}
	


}
