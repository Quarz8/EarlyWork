// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	8_1

import java.util.Scanner;

// Defines method futureInvestmentValue
public class InvestmentValue
{
	// Computes the future investment value at a given interest rate for a specified
	// number of years.
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
	{
		return (investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12));
	}

	// Test program that prompts user to enter investment amount, annual interest
	// rate, and
	// prints a table that displays the future value for years 1-30.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Prompt user to enter amount invested, store as double investmentAmount
		System.out.print("The amount invested: ");
		double investmentAmount = s.nextDouble();

		// Prompt user to enter annual interest rate in percent, divide input by 12 and
		// store as double monthlyInterestRate
		System.out.print("Annual interest rate in percent: ");
		double monthlyInterestRate = (s.nextDouble() / 12) / 100; // Divide by 100 to convert from percent to decimal

		// Print top line of table
		System.out.printf("%-10s%12s\n", "Years", "Future Value");

		// Print body of table
		for (int i = 1; i <= 30; i++)
			System.out.printf("%-10d%11.2f\n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));

	}

}
