package abstraction;

public class FullTimeEmployee extends Employee {

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return 8*getWage();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee Manu=new Employee();
		Manu.setWorkingHours(4);
		System.out.println("Salary of Manu: "+Manu.calculateSalary());
		
		Employee Nitha=new Employee();
		Nitha.setWorkingHours(7);
		System.out.println("Salary of Nitha: "+Nitha.calculateSalary());
		
		FullTimeEmployee Meera=new FullTimeEmployee();
		System.out.println("Salary of Meera: "+Meera.calculateSalary());
		

	}
	

}
