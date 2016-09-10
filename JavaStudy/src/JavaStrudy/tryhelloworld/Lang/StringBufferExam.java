package JavaStrudy.tryhelloworld.Lang;

import java.io.StringBufferInputStream;

public class StringBufferExam {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		 // 해당 스트링 버퍼에 "hello", 공백, "world"를 차례대로 추가
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString(); // hello world
		 // StringBuffer에 추가된 값을 toString()메소드를 이용하여 반환 
		
		System.out.println(str);
		
		//StringBuffer가 가지고 있는 메소드들은 대부분 자기 자신, this를 반환
//		자기 자신의 메소드를 호출하여 자기 자신의 값을 바꿔나가는 것을 메소드체이닝 이라고 한다.
//		StringBuffer클래스는 메소드 체인 방식으로 사용할 수 있도록 만들어져 있다.
		
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
