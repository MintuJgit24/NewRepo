package collectionPack2;

import java.util.ArrayList;
import java.util.Iterator;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list=new ArrayList();
		list.add("Black");
		list.add("White");
		list.add("Red");
		list.add("Yellow");
		list.add("Orange");
		
		System.out.println(list);
				
		System.out.println(list.get(3));
		System.out.println();
		
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		System.out.println(list.contains("Orange"));
	}
}
