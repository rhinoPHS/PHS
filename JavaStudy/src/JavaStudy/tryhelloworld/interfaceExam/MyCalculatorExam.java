package JavaStudy.tryhelloworld.interfaceExam;

public class MyCalculatorExam {
	public static void main(String[] args) {
		Calculator cal = new MyCalculator();
		int value = cal.exec(5, 10);
		System.out.println(value);
		
		//int value2 = cal.exec2(5, 10); ���� static �޼ҵ�� ��ü�̸����� ���ٺҰ� �������̽������θ� ���� ����
		int value2 = Calculator.exec2(5, 10);
		System.out.println(value2);
	}
	


}
