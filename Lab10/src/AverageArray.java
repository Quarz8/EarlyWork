// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			10_2

import java.util.Scanner;

public class AverageArray
{

	// Compute and display the average of values in an array. Prompt user to enter
	// 10 double values, invokes method, and displays average value. Allows for
	// re-runs.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop allows for user to re-reun program
		while (true)
		{
			// Array for double values
			double[] values = new double[10];

			// Prompt user to enter 10 double values and store them in values array
			System.out.print("Enter 10 double values: ");
			for (int i = 0; i < values.length; i++)
			{
				values[i] = s.nextDouble();
			}

			// Prints average of input values
			System.out.println("The average of these values is: " + average(values));
		}
	}

	// Finds average of an array of integers... and returns average as an integer.
	// Kind of pointless tbh
	public static int average(int[] array)
	{
		int total = 0;

		for (int i = 0; i < array.length; i++)
			total += array[i];

		return total / array.length;
	}

	// Returns average of an array of double values
	public static double average(double[] array)
	{
		double total = 0;

		for (int i = 0; i < array.length; i++)
			total += array[i];

		return total / array.length;
	}
}
