package exceptionPackage;


public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArithmeticException
		/*
		int a=10;
		int div=a/0;
		System.out.println("division value: "+div); */
		
		
		//ArrayIndexOutOfBoundsException
		/*
		int arr[]= {1,2,3,4,5,6};
		for (int i=0;i<=8;i++) 
		{
			System.out.println("array is: "+arr[i]);
		}
		*/
		
		//NullPointerException
		String s1=null;
		System.out.println("string is: "+s1.length());	

	}
}
