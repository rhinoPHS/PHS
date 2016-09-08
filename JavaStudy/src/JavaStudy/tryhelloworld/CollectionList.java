package JavaStudy.tryhelloworld;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
	public void printList(){
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		for(String item : list){
		  System.out.println("item :"+item);
		  
		}
	}

}
