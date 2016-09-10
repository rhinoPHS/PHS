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
////	    Box는 매개변수로 Object를 하나 받아들이고, Object를 반환한다.
////	    Object를 받아들일 수 있다는 것은 Object의 후손이라면 무엇이든 받아들일 수 있다는 것이다.
//	}
//
//}

//Generic을 이용하여 수정한 Box를 이용하는 BoxExam클래스
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
	     참조타입에 <Object> , <String>, <Integer>가 있는 것을 볼 수 있다.
	     첫번째는 Object를 사용하는 Box를 인스턴스로 만들겠다는 의미
	     두번째는 String을 사용하는 Box인스턴스를 만들겠다는 의미
	     세번째는 Integer를 사용하는 Box인스턴스를 만든다는 의미
	  Generic을 사용함으로써 선언할때는 가상의 타입으로 선언하고, 사용시에는 구체적인 타입을 설정함으로써 다양한 타입의 클래스를 이용하는 클래스를 만들 수 있습니다. Generic을 사용하는 대표적인 클래스는 컬렉션 프레임워크와 관련된 클래스입니다.
	     */
	    
	}

}