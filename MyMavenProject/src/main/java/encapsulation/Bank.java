package encapsulation;

public class Bank {
	
	private int pin;
	
	public void setPin(int pin) {
		this.pin=pin;
		
	}
	
	public int getPin() {
		
		return pin;
	}
	
	public void validatePin() {
		
		if(pin==1001||pin==1234||pin==1212) {
			System.out.println("pin is valid.");
		}
		else {
			System.out.println("pin is not valid.");
		}
	}

}
