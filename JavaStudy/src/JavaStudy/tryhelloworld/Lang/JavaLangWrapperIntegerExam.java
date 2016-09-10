package JavaStudy.tryhelloworld.Lang;

public class JavaLangWrapperIntegerExam {
		  public static void main(String[] args){
		    Integer i1 = 5;
		    int max_int = i1.MAX_VALUE;
		    long i1_long = i1.longValue();

//		    int i2 = 5;
//		    int min_int = i2.MIN_VALUE;
//		    long i2_long = i2.longValue();
		    System.out.println(max_int);
		    System.out.println(i1_long);
		  }
}
/*
Integer는 int의 wrapper class입니다. class이기 때문에 속성과 메소드를 가지는데요.
다음 코드를 실행해 보면 Integer 타입인 경우 필드와 method를 사용할 수 있지만, 기본형 타입인 int의 경우 필드와 method를 사용할 수 없는걸 확인할 수 있습니다.
*/