package JavaStudy.tryhelloworld.Thread;

public class ThreadWait {
	public static void main(String[] args){
        // �տ��� ���� ������ B�� ���� �� start 
        // �ش� �����尡 ����Ǹ�, �ش� ������� run�޼ҵ� �ȿ��� �ڽ��� ����͸� ���� ȹ��
        ThreadNotify b = new ThreadNotify();
        b.start();

        // b�� ���Ͽ� ����ȭ ���� ����
        // ���� main�����尡 �Ʒ��� ����� ���� Thread���� ���� ����Ǿ��ٸ� wait�� �ϰ� �Ǹ鼭 ����͸� ���� ���� ���       
        synchronized(b){
            try{
                // b.wait()�޼ҵ带 ȣ��.
                // ���ξ������ ����
                // ThreadB�� 5�� ���� ���� �� notify�� ȣ���ϰ� �Ǹ� wait���� ���
                System.out.println("b�� �Ϸ�ɶ����� ��ٸ��ϴ�.");
                b.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            //��� �� ����� ���
            System.out.println("Total is: " + b.total);
        }//sync
    }

}
