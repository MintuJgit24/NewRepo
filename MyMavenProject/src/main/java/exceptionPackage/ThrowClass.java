package exceptionPackage;

public class ThrowClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=16;
		
		if(age>=18) {
			
			System.out.println("eligibile for voting.");
		}
		else {
			throw new ArithmeticException("not eligible");
		}

	}

}
