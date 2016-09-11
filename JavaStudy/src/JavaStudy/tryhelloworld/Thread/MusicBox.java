package JavaStudy.tryhelloworld.Thread;
/*
 * 하나의 객체를 여러개의 Thread가 사용한다는 것을 의미
        MusicBox라는 클래스가 있다고 가정하겠습니다. 해당 클래스는 3개의 메소드를 가지고 있습니다. 
                 각각의 메소드는 1초 이하의 시간동안 10번 반복하면서, 어떤 음악을 출력합니다. 
                 이러한 MusicBox를 사용하는 MusicPlayer를 3명 만들어 보도록 하겠습니다.
		MusicPlayer3명은 하나의 MusicBox를 사용할 것입니다. 
		이때 어떤 일이 발생하는지 살펴보도록 하겠습니다.
		
		공유객체 MusicBox
 */
public class MusicBox {
    //신나는 음악!!! 이란 메시지가 1초이하로 쉬면서 10번 반복출력
	public void playMusicA(){
		for(int i = 0; i<10 ; i++){
			System.out.println("신나는 음악");
			
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicA
    //슬픈 음악!!!이란 메시지가 1초이하로 쉬면서 10번 반복출력
    public void playMusicB(){
        for(int i = 0; i < 10; i ++){
            System.out.println("슬픈 음악!!!");
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for        
    } //playMusicB
    //카페 음악!!! 이란 메시지가 1초이하로 쉬면서 10번 반복출력
    public void playMusicC(){
        for(int i = 0; i < 10; i ++){
            System.out.println("카페 음악!!!");
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for        
    } //playMusicC  
}
