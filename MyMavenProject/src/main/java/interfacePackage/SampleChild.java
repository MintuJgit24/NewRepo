package interfacePackage;

//this is class
public class SampleChild implements Sample1{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hello from abstract method.");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 obj=new SampleChild();//create reference of interface
		obj.display();
		System.out.println("variable from parent is: "+a);

	}
}
