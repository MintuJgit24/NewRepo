package firstpackage;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";
		
		String s1=new String("world");
		
		char c[]= {'a','b','c'};
		
		String s2=new String(c);
		
		String p="welcome to Java file.";
		
		System.out.println("string s:" + s);
		System.out.println("string s1:" + s1);
		System.out.println("char:" + s2);
		
		//length of string
		
		int l=s.length();
		System.out.println("length of string s is:"+l);
		
		//charAt-position of character
		
		//char a=s2.charAt(1);
		System.out.println("character is:"+s2.charAt(1));//1st index
		
		//concat-for adding 2 strings
		System.out.println(s.concat(s1));
		
		//contains-to check a word/character present or not in the string
		System.out.println(p.contains("Java"));
		System.out.println(p.contains("the"));
		System.out.println(p.contains("J"));
		
		//valueof-type conversion
		int b=2;
		String f=String.valueOf(b);
		System.out.println(f);
		
		//toUpperCase
		System.out.println(s.toUpperCase());
		//toLowerCase
		String u="NICE";
		System.out.println(u.toLowerCase());
		
		//equals()-to compare strings
		String s5="java";
		String s6="Java";
		String s7="Selenium";
		String s8="java";
		System.out.println(s5.equals(s8));
		System.out.println(s5.equals(s6));
		System.out.println(s5.equals(s7));
		
		//equalsIgnoreCase-it just compare string only, ignore the upper/lower case
		System.out.println(s5.equalsIgnoreCase(s6));
		
		//IsEmpty-to check string empty or not
		String s9="";
		System.out.println(s9.isEmpty());
		String s10="new";
		System.out.println(s10.isEmpty());
		
		String m="name";
		String n="name";
		System.out.println(m==n);//here comparison occurred w.r.t variable
		
		String i=new String("name");//here comparison occurred w.r.t reference because new keyword is used
		System.out.println(m==i);
		
	}

}
