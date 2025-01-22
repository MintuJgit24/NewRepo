package collectionPackage;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> li=new ArrayList <String> ();
		
		//add method
		li.add("black");
		li.add("red");
		li.add("blue");
		li.add("white");
		li.add("pink");
		System.out.println("colours are: "+li);
		
		//set method
		li.set(2, "green");//to insert with the given index(also means replace)
		System.out.println("colours are: "+li);
		
		//indexOf- it give first occurrence of (repeated) object
		System.out.println(li.indexOf("red"));
		li.add("black");
		System.out.println("colours are: "+li);
		System.out.println(li.indexOf("black"));
		
		//lastIndexOf - last occurrence of object
		System.out.println(li.lastIndexOf("black"));
		
		//remove - object to be removed by giving index
		li.remove(2);
		System.out.println(li);
		li.remove("red");
		System.out.println(li);
		li.add("yellow");
		System.out.println(li);
		
		//get-to get the object giving index
		System.out.println(li.get(2));
		
		//contains-to check if object is present or not
		System.out.println(li.contains("yellow"));
		System.out.println(li.contains("white"));
		
		//isEmpty- to check if list is empty or not
		if(li.isEmpty()) {
			System.out.println("list is empty");
		}
		else {
			System.out.println("list is not empty");
		}
		
		//li.isEmpty();
		System.out.println(li.isEmpty());
		
		//size
		int a=li.size();
		System.out.println(a);
		
		//li.get()
		
		//for loop
		for(int i=0;i<li.size();i++ ) {
			System.out.println(li.get(i));
		}
		
		//for-each loop
		for(String ar:li) {
			System.out.println(ar);
		}
	}
}
