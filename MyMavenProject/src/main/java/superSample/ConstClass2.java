package superSample;

public class ConstClass2 extends ConstClass1 {

	public ConstClass2() {
		super(2,3);//super should be first statement
		System.out.println("im from child constructor");
	}
	
	public ConstClass2(int a,int b) {
		super(10,20,30);//super can be used only once inside a constructor
		int c=a+b;
		System.out.println("sum from child class second const: "+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstClass2 obj=new ConstClass2();
		ConstClass2 obj2=new ConstClass2(5,10);
		
	}

}
