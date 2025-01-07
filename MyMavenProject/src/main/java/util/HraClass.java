package util;

public class HraClass extends Salary {
	
	double hra;
	double pf;
	
	public void calculateHRAandPF() {
		hra=0.05 * super.basicpay;
		pf=0.20 * super.basicpay;
		
	}

}
