package collectionPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String colour[] = { "black", "red", "white", "green" };
		// for-each loop
		for (String ar : colour) {
			System.out.println(ar);
		}

		
		 int s1[]= {1,2,3,4,5}; 
		 for(int i:s1) 
		 { 
			 System.out.println(i); 
		 }
		 

		List li = new ArrayList();
		li.add("black");
		li.add("white");
		li.add("red");
		System.out.println(li);
		
		li.set(2, "blue");
		System.out.println(li);
		int x=li.indexOf("blue");
		System.out.println(x);
		
		List li2=new ArrayList();
		li2.add("car");
		li2.add("bus");
		li2.add("bike");
		
		li.addAll(li2);
		System.out.println(li);

		Iterator it=li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

