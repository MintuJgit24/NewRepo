package collectionPack2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s=new HashSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		List li=new LinkedList();
		li.add("rose");
		li.add("jasmine");
		li.add("mango");
		
		
		li.addAll(s);
		System.out.println(li);
		
		System.out.println(li.get(2));

	}
}
