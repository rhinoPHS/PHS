/*
 * �ι�°�� ���� Ŭ������ static���� ���ǵ� ���, ���� ��ø Ŭ���� �Ǵ� static Ŭ������� �Ѵ�.
�ʵ� ������ �� ����ƽ�� �ʵ�� ������ �Ͱ� ����. �� ��쿡�� InnerExam2��ü�� ������ �ʿ���� new InnerExam2.Cal() �� ��ü�� ������ �� �ִ�.
 */
package JavaStudy.tryhelloworld.interfaceExam;

	public class InnerExam2 {
		static class Cal{
			int value = 0;
			public void plus(){
				value++;
			}
		}
	public static void main(String[] args) {
		InnerExam2.Cal cal= new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
	}

}
