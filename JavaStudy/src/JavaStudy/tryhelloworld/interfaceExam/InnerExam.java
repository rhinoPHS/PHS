/*
 ���� Ŭ������ Ŭ���� �ȿ� ����� Ŭ����
��� ��ġ�� �����ϴ��Ŀ� ���� 4���� ���°� ���� �� �ִ�.
ù��°�� Ŭ���� �ȿ� �ν��Ͻ� ����, �� �ʵ带 �����ϴ� ��ġ�� ����Ǵ� ���. ���� ��øŬ���� Ȥ�� �ν��Ͻ� Ŭ������� �Ѵ�.
���ο� �ִ� Cal��ü�� �����ϱ� ���ؼ���, �ۿ��� InnerExam1�� ��ü�� ���� �Ŀ� InnerExam1.Cal cal = t.new Cal();�� ���� ������� Cal��ü�� ������ �� ����Ѵ�.
 */


package JavaStudy.tryhelloworld.interfaceExam;

	public class InnerExam {
		class Cal{
			int value = 0;
			public void plus(){
				value++;
			}
		}
	
	public static void main(String[] args) {
		InnerExam t = new InnerExam();
		InnerExam.Cal cal = t.new Cal();	
		//InnerExam.Cal cal2 = new InnerExam.Cal();  //����
		cal.plus();
		System.out.println(cal.value);
	}

}
