package JavaStudy.tryhelloworld;

public class StringExam {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		
		String str3 = new String("hello");
		String str4 = new String("hello");
	    String str5 = "hello world";
	    String str6 = str5.substring(3);
	    
	    System.out.println(str6);
		
		if(str1 == str2)
			System.out.println("st1�� sttr2�� ���� ���۷����Դϴ�.");
		if(str1 == str3)
			System.out.println("st1�� sttr2�� ���� ���۷����Դϴ�.");
		if(str3 == str4)
			System.out.println("st1�� sttr2�� ���� ���۷����Դϴ�.");
		
		String strequals1 = new String("Hello world");
		String strequals2 = new String("Hello world");
//------------------------------------------------------------------------------------------
		if( strequals1.equals(strequals2) ){
			System.out.println("strequals1�� strequals2�� ���� ���� ������ �ֽ��ϴ�.");		
		}
		else{
			System.out.println("strequals1�� strequals2�� �ٸ� ���� ������ �ֽ��ϴ�.");
		}
		/*== �����ڸ� �̿��ؼ� String�� ���ϸ� ���۷����� ���ϱ� ������ ���� ������ Ȯ���� �� �����ϴ�. 
				���� ������ Ȯ���ϰ� �������� .equals�� ����ϸ� �Ǵµ���. ��
				�� �ڵ带 �����ؼ� .equals�� ������ Ȯ���� ������.
			*/
	}

}
//String�� �ٸ� Ŭ������ �ٸ��� new�� ������� �ʰ� ����� �� �ִ�. �޸𸮸� �Ƴ����� String�� new�� ������� �ʰ� ����ϴ� ���� ����.
//substring�� ���ڿ��� �ڸ� ����� ��ȯ�ϴ� �޼ҵ��̴�. �ش� �ڵ尡 ����Ǿ str5�� ������ �ʴ´�.
//str6�� str5�� ������ �ִ� ���ڿ� �� 3��° ��ġ���� �ڸ� ��� �� ���ο� String�� �����ϰ� �ȴ�.