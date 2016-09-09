package JavaStudy.tryhelloworld;

public class MyClassExam {
	public static void main(String[] args) {
		MyClass my = new MyClass();
		my.method();
		my.method2(10);
		
		int x = my.method3();
		
		System.out.println("method3이 리턴한"+x+"입니다.");
		
		my.method4(10, 10);
		
		int x2 = my.method5(50);
		
		System.out.println("method5가 리턴한"+x2+"입니다.");
		
	}

}
