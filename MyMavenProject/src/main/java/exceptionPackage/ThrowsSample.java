package exceptionPackage;

public class ThrowsSample {

	//throws used to declare exception 
	public void display() throws ArithmeticException {
		
		System.out.println("inside method throws ArithmeticException.");
		
		int age = 15;
		if (age >= 18) {

			System.out.println("eligibile for voting.");
		} 
		else {
			throw new ArithmeticException("not eligible");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsSample obj=new ThrowsSample();
		obj.display();

	}

}
