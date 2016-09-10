package JavaStudy.tryhelloworld.Util;

//public class GenericExam {
//
//	public static void main(String[] args) {
//		Generic g = new Generic();
//		g.setObj(new Object());
//		Object obj = g.getObj();
//		
//	    g.setObj("hello");
//	    String str = (String)g.getObj();
//	    System.out.println(str);
//	    
//	    g.setObj(1);
//	    int value = (int)g.getObj();
//	    System.out.println(value);
//	    
////	    Box�� �Ű������� Object�� �ϳ� �޾Ƶ��̰�, Object�� ��ȯ�Ѵ�.
////	    Object�� �޾Ƶ��� �� �ִٴ� ���� Object�� �ļ��̶�� �����̵� �޾Ƶ��� �� �ִٴ� ���̴�.
//	}
//
//}

//Generic�� �̿��Ͽ� ������ Box�� �̿��ϴ� BoxExamŬ����
public class GenericExam {

	public static void main(String[] args) {
		Generic<Object> g = new Generic();
		g.setObj(new Object());
		Object obj = g.getObj();
		
		Generic<String> g2 = new Generic<>();
	    g2.setObj("hello");
	    String str = g2.getObj();
	    System.out.println(str);
	    
	    Generic<Integer> g3 = new Generic<>();
	    g3.setObj(1);
	    int value = (int)g3.getObj();
	    System.out.println(value);
	    /*
	     ����Ÿ�Կ� <Object> , <String>, <Integer>�� �ִ� ���� �� �� �ִ�.
	     ù��°�� Object�� ����ϴ� Box�� �ν��Ͻ��� ����ڴٴ� �ǹ�
	     �ι�°�� String�� ����ϴ� Box�ν��Ͻ��� ����ڴٴ� �ǹ�
	     ����°�� Integer�� ����ϴ� Box�ν��Ͻ��� ����ٴ� �ǹ�
	  Generic�� ��������ν� �����Ҷ��� ������ Ÿ������ �����ϰ�, ���ÿ��� ��ü���� Ÿ���� ���������ν� �پ��� Ÿ���� Ŭ������ �̿��ϴ� Ŭ������ ���� �� �ֽ��ϴ�. Generic�� ����ϴ� ��ǥ���� Ŭ������ �÷��� �����ӿ�ũ�� ���õ� Ŭ�����Դϴ�.
	     */
	    
	}

}