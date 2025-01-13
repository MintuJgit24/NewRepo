package interfacePackage;

public class HDFC implements RBI {

	double amount;
	int duration;
	
	@Override
	public double recurringDeposit() {
		// TODO Auto-generated method stub
		
		double interest=amount*rate;
		double totalInterest=interest*duration;
		double finalAmount=totalInterest+amount;
		return finalAmount;
		
	}
	
	public HDFC(double amount, int duration) {
		this.amount=amount;
		this.duration=duration;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hdfc =new HDFC(100000,5);
		System.out.println("Amount for "+hdfc.duration+" years = Rs." + hdfc.recurringDeposit());
	}

}
