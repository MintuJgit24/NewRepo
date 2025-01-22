package abstraction;

public class SampleChild extends SampleParent{
	
	public void display2() {
		System.out.println("hello child method");
		
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("hello child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleParent obj=new SampleChild();
		//created reference of SampleParent class
		//abstract class does not have constructor
		obj.display();
		obj.show();
		//obj.diplay2();//cannot access like this.
		//because display2() method is of child class 
	}
}

