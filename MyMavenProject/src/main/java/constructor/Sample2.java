package constructor;

public class Sample2 {
	
	public Sample2() {
		
		System.out.println("default constructor");
	}
	
	public Sample2(int a, int b) {
		int c=a+b;
		System.out.println("second constructor."+c);
	}
	
	public static int multiply(int a, int b) {
		return a*b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample2 sam=new Sample2();
		Sample2 sample=new Sample2(2,3);
		int mul=Sample2.multiply(3, 5);
		System.out.println("mul value: "+mul);

	}
}
