package util;

import java.util.Scanner;


public class Salary{
	
	double basicpay;
	double ded;
	double bonus;

	public void employeeDetails() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic pay:");
		basicpay = sc.nextDouble();
		System.out.println("Enter the deduction:");
		ded=sc.nextDouble();
		System.out.println("Enter the bonus:");
		bonus=sc.nextDouble();
	}
	
}