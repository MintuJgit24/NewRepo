package homework;

public class FanClass extends HomeClass {

	public void display3() {
		System.out.println("world");
	}
	
	public void show() {
		super.display1();
		super.display2();
		this.display3();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FanClass obj=new FanClass();
		obj.show();

	}
}
