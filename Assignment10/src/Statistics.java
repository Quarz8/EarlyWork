// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	10_2

import java.util.Scanner;

//Prompts user to enter 10 numbers and displays the mean and standard deviation. Allow user to re-run with different inputs.
public class Statistics
{

	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop to allow user to re-run
		while (true)
		{
			// Initialize double[10]
			double[] x = new double[10];

			// Prompt user to enter 10 numbers and assign them to array x
			System.out.print("Enter ten numbers: ");
			for (int i = 0; i < x.length; i++)
				x[i] = s.nextDouble();

			// Print the mean and deviation of the array. Formatting to deal with double
			// rounding issues
			System.out.printf("The mean is %-10.2f\nThe standard deviation is %-10.5f\n", mean(x), deviation(x));
		}
	}

	// Returns the mean of an array of doubles
	public static double mean(double[] x)
	{
		double total = 0;

		for (int i = 0; i < x.length; i++)
			total += x[i];

		return total / x.length;
	}

	// Returns the standard deviation of an array of doubles
	public static double deviation(double[] x)
	{
		double total = 0;

		for (int i = 0; i < x.length; i++)
			total += Math.pow((x[i] - mean(x)), 2);

		return Math.sqrt(total / (x.length - 1));
	}
}
