package JavaStudy.tryhelloworld;

public class BusExam {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		//메소드를 오버라이드 하면, 항상 자식클래스에서 정의된 메소드가 호출된다.
		//오버라이딩 한다고 해서 부모의 메소드가 사라지는 것은 아니다.
		//super 키워드를 이용하면, 부모의 메소드를 호출 할 수 있다.
		
		
		
		//bus.sound();
		//Car car = new Car();
		//car.run();
		//car.sound();
	}

}
