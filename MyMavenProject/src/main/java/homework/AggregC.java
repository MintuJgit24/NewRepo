package homework;

public class AggregC {
	
	String address;
	AggregP ref;
	
	public AggregC(String address, AggregP ref) {
		this.address=address;
		this.ref=ref;
	}
	
	public void display() {
		
		System.out.println("Name is: "+ref.name);
		System.out.println("Age is: "+ref.age);
		System.out.println("Address is: "+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AggregP obj1=new AggregP("Krishna",45);
		AggregC obj2=new AggregC("Ambadi House, Kochi",obj1);
		obj2.display();
		
		System.out.println("sum from parent class method: "+ obj1.sum(4, 6));

	}
}
