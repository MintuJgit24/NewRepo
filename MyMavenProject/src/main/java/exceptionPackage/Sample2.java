package exceptionPackage;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,div;
		try {
			int div1=a/0;
			System.out.println("division value: "+div1);
			
		}
		catch(ArithmeticException ex) {
			
			//div=a/2;//just to print this inside catch div a/2 can also be executed
			//System.out.println("value of a:"+div);
			System.out.println("handled exception.");
			
		}
		finally {
			
			System.out.println("end of program.");
		}
	}
}
