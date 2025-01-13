package interfacePackage;

public class MainClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=20, b=10;
		Sum sum=new Sum();
		System.out.println("sum: "+sum.result(a,b));
		
		Product prod=new Product();
		System.out.println("product is: "+ prod.result(a, b));
		
		Division div=new Division();
		System.out.println("division value is: "+ div.result(a, b));
		
		Difference diff=new Difference();
		System.out.println("difference is: "+diff.result(a, b));
		

	}

}
