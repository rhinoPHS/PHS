package JavaStudy.tryhelloworld.Thread;
/*
 * �ϳ��� ��ü�� �������� Thread�� ����Ѵٴ� ���� �ǹ�
        MusicBox��� Ŭ������ �ִٰ� �����ϰڽ��ϴ�. �ش� Ŭ������ 3���� �޼ҵ带 ������ �ֽ��ϴ�. 
                 ������ �޼ҵ�� 1�� ������ �ð����� 10�� �ݺ��ϸ鼭, � ������ ����մϴ�. 
                 �̷��� MusicBox�� ����ϴ� MusicPlayer�� 3�� ����� ������ �ϰڽ��ϴ�.
		MusicPlayer3���� �ϳ��� MusicBox�� ����� ���Դϴ�. 
		�̶� � ���� �߻��ϴ��� ���캸���� �ϰڽ��ϴ�.
		
		������ü MusicBox
 */
public class MusicBox {
    //�ų��� ����!!! �̶� �޽����� 1�����Ϸ� ���鼭 10�� �ݺ����
	public void playMusicA(){
		for(int i = 0; i<10 ; i++){
			System.out.println("�ų��� ����");
			
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicA
    //���� ����!!!�̶� �޽����� 1�����Ϸ� ���鼭 10�� �ݺ����
    public void playMusicB(){
        for(int i = 0; i < 10; i ++){
            System.out.println("���� ����!!!");
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for        
    } //playMusicB
    //ī�� ����!!! �̶� �޽����� 1�����Ϸ� ���鼭 10�� �ݺ����
    public void playMusicC(){
        for(int i = 0; i < 10; i ++){
            System.out.println("ī�� ����!!!");
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for        
    } //playMusicC  
}
