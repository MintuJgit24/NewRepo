package firstpackage;

public class StringBufferSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		
		StringBuilder sbs=new StringBuilder("world");
		System.out.println(sbs);
		
		StringBuilder sb1=new StringBuilder("nice");
		
		
		//append-to add string at end
		sb.append(" mintu");
		sbs.append(" Java");
		System.out.println(sb);
		System.out.println(sbs);
		
		//insert-to add at particular index
		sb.insert(3,"hey");
		System.out.println(sb);
		
		//replace-it will add string in the 1st index and takes 3 places of the index starting at 0
		sb1.replace(1, 3, "happy");
		System.out.println(sb1);
		
		//reverse-to reverse a string
		sb1.reverse();
		System.out.println(sb1);
		
		//delete-it will delete from index 0 and take 2places
		sb1.delete(0, 2);
		System.out.println(sb1);
		
	}

}
