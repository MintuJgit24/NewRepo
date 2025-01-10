package abstraction;

public class Employee extends Contractor{
	
	private int workingHours;
	private int wage=500;
	
	public void setWorkingHours(int workingHours) {
		this.workingHours=workingHours;
	}
	
	public int getworkingHours() {
		return workingHours;
	}
	
	public int getWage() {
		return wage;
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return workingHours*wage;
	}
}
