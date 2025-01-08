package encapsulation;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample1 obj=new Sample1();
		obj.setUsname("hello123");
		obj.setPin(9876);
		
		System.out.println("username is:"+obj.getUsname());
		System.out.println("pin is: "+obj.getPin());
	}

}
