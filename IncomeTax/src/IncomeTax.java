// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	3_2

import java.util.Scanner;

public class IncomeTax 
{

	//Reads user’s annual income as int value
	//Prints income amount and tax bracket percentage on separate lines using a given scale
	public static void main(String[] args) 
	{
		// Scanner to read user input
		Scanner s=new Scanner(System.in);
		// Asks user to input annual income as an integer value and stores it
		System.out.println("Please input your anual income as an integer value: ");
		int income=s.nextInt();
		// Check if income is less than or equal to 50,000
		if(income<=50000)
		{
			System.out.println("Annual income:\t$"+income+"\nTax bracket:\t5%");
		}
		// Check if income is less than or equal to 100,000
		else if(income<=100000)
		{
			System.out.println("Annual income:\t$"+income+"\nTax bracket:\t15%");
		}
		// Check if income is less than or equal to 150,000
		else if(income<=150000)
		{
			System.out.println("Annual income:\t$"+income+"\nTax bracket:\t20%");
		}
		// Check if income is less than or equal to 250,000
		else if(income<=250000)
		{
			System.out.println("Annual income:\t$"+income+"\nTax bracket:\t30%");
		}
		// Check if income is less than or equal to 500,000
		else if(income<=500000)
		{
			System.out.println("Annual income:\t$"+income+"\nTax bracket:\t35%");
		}
		// Else assume income is greater than 500,000
		else
		{
			System.out.println("Annual income:\t$"+income+"\nTax bracket:\t50%");
		}
	}

}
