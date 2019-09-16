// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	5_5

import java.util.Scanner;

public class Payroll 
{

	// Reads user inputs and prints a payroll statement
	public static void main(String[] args) 
	{
		// Scanner for user input
		Scanner s=new Scanner(System.in);
		// Prompt user to enter employee name; store as String name
		System.out.print("Enter employee's name: ");
		String name=s.nextLine();
		// Prompt user to enter number of hours worked in a week; store as double hours
		System.out.print("Enter number of hours worked in a week: ");
		double hours=s.nextDouble();
		// Prompt user to enter hourly pay rate; store as double payRate
		System.out.print("Enter hourly pay rate: ");
		double payRate=s.nextDouble();
		// Prompt user to enter federal tax withholding rate; store as double fedTax
		System.out.print("Enter federal tax withholding rate as a decimal: ");
		double fedTax=s.nextDouble();
		// Prompt user to enter state tax withholding rate; store as double stateTax
		System.out.print("Enter state tax withholding rate as a decimal: ");
		double stateTax=s.nextDouble();
		// Declare gross pay as grossPay
		double grossPay=(payRate*hours);
		// Print employee name
		System.out.println("Employee Name: "+name);
		// Print hours worked
		System.out.println("Hours Worked: "+hours);
		// Print pay rate
		System.out.println("Pay Rate: $"+payRate);
		//Print gross pay
		System.out.println("Gross Pay: $"+grossPay);
		// Deductions list
		System.out.println("Deductions:");
		// Print Federal withholding
		System.out.println("  Federal Withholding ("+ fedTax*100+"%): $"+((int)(100*(fedTax*grossPay))/100.0));
		// Print State withholding
		System.out.println("  State Withholding ("+ stateTax*100+"%): $"+((int)(100*(stateTax*grossPay))/100.0));
		// Print total deduction
		System.out.println("  Total Deduction: $"+ (((int)(100*(fedTax*grossPay))/100.0)+((int)(100*(stateTax*grossPay))/100.0)));
		// Print net pay
		System.out.println("Net Pay: $"+(grossPay-(((int)(100*(fedTax*grossPay))/100.0)+((int)(100*(stateTax*grossPay))/100.0))));

	}

}
