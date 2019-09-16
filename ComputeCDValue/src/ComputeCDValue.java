// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	7_3

import java.util.Scanner;

public class ComputeCDValue
{

	// Prompts user to enter an amount, annual percentage yield, and number of
	// months. Program displays a table that displays the CD value month by month
	// from 1 to the number of months input by the user.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Prompt user to enter initial deposit amount, and store as double deposit
		System.out.print("Enter the initial deposit amount: ");
		double deposit = s.nextDouble();

		// Prompt user to enter annual percentage yield, store as double yield
		System.out.print("Enter annual percentage yield: ");
		double yield = s.nextDouble();

		// Prompt user to enter maturity period in number of months, store as int months
		System.out.print("Enter maturity period (number of months): ");
		int months = s.nextInt();

		// Prints top of table
		System.out.println("\nMonth   CD Value");

		// Prints value of the CD at the end of each month
		for (int i = 1; i <= months; i++)
		{
			deposit += deposit * yield / 1200;
			System.out.printf("%-8d%8.2f\n", i, deposit);
		}

	}

}
