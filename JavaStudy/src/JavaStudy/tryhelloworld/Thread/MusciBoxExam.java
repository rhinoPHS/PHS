package JavaStudy.tryhelloworld.Thread;

public class MusciBoxExam {

	public static void main(String[] args) {
        // MusicBox �ν��Ͻ�
        MusicBox box = new MusicBox();

        MusicPlayer kim = new MusicPlayer(1, box);
        MusicPlayer lee = new MusicPlayer(2, box);
        MusicPlayer kang = new MusicPlayer(3, box);

        // MusicPlayer�����带 �����մϴ�. 
        kim.start();
        lee.start();
        kang.start();  
		
	}

}
