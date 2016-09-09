package JavaStudy.tryhelloworld;

public class LedExam {
	public static void main(String[] args) {
		TV tv = new LedTV();
		tv.turnOn();
		tv.changeVolume(50);
		tv.changeChannel(6);
		tv.turnOff();
		//tv.exam(); ¿À·ù
		
		LedTV ledtv = (LedTV) tv;
		ledtv.turnOff();
		ledtv.turnOn();
		ledtv.changeChannel(13);
		ledtv.changeVolume(7);
		ledtv.exam();
		
	}

}
