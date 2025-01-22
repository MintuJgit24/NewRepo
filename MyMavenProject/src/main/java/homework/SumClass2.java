package homework;

public class SumClass2 extends SumClass1 {

	public SumClass2(int a, int b, int c) {
		super(5, 15);
		int sum=a+b+c;
		System.out.println("sum from class 2: "+sum);
		
	}
	
	public SumClass2(float a, float b) {
		super(1.2f,2.2f);
		float s=a+b;
		System.out.println("sum of class2 floats: "+s);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumClass2 sumclass=new SumClass2(1,2,3);
		SumClass2 sumclass2=new SumClass2(3,4);

	}
}
