package JavaStudy.tryhelloworld;

public class MyClassExam {
	public static void main(String[] args) {
		MyClass my = new MyClass();
		my.method();
		my.method2(10);
		
		int x = my.method3();
		
		System.out.println("method3�� ������"+x+"�Դϴ�.");
		
		my.method4(10, 10);
		
		int x2 = my.method5(50);
		
		System.out.println("method5�� ������"+x2+"�Դϴ�.");
		
	}

}
