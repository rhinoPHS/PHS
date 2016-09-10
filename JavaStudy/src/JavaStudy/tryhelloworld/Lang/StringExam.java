package JavaStudy.tryhelloworld.Lang;

public class StringExam {
	public static void main(String[] args) {
		String str1 = "hello world";
		String str2 = str1.substring(5);
		System.out.println(str1);
		System.out.println(str2);
		/*
		 * String클래스는 문자열을 다룰때 사용하는 클래스
		   String클래스는 불변클래스 이다.
		 */
		//String클래스를 사용할 때 가장 문제가 발생하는 경우는 다음과 같은 코드를 사용할 때 입니다.
		String str3 = str1 + str2;
		System.out.println(str3);
		//문자열과 문자열을 더하게 되면 내부적으로는 다음과 같은 코드가 실행
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str3);
		
		//문자열을 반복문 안에서 더하는 것은 성능상 문제가 생길 수 있으니 반드시 피하도록 합니다.
		//str5의 for문보다 str6의 for문이 효율적
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
