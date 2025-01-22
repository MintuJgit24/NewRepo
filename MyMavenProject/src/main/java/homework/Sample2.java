package homework;

public class Sample2 {

	int rollno;
	Sample1 ref;
	
	public Sample2(int rollno, Sample1 ref) {
		this.rollno=rollno;
		this.ref=ref;
	}
	
	public void display2() {
		System.out.println("name is: "+ref.name);
		System.out.println("age is: "+ref.age);
		System.out.println("roll no is: "+rollno);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 sam1=new Sample1("Kevin",30);	
		Sample2 sam2=new Sample2(23,sam1);
		sam2.display2();
		sam1.display();
		System.out.println("sum from class1 is: "+ sam1.sum(5, 10));
	}
}
