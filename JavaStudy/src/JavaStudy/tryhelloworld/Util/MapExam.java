package JavaStudy.tryhelloworld.Util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//Map�� key�� value�� ������ �����ϴ� �ڷᱸ�� Ű�� �ߺ��� �� ����, ���� �ߺ��� �� �ִ�.

public class MapExam {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("001", "kim");
		map.put("002", "lim");
		map.put("003", "choi");
		
		map.put("001", "kang");
		
		System.out.println(map.size());
		
		System.out.println(map.get("001"));
		
		//���� ������ �ִ� ��� �����͸� ���� ��
		Set<String> keys = map.keySet();
		
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()){
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key+":"+value);
		}
	}

}
/*
 import java.util.*;

public class MapExam{
  public Map<String, Integer> makeMap(){
    Map<String, Integer> products = new HashMap<>();
    //��ǰ�� �̸��� ���� products�� �߰��� ������.
    products.put("����",2500);
    products.put("ũ���Ľ�",5000);

    return products;
  }

  public static void main(String[] args){
  }
}
*/
