package homework;

public class AbsClass2 extends AbsClass1{

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("hello child.");
		
	}
	
	public void show2() {
		System.out.println("show2 method from child.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsClass2 obj=new AbsClass2();
		obj.show2();
		obj.show();
		obj.display();
		
		//AbsClass1 obj2=new AbsClass2();
		//obj2.display();
		//obj2.show();
		

	}
}
