package JavaStudy.tryhelloworld.Thread;

public class MusicPlayer extends Thread {
	int type;
	MusicBox musicBox;
	
	// �����ڷ� ���� musicBox�� ������ �ϳ� �޾Ƶ鿩�� �ʵ带 �ʱ�ȭ
    public MusicPlayer(int type, MusicBox musicBox){
        this.type = type;
        this.musicBox = musicBox;
    }       
    // type�� �����̳Ŀ� ���� musicBox�� ������ �ִ� �޼ҵ尡 �ٸ��� ȣ��
    public void run(){
        switch(type){
            case 1 : musicBox.playMusicA(); break;
            case 2 : musicBox.playMusicB(); break;
            case 3 : musicBox.playMusicC(); break;
        }
    }     

}
