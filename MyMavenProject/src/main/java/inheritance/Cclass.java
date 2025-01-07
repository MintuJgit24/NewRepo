package inheritance;

public class Cclass extends HierachialA {

	public void display3() {
		
		System.out.println("child 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cclass obj2=new Cclass();
		obj2.display1();
		obj2.display3();
	}

}
