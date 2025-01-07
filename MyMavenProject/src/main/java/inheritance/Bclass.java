package inheritance;

public class Bclass extends HierachialA {
	
	public void display2() {
		
		System.out.println("child 1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bclass obj=new Bclass();
		obj.display1();
		obj.display2();

	}


}
