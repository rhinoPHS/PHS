package JavaStudy.tryhelloworld;

public class StringMethodExam {
	public static void main(String[] args) {
		String str = "hello"; // String str = new String("hello");
		System.out.println(str.length());
		System.out.println(str.concat(" world"));
		System.out.println(str);
		str = str.concat(" world");
		System.out.println(str);
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,7));
	}

}
/*		String str1 = "�ȳ��ϼ���. ";
		String str2 = "���� ������� ���̳׿�. ������ ȭ����!!";

		String concatResult = str1.concat(str2);
 */
