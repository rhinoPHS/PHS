package JavaStudy.tryhelloworld;

public class StringMethodExam {
	public static void main(String[] args) {
		String str = "hello"; // String str = new String("hello");
		System.out.println(str.length());
		System.out.println(str.concat(" world"));
		System.out.println(str);
		str = str.concat(" world");
		System.out.println(str);
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,7));
	}

}
/*		String str1 = "안녕하세요. ";
		String str2 = "벌써 여기까지 오셨네요. 끝까지 화이팅!!";

		String concatResult = str1.concat(str2);
 */
