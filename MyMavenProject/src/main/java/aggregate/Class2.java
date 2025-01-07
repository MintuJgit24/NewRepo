package aggregate;

public class Class2 {

	String name;
	int age;
	Class1 ref;
	
	public Class2(String name,int age, Class1 ref) {
		this.name=name;
		this.age=age;
		this.ref=ref;
	}
	
//	public void setAllParams(String name,int age, Class1 ref) {
//		this.name=name;
//		this.age=age;
//		this.ref=ref;
//	}
	
	public void display() {
		
		System.out.println("name is:"+name);
		System.out.println("age is:"+age);
		System.out.println("state is:"+ref.state);
		System.out.println("code is:"+ref.code);
	}
	
	
	public static void main(String[] args) {
		Class1 obj2=new Class1("Kerala",1234);
		//Class2 obj=new Class2("Neethu",50,obj2);
		
		Class2 class2 = new Class2("ABCD", 50, obj2);
		//class2.setAllParams("Mintu", 20, obj2);
		class2.display();
		
		
		//obj.display();

	}

}
