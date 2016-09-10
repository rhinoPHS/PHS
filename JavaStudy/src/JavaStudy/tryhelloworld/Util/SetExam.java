package JavaStudy.tryhelloworld.Util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//set�� �ߺ��� ����, ������ ���� �ڷᱸ��. Hashset�� TreeSet�� �ִ�.
public class SetExam {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		
		boolean flag1 = set1.add("kim");
		boolean flag2 = set1.add("lee");
		boolean flag3 = set1.add("kim");
		
		System.out.println(set1.size());  // ����� ũ�� ���, 3���� ����������, �̹� ���� ���� �־��� ������ 2���� ���
		System.out.println(flag1); //true
		System.out.println(flag2); //ture
		System.out.println(flag3); //false 
		
		Iterator<String> iter = set1.iterator();
		
		while(iter.hasNext()){ // ���� ���� �ִٸ� true ����.  
			String str = iter.next(); // next()�޼ҵ�� �ϳ��� ������. �ϳ��� ������ �ڵ����� �������� �����Ѵ�.
			System.out.println(str); 
		}
		
		    Set<String> set = new HashSet<String>();
		    set.add("a");
		    set.add("a");
		    set.add("b");

		    System.out.println("set�� ������ ����մϴ�.");
		    for(String str : set){
		      System.out.println(str);
		    
		}
	}
}
