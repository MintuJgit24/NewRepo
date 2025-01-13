package constructor;

public class MainClass {

	public MainClass(int a, int b) {
		int sum=a+b;
		System.out.println("sum from param const: "+sum);	
	}
	
	public MainClass() {
		
		System.out.println("default constructor.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass obj=new MainClass();
		MainClass obj2=new MainClass(5,10);

	}
}
