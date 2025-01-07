package inheritance;

public class SingleChild extends SingleInheritance {

	public void read() {
		System.out.println("hello child class");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleChild obj=new SingleChild();
		obj.read();
		obj.display();

	}

}
