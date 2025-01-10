package abstraction;

public class Class2 extends Class1 {
	
	//for those abstract methods in parent class those need to be overridden in child class, else error will come
	public void diplaying() {
		
		System.out.println("hello child non-abst method.");
	}
	
//add unimplemented methods
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("hii hello child");
	}


	@Override
	void printing() {
		// TODO Auto-generated method stub
		System.out.println("hello second child method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 obj=new Class2();
		obj.display();
		obj.show();
		obj.diplaying();
		obj.printing();

	}

}
