package JavaStrudy.tryhelloworld.Lang;
/*
 * �ڹٴ� �⺻������ �پ��� ��Ű���� ���� ���߿��� ���� �߿��� ��Ű��
java.lang��Ű���� Ŭ������ import�� ���� �ʰ� ����� �� �ִ�.
java.lang��Ű������ �⺻��Ÿ���� ��ü�� ��ȯ��ų�� ����ϴ� WrapperŬ������ �ִ�.
Boolean, Byte, Short, Integer, Long, Float, Double Ŭ����
��� Ŭ������ �ֻ��� Ŭ������ Object�� java.lang��Ű��
���ڿ��� ���õ� String, StringBuffer, StringBuilder�� ��� java.lang��Ű��
ȭ�鿡 ���� ����Ҷ� ����ߴ� SystemŬ������ java.lang��Ű��
���а� ���õ� MathŬ������ java.lang��Ű��
Thread�� ���õ� �߿� Ŭ�������� java.lang��Ű��
�̿ܿ��� �پ��� Ŭ������ �������̽��� java.lang��Ű���� ���� �ִ�.
 */
public class JavaLangWrapper {
	public static void main(String[] args) {
		int i =5;
		
		Integer i2 = new Integer(5);
		Integer i3 = 5 ; //���� �ڽ�
		
		int i4 = i2.intValue();
		int i5 = i2; // ����� �ڽ�
		
//		����ڽ�(Auto Boxing)
//		Integer i3 = 5; ���� 5�� ���� �⺻�������� �ڵ����� Integer���·� ��ȯ�ȴ�.
//		���� ��ڽ�(Auto unboxing)
//		int i5 = i2; Integer��üŸ���� ���� �⺻�� int�� �ڵ����� ��ȯ�Ǿ� ���� �Ҵ��Ѵ�.
//		����ڽ�(Auto Boxing),���� ��ڽ�(Auto unboxing) �� JAVA 5���� �����Ѵ�. �� �� ���������� WrapperŬ�������� ���ȴ�.
		
	}

}
