package encapsulation;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj=new Bank();
		obj.setPin(1002);
		//obj.setPin(1212);
		
		System.out.println("enter the pin: "+obj.getPin());
		obj.validatePin();

	}

}
