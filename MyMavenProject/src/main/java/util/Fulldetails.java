package util;

public class Fulldetails extends TotalSalary {
	
	public void display() {
		
		System.out.println("Basic pay: "+super.basicpay);
		System.out.println("Deduction: "+super.ded);
		System.out.println("HRA:"+super.hra);
		System.out.println("PF:"+super.pf);
		System.out.println("Bonus:"+super.bonus);
		System.out.println("Total salary:"+total);
		
		
	}
	
	public static void main(String args[]) {
		Fulldetails obj=new Fulldetails();
		obj.employeeDetails();
		obj.calculateHRAandPF();
		obj.totalSalary();
		obj.display();	
	}
}
  