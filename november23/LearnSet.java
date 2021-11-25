package november23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> birds = new TreeSet<String>();
		birds.add("peacock");
		birds.add("dove");
		birds.add("cuckoo");
		birds.add("sparrow");
		
		//set can only accessed by foreach method
		for (String eachbird : birds) {
			System.out.println(eachbird);
			
		}
	
	 
	}

}
