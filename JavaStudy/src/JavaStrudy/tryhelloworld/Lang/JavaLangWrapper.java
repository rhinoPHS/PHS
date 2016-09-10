package JavaStrudy.tryhelloworld.Lang;
/*
 * 자바는 기본적으로 다양한 패키지를 지원 그중에서 가장 중요한 패키지
java.lang패키지의 클래스는 import를 하지 않고도 사용할 수 있다.
java.lang패키지에는 기본형타입을 객체로 변환시킬때 사용하는 Wrapper클래스가 있다.
Boolean, Byte, Short, Integer, Long, Float, Double 클래스
모든 클래스의 최상위 클래스인 Object도 java.lang패키지
문자열과 관련된 String, StringBuffer, StringBuilder도 모두 java.lang패키지
화면에 값을 출력할때 사용했던 System클래스도 java.lang패키지
수학과 관련된 Math클래스도 java.lang패키지
Thread와 관련된 중요 클래스들이 java.lang패키지
이외에도 다양한 클래스와 인터페이스가 java.lang패키지에 속해 있다.
 */
public class JavaLangWrapper {
	public static void main(String[] args) {
		int i =5;
		
		Integer i2 = new Integer(5);
		Integer i3 = 5 ; //오토 박싱
		
		int i4 = i2.intValue();
		int i5 = i2; // 오토언 박싱
		
//		오토박싱(Auto Boxing)
//		Integer i3 = 5; 숫자 5는 원래 기본형이지만 자동으로 Integer형태로 변환된다.
//		오토 언박싱(Auto unboxing)
//		int i5 = i2; Integer객체타입의 값을 기본형 int로 자동으로 변환되어 값을 할당한다.
//		오토박싱(Auto Boxing),오토 언박싱(Auto unboxing) 은 JAVA 5부터 지원한다. 이 때 내부적으로 Wrapper클래스들이 사용된다.
		
	}

}
