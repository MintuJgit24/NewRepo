package encapsulation;

public class Class1 {
	
	private String name;
	private int age;
	
	//every variables need set and get methods separately.
	
	//set
	public void setName(String name) {
		this.name=name;
		
	}
	
	//get
	public String getName() {
		return name;
		
	}
	
	public void setAge(int age) {
		this.age=age;
		
	}
	
	public int getAge() {
		return age;
	}

}
