package superSample;

public class ChildClassmethod extends ParentClassmethod{

	public void show() {
		
		System.out.println("from child");
		super.display();
		super.display2();
		this.show2();
	}
	
	public void show2() {
		
		System.out.println("from child method2");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClassmethod obj=new ChildClassmethod();
		obj.show();
	}
}
