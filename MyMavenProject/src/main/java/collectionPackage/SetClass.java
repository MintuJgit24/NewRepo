package collectionPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set is oder less
		Set <String> s=new HashSet<String>();
		//add
		s.add("white");
		s.add("blue");
		s.add("green");
		System.out.println(s);
		
		Set <String> s1=new HashSet<String>();
		s1.add("car");
		s1.add("bike");
		s1.add("auto");
		
		//addAll
		s.addAll(s1);
		System.out.println(s);
		
		//contains
		System.out.println(s.contains("car"));
		System.out.println(s1.contains("black"));
		
		//size
		System.out.println(s.size());
		
		//isEmpty
		System.out.println(s.isEmpty());
		
		//remove
		s.remove("car");
		System.out.println(s);
		
		//iterator
		Iterator <String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//clear-to empty or clear the list 
		s.clear();
		System.out.println(s);
	}
}
