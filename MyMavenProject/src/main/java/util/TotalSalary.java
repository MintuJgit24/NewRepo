package util;

public class TotalSalary extends HraClass {
	
	double total;
	
	public void totalSalary() {
		
		total=super.basicpay+super.hra-super.pf-super.ded+super.bonus;
		
	}

}
