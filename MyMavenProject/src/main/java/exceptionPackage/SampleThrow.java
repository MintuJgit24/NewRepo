package exceptionPackage;

public class SampleThrow {

	public static void display() throws ArithmeticException {
		
		System.out.println("from static method.");
		throw new ArithmeticException("throwing exception.");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			SampleThrow.display();
			
		}
		catch(ArithmeticException ex) {
			System.out.println("handled exception.");
			
		}

	}

}
