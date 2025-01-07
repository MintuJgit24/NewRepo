package inheritance;

public class Thirdlevel extends Secondlevel {

	public void show() {
		
		System.out.println("hi child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thirdlevel obj=new Thirdlevel();
		obj.display();
		obj.read();
		obj.show();
		

	}

}
