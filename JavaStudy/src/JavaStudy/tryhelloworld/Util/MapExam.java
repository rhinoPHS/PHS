package JavaStudy.tryhelloworld.Util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//Map은 key와 value를 쌍으로 저장하는 자료구조 키는 중복될 수 없고, 값은 중복될 수 있다.

public class MapExam {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("001", "kim");
		map.put("002", "lim");
		map.put("003", "choi");
		
		map.put("001", "kang");
		
		System.out.println(map.size());
		
		System.out.println(map.get("001"));
		
		//맵이 가지고 있는 모든 데이터를 꺼낼 때
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
    //상품의 이름과 값을 products에 추가해 보세요.
    products.put("가위",2500);
    products.put("크래파스",5000);

    return products;
  }

  public static void main(String[] args){
  }
}
*/
