package JavaStudy.tryhelloworld.Thread;
/*
 * ����(Daemon)�̶� ���� �������� ���� ���н��迭�� �ü������ ��׶���� �����ϴ� ���α׷��� ���Ѵ�.
		���󾲷��带 ����� ����� �����忡 ���� ������ �ϸ� �ȴ�.
			�̷� ������� �ڹ����α׷��� ���� �� ��׶��忡�� Ư���� �۾��� ó���ϰ� �ϴ� �뵵�� �����.  // �ֱ������� �����̳�, �����Ϳ��� �ֱ������� ������˻�� �� ���
		���󾲷���� �Ϲ� ������(main ��)�� ��� ����Ǹ� ���������� ����Ǵ� Ư¡�� ������ �ִ�
 */
public class DaemonThread implements Runnable {

	 @Override
     public void run() {
         while (true) {
             System.out.println("���� �����尡 �������Դϴ�.");

             try {
                 Thread.sleep(500);

             } catch (InterruptedException e) {
                 e.printStackTrace();
                 break; //Exception�߻��� while �� ����� 
             }
         }
     }

     public static void main(String[] args) {
         // Runnable�� �����ϴ� DaemonThread�� �����ϱ� ���Ͽ� Thread ����
         Thread th = new Thread(new DaemonThread());
         // ���󾲷���� ����
         th.setDaemon(true);
         // �����带 ����
         th.start();

         // ���� �����尡 1�ʵڿ� ����ǵ��� ����. 
         // ���󾲷���� �ٸ� �����尡 ��� ����Ǹ� �ڵ�����.
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }   
         System.out.println("���� �����尡 ����˴ϴ�. ");    
     } 

}
/*
�������� �ٸ��� ���� �� �ִ�.
������� ���� ������ ���������� �ʽ��ϴ�.
���ξ����忡�� �����Ų ���󾲷��尡 ������ ����ǰ� ���� �������, ������ ����Ǳ� ���� ��������� �� �� �����.

���� �����尡 �������Դϴ�.
���� �����尡 �������Դϴ�.
���� �����尡 ����˴ϴ�. 
or
���� �����尡 �������Դϴ�.
���� �����尡 �������Դϴ�.
���� �����尡 ����˴ϴ�. 

���� �����尡 �������Դϴ�.












*/