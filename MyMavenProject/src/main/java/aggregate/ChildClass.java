package aggregate;

public class ChildClass {

	int rollno;
	String subject;
	
	ParentClass ref;//reference variable of parent class
	
	public ChildClass(int rollno,String subject,ParentClass ref) {
		this.rollno=rollno;
		this.subject=subject;
		this.ref=ref;
	}
	
	public void display() {
		
		System.out.println("hello");
		System.out.println("subject:"+subject);
		System.out.println("roll no:"+rollno);
		System.out.println("name and age:" +ref.name+ref.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass obj1=new ParentClass(45,"Meena");
		ChildClass obj=new ChildClass(4,"Hari",obj1);
		obj.display();

	}

}
