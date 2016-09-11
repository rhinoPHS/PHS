package JavaStudy.tryhelloworld.Lambda;
/*
 * 람다식 기본문법
		(매개변수목록)->{실행문}
 */
//2개의 값을 비교하여 어떤 값이 더 큰지 구하는 compareTo()라는 메소드를 가지고 있는 Compara 인터페이스
//2개의 값을 받아들인 후, 정수를 반환하는 메소드를 선언
public interface LambdaBasic {
	public int compare(int value, int value2);

}
