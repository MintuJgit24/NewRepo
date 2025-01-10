package homework;

public class PolymC extends PolymP{

	public void sum(int a, int b) {
		int diff=a-b;
		System.out.println("difference from child class: "+diff);
		super.sum(5, 3);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PolymP obj1=new PolymP();
		//obj1.sum(5, 3);
		
		PolymC obj2=new PolymC();
		obj2.sum(5, 3);
		
	}

}
