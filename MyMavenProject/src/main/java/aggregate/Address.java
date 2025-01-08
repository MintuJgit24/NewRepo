package aggregate;

public class Address {

	String address;
	Student ref;
	
	public Address(String address, Student ref) {
		this.address=address;
		this.ref=ref;
		
	}
	
	public void display() {
		
		System.out.println("Student name: "+ref.name);
		System.out.println("Roll number: "+ref.rollno);
		System.out.println("Address: "+address);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student("Manu Thomas",12);
		Address obj2=new Address("Tharayil House,Kochi,PIN 678",obj);
		obj2.display();

	}
}
