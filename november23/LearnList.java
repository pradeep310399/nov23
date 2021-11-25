package november23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		
		
		List<String> vegetables = new ArrayList<String>();
		vegetables.add("onion");
		vegetables.add("potato");
		vegetables.add("brinjal");
		vegetables.add("tomato");
		
		int size = vegetables.size();
		System.out.println("size of the List:"+size);
		 for(int i=0;i<size;i++) {
			 System.out.println(vegetables.get(i));
		 }
		 
		 Collections.sort(vegetables);
		 System.out.println("sorted List:"+vegetables);
		 
		 Collections.reverse(vegetables);
		 System.out.println("revresed list:"+vegetables);
		
		
		
	}

}
