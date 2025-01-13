package constructor;

public class Sample {

	public void sum(int a, int b) {
		int c=a+b;
		System.out.println("sum of 1st method: "+c);
		
	}
	
	public void sum(int a, int b, int c) {
		
		int sum=a+b+c;
		System.out.println("sum from 2nd method: "+sum);
	}
	
	
	public float sum(float a, float b) {
		
		float sum=a+b;
		return sum;
	}
	
	public static void result(int a, int b) {
		int result=a*b;
		System.out.println("result of static method is: "+result);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample obj=new Sample();
		obj.sum(2, 3);
		obj.sum(5, 5, 5);
		System.out.println("sum from 3rd method: "+obj.sum(2.1f, 3.1f));
		Sample.result(5, 6);
		
	}

}
