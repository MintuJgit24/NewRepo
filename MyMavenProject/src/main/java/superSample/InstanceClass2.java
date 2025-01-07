package superSample;

public class InstanceClass2 extends InstanceClass1 {
	
	String colour="red";
	
	public void display() {
		
		System.out.println("child class colour:"+colour);
		System.out.println("parent class colour:"+super.colour);//super used to call parent class variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceClass2 obj=new InstanceClass2();
		obj.display();

	}

}
