package JavaStudy.tryhelloworld.Thread;

class synchronizedExam {
//	������ü�� ���� �޼ҵ带 ���ÿ� ȣ�� ���� �ʵ��� �ϴ� ���
//	�޼ҵ� �տ� synchronized �� ������.
//	�������� Thread���� ������ü�� �޼ҵ带 ����� �� �޼ҵ忡 synchronized�� �پ� ���� ��� ���� ȣ���� �޼ҵ尡 ��ü�� ����(Monitoring Lock)�� ��´�.
    public synchronized void playMusicA(){
        for(int i = 0; i < 10; i ++){
            System.out.println("�ų��� ����!!!");
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for        
    } //playMusicA
    
//    �޼ҵ� �տ� synchronized �� ������ ������ ����, �޼ҵ� �ϳ��� ��� ����� �Ŀ� ���� �޼ҵ尡 ����ȴ�.
//        �ش� ����͸� ���� �޼ҵ� ������ ����ǰų�, wait()�� ���� �޼ҵ带 ������ ������ �����ȴ�.
//    �ٸ� ��������� ����͸� ���� ���������� ����Ѵ�.
//    synchronized�� ������ ���� �޼ҵ�� �ٸ� ��������� synchronized�޼ҵ带 �����ϸ鼭 ����͸� ���� ȹ���ߴ� �ϴ���, �װͰ� ������� ����ȴ�.
//    synchronized�� �޼ҵ忡 ������ ��� �� ���, �޼ҵ��� �ڵ尡 �������, �������� ����ϴ� �����尡 �ʹ� ���� ��ٸ��°��� �������ؼ�
//    �޼ҵ忡 synchronized�� ������ �ʰ�, ������ ������ ���� �κи� synchronized����� ����Ѵ�.
    public void playMusicB(){
        for(int i = 0; i < 10; i ++){
            synchronized(this){
                System.out.println("���� ����!!!");
            }
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // for        
    } //playMusicB
}
