package accessSpecifiers;

//all types of access specifiers used
public class Sample1 {

	private void prime() {
		
		System.out.println("private method.");
	}
	
	protected void second() {
		
		System.out.println("protected method.");
	}
	
	//default method
	void third() {
		
		System.out.println("default method.");
	}
	
	public void fourth() {
		
		System.out.println("public method.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample1 smp=new Sample1();
		smp.prime();
		smp.second();
		smp.third();
		smp.fourth();

	}

}
