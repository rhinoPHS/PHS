package JavaStudy.tryhelloworld.Thread;
/*
 * wait�� notify�� ����ȭ�� ��Ͼȿ��� ����ؾ� �Ѵ�. wait�� ������ �Ǹ� �ش� ������� �ش� ��ü�� ����͸� ���� ���� ������ ������ �ִٸ� ����͸� ���� ������ ���� ����Ѵ�.
 */
public class ThreadNotify extends Thread {
    // �ش� �����尡 ����Ǹ� �ڱ� �ڽ��� ����͸� ���� ȹ��
    // 5�� �ݺ��ϸ鼭 0.5�ʾ� ���鼭 total�� ���� ����
    // ���Ŀ� notify()�޼ҵ带 ȣ���Ͽ� wiat�ϰ� �ִ� �����带 ���� 
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<5 ; i++){
                System.out.println(i + "�� ���մϴ�.");
                total += i;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }//for
            notify();
        }//sync
    }

}
