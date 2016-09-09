package JavaStudy.tryhelloworld;

public class Bus extends Car {
	public void sound()
	{
		System.out.println("ㅃㅃ");
	}
	public void run()
	{
		super.run();
		System.out.println("Bus의 run메소드");
	}
}
