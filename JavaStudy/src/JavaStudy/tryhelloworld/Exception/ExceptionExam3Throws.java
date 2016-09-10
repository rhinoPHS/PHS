package JavaStudy.tryhelloworld.Exception;

//public class ExceptionExam3Throws {
//	public static void main(String[] args) {
//		int i = 10;
//		int j = 0;
//		int k = divide(i, j);
//		System.out.println(k);
//	}
//	public static int divide(int i, int j){
//		if(j==0){
//			throw new IllegalArgumentException("0으로 나눌 수 없어요");
//		}
//		int k = i/j;
//		return k;
//	}
//출력	Exception in thread "main" java.lang.IllegalArgumentException: 0으로 나눌 수 없어요
//		at JavaStudy.tryhellworld.Exception.ExceptionExam3Throws.divide(ExceptionExam3Throws.java:12)
//		at JavaStudy.tryhellworld.Exception.ExceptionExam3Throws.main(ExceptionExam3Throws.java:7)
//}
public class ExceptionExam3Throws {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try{
			int k = divide(i, j);
			System.out.println(k);
		}catch(IllegalArgumentException e){
			System.out.println(e.toString());
		}
	}
	public static int divide(int i, int j) throws IllegalArgumentException{
		if(j==0){
			throw new IllegalArgumentException("0으로 나눌 수 없어요");
		}
		int k = i/j;
		return k;
	}
}