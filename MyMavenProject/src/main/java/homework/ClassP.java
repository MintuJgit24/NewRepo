package homework;

public class ClassP implements Class1, Class2, Class3  {

	@Override
	public void display3() {
		// TODO Auto-generated method stub
		System.out.println("hello3");
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("hello2");
		
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("hello1");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassP classp=new ClassP();
		classp.display1();
		classp.display2();
		classp.display3();
		
		//Class1 obj1=new ClassP();
		//obj1.display1();
		

	}
}
