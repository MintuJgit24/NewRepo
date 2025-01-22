package collectionPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList is inbuilt class need to import
		ArrayList li=new ArrayList();
		li.add("red");
		li.add("white");
		li.add("green");
		li.add("blue");
		System.out.println(li);
		
		ArrayList ar=new ArrayList();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		System.out.println(ar);
		
		//addAll-to add one list with other list
		System.out.println(li.addAll(ar));
		System.out.println(li);
		
		//System.out.println(ar.addAll(li));
		//System.out.println(ar);
		
		//have all other methods also
		System.out.println(li.contains("red"));
		System.out.println(li.get(3));
		System.out.println(li);
		
		//iterator
		
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//remove- remove last element from list
		itr.remove();
		System.out.println(li);
	}
}
