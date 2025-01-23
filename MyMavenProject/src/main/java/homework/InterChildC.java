package homework;

public class InterChildC implements InterP{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("from display");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterP interp=new InterChildC();
		interp.display();
		System.out.println("static variable from parent: "+a);

	}
}
