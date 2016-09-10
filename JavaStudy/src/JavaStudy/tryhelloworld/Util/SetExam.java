package JavaStudy.tryhelloworld.Util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//set은 중복이 없고, 순서도 없는 자료구조. Hashset과 TreeSet이 있다.
public class SetExam {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		
		boolean flag1 = set1.add("kim");
		boolean flag2 = set1.add("lee");
		boolean flag3 = set1.add("kim");
		
		System.out.println(set1.size());  // 저장된 크기 출력, 3개를 저장했지만, 이미 같은 값이 있었기 때문에 2개가 출력
		System.out.println(flag1); //true
		System.out.println(flag2); //ture
		System.out.println(flag3); //false 
		
		Iterator<String> iter = set1.iterator();
		
		while(iter.hasNext()){ // 꺼낼 것이 있다면 true 리턴.  
			String str = iter.next(); // next()메소드는 하나를 꺼낸다. 하나를 꺼내면 자동으로 다음것을 참조한다.
			System.out.println(str); 
		}
		
		    Set<String> set = new HashSet<String>();
		    set.add("a");
		    set.add("a");
		    set.add("b");

		    System.out.println("set의 내용을 출력합니다.");
		    for(String str : set){
		      System.out.println(str);
		    
		}
	}
}
