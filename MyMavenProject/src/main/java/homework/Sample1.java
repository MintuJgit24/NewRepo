package homework;

public class Sample1 {
	
	String name;
	int age;
	
	public Sample1(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void display() {
		System.out.println("display from sample1.");
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
}
