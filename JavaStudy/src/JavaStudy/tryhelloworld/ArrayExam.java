package JavaStudy.tryhelloworld;

/*public class ArrayExam {
	public int[] fill100() {
		int[] array = new int[100];
		// array�� 1���� 100���� ������� ���� �������� ����� ������.
	  for(int i=0; i<array.length;i++)
    {
      array[i]=i+1;
    }
		// �Ʒ��� ��� �򰡸� ���� �ڵ��Դϴ�. �������� ������.
		return array;
	}

	// �Ʒ��� ������ ���� �ڵ��Դϴ�. �������� ������.
	public static void main(String[] args) {
		ArrayExam exam = new ArrayExam();
		int[] arr2 = exam.fill100();
		for (int i = 0; i < 100; i++) {
			if (arr2[i] != i + 1) {
				System.out.println("array[" + i + "]�� ���� Ʋ���ϴ�.");
			}
		}
	}
}*/

public class ArrayExam {
	public int sum(int[] param) {
		int[] array = param;
		int sum = 0;
		// array�� ���̸� �� �� ���� int�� �迭�Դϴ�.
		// array���� ������ ����ִٰ� �����ϰ� �� �Ʒ����� sum�� array�� ��� ���� ���ϼ���.
     for (int i=0; i<array.length; i++)
    {
      sum=sum+array[i];
    }
		// �Ʒ��� ��� �򰡸� ���� �ڵ��Դϴ�. �������� ������.
		return sum;
	}
	
	//�Ʒ��� ������ ���� �ڵ��Դϴ�. �������� ������.
	public static void main(String[] args) {
		int[]TestCase = new int[4];
		String str = "";
		int rightResult = 0;
		for(int i=0; i<4; i++){
			TestCase[i] = (int)(Math.random()*100);
			rightResult += TestCase[i];
			str+=(TestCase[i]+",");
		}
		str=str.substring(0,str.length()-1);

		ArrayExam exam = new ArrayExam();
		int Answer = exam.sum(TestCase);
		
		if (Answer==rightResult) {
	  		System.out.println("�����Դϴ�. [����]�� ��������.");
		}
		else{
			System.out.println( str+"�� ���� sum�� ���� Ʋ���ϴ�.");
		}
	}
}
