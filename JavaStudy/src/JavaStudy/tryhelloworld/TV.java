package JavaStudy.tryhelloworld;

public interface TV {
	public int MAX_VOLUME = 100;
	public int MIN_VOLUM = 0;
	//�������̽����� ������ �����ϸ� �����Ͻ� �ڵ����� �Ʒ��� ���� �ٲ��
	//public static final int MAX_VOLUME = 100;
	//public static final int MIN_VOLUME = 0;
	
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
	
/*
         �����̽����� ���ǵ� �޼ҵ�� ��� �߻� �޼ҵ��̴�. ������ ����� ��� �޼ҵ�� ������ �ÿ� ������ ���� �ڵ����� ����ȴ�.
    public abstract void on();
    public abstract void off();
    public abstract void volume(int value);
    public abstract void channel(int number);
    
 */
	
}
