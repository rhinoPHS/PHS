package JavaStrudy.tryhelloworld.Lang;

import java.io.StringBufferInputStream;

public class StringBufferExam {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		 // �ش� ��Ʈ�� ���ۿ� "hello", ����, "world"�� ���ʴ�� �߰�
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString(); // hello world
		 // StringBuffer�� �߰��� ���� toString()�޼ҵ带 �̿��Ͽ� ��ȯ 
		
		System.out.println(str);
		
		//StringBuffer�� ������ �ִ� �޼ҵ���� ��κ� �ڱ� �ڽ�, this�� ��ȯ
//		�ڱ� �ڽ��� �޼ҵ带 ȣ���Ͽ� �ڱ� �ڽ��� ���� �ٲ㳪���� ���� �޼ҵ�ü�̴� �̶�� �Ѵ�.
//		StringBufferŬ������ �޼ҵ� ü�� ������� ����� �� �ֵ��� ������� �ִ�.
		
		  StringBuffer sb2 = new StringBuffer();
		    StringBuffer sb3 = sb2.append("hello");
		    if(sb2 == sb3){
		        System.out.println("sb2 == sb3");
		    }
		    System.out.println(sb2);
		    System.out.println(sb3);
		    
		 String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		 System.out.println(str2);
	}

}
