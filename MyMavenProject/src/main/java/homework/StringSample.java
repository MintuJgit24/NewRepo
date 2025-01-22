package homework;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="HELLO";
		String s1="WORLD";
		//System.out.println(s.toUpperCase());
		
		//System.out.println(s.toLowerCase());
		
		System.out.println(s.charAt(4));
		
		StringBuilder sb=new StringBuilder("mariyam");
		//sb.append("hello");
		//sb.insert(1, "nice");
		sb.replace(2, 4, "you");
		//sb.delete(2, 5);
		System.out.println(sb);
		//mayouyam

	}

}
