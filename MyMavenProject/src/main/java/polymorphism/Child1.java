package polymorphism;
//method overriding 

public class Child1 extends Sample1{
	
	public void sum(int a, int b) {
		//can call parent object like this also
		//super.sum(3, 2);
		int sub=a-b;
		System.out.println("difference is: "+sub);
	}
	
	public void cal(int a, int b) {
		
		int div=a/b;
		System.out.println("division value is: "+div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 obj=new Child1();
		obj.sum(10, 5);
		obj.cal(40,10);
		//can create parent object like this 
		Sample1 obj2=new Sample1();
		obj2.sum(3, 2);
		obj2.cal(4, 4);
	}
}
