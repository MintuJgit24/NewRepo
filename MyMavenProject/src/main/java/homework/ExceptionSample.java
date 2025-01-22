package homework;

public class ExceptionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b;
		
		try {
			b=a/0;
		}
		catch(Exception ex) {
			
			throw new ArithmeticException("division by zero not possible");
			
		}

	}

}
