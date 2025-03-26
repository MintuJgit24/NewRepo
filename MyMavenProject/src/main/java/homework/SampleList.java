package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li = new ArrayList<String>();
		li.add("white");
		li.add("green");
		li.add("yellow");
		li.add("orange");
		li.add("blue");

		System.out.println(li);

		// Iterator itr=li.iterator();
		// while(itr.hasNext()) {
		// System.out.println(itr.next());
		// }

		for (String ar : li) {
			System.out.println(ar);

		}
	}
}
