package interfacePackage;

//this is multiple inheritance
public class Class1 implements InterSample1, InterSample2, InterSample3{

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("hello 1");
		
	}
	
	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("hello 2");
		
	}

	
	@Override
	public void display3() {
		// TODO Auto-generated method stub
		System.out.println("hello 3");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 obj=new Class1();
		obj.display1();
		obj.display2();
		obj.display3();

	}

}
