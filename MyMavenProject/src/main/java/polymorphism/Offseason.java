package polymorphism;

public class Offseason extends Onseason{

	public void discount(double clothprice) {
		
		double dis= 0.15 * clothprice;
		System.out.println("discount during Offseason is: "+dis);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Offseason obj=new Offseason();
		obj.discount(5000);
		
		Onseason obj1=new Onseason();
		obj1.discount(5000);

	}
}
