// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			11_3

import java.util.Scanner;

public class LocateLargestElement
{
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop to allow for re-runs
		while (true)
		{
			// Prompt user to enter dimensions of 2D array
			System.out.print("Enter the number of rows and columns of the array: ");
			double[][] array = new double[s.nextInt()][s.nextInt()];

			// Prompt user to enter a 2 dimensional array
			System.out.println("Enter the array: ");
			for (int row = 0; row < array.length; row++)
				for (int column = 0; column < array[row].length; column++)
					array[row][column] = s.nextDouble();

			// Initialize location array using locateLargest() method
			int[] location = locateLargest(array);

			// Print the location of the largest element
			System.out.print("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");
		}
	}

	// Return location of largest element in 2D array
	public static int[] locateLargest(double[][] a)
	{
		int[] location =
		{ 0, 0 };
		double max = a[0][0];

		for (int row = 0; row < a.length; row++)
			for (int column = 0; column < a[row].length; column++)
			{
				if (max < a[row][column])
				{
					max = a[row][column];
					location[0] = row;
					location[1] = column;
				}
			}
		return location;
	}
}
