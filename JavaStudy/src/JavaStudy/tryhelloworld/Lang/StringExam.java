package JavaStudy.tryhelloworld.Lang;

public class StringExam {
	public static void main(String[] args) {
		String str1 = "hello world";
		String str2 = str1.substring(5);
		System.out.println(str1);
		System.out.println(str2);
		/*
		 * StringŬ������ ���ڿ��� �ٷ궧 ����ϴ� Ŭ����
		   StringŬ������ �Һ�Ŭ���� �̴�.
		 */
		//StringŬ������ ����� �� ���� ������ �߻��ϴ� ���� ������ ���� �ڵ带 ����� �� �Դϴ�.
		String str3 = str1 + str2;
		System.out.println(str3);
		//���ڿ��� ���ڿ��� ���ϰ� �Ǹ� ���������δ� ������ ���� �ڵ尡 ����
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str3);
		
		//���ڿ��� �ݺ��� �ȿ��� ���ϴ� ���� ���ɻ� ������ ���� �� ������ �ݵ�� ���ϵ��� �մϴ�.
		//str5�� for������ str6�� for���� ȿ����
		String str5="";
		for(int i=0; i<10;i++){
			str5 = str5 + "*";
		}
		
		StringBuffer str6 = new StringBuffer();
		for(int i=0; i<10; i++){
			str6.append("*");
		}
		String sb = str6.toString();
	}
}
