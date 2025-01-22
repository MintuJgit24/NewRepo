package superSample;

//using constructor
public class ConstClass1 {
	
	public ConstClass1(int a, int b) {	
		int sum=a+b;
		System.out.println("sum from parent class:"+sum);
	}
	
	public ConstClass1(int a,int b,int c) {
		int sum1=a+b+c;
		System.out.println("sum from parent class second const: "+sum1);
		
	}
}
