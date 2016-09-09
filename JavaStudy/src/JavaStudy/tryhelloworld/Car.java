package JavaStudy.tryhelloworld;

public class Car {
	String name;
	int number;
	public Car(){
		this("이름없음",0);
	}
	
	public Car(String name){
		this.name = name;
	}
	
	public Car(String name, int number){
		this.name=name;
		this.number=number;
	}
	public void run()
	{
		System.out.println("Car의 run메소드");
	}
	
}
