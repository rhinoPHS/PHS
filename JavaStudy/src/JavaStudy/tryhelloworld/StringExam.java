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
			System.out.println("st1과 sttr2는 같은 레퍼런스입니다.");
		if(str1 == str3)
			System.out.println("st1과 sttr2는 같은 레퍼런스입니다.");
		if(str3 == str4)
			System.out.println("st1과 sttr2는 같은 레퍼런스입니다.");
		
		String strequals1 = new String("Hello world");
		String strequals2 = new String("Hello world");
//------------------------------------------------------------------------------------------
		if( strequals1.equals(strequals2) ){
			System.out.println("strequals1과 strequals2는 같은 값을 가지고 있습니다.");		
		}
		else{
			System.out.println("strequals1과 strequals2는 다른 값을 가지고 있습니다.");
		}
		/*== 연산자를 이용해서 String을 비교하면 레퍼런스를 비교하기 떄문에 같은 값인지 확인할 수 없습니다. 
				같은 값인지 확인하고 싶을때는 .equals를 사용하면 되는데요. 다
				음 코드를 실행해서 .equals의 동작을 확인해 보세요.
			*/
	}

}
//String은 다른 클래스와 다르게 new를 사용하지 않고 사용할 수 있다. 메모리를 아끼려면 String은 new를 사용하지 않고 사용하는 것이 좋다.
//substring은 문자열을 자른 결과를 반환하는 메소드이다. 해당 코드가 실행되어도 str5는 변하지 않는다.
//str6은 str5가 가지고 있는 문자열 중 3번째 위치부터 자른 결과 즉 새로운 String을 참조하게 된다.