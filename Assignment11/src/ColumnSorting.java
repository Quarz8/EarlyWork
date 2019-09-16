// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	11_3

import java.util.Scanner;

public class ColumnSorting
{

	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop to allow for re-runs
		while (true)
		{
			// Initialize 3x3 matrix
			double[][] matrix = new double[3][3];

			// Prompt user to enter a 3x3 array row by row to fill matrix[][]
			System.out.println("Enter a 3-by-3 matrix row by row: ");
			for (int row = 0; row < matrix.length; row++)
				for (int column = 0; column < matrix[row].length; column++)
					matrix[row][column] = s.nextDouble();

			// Initialize sorted array
			double[][] sorted = sortColumns(matrix);

			// Print original array
			System.out.println("\nThe original array is: ");
			for (int row = 0; row < matrix.length; row++)
			{
				for (int column = 0; column < matrix[row].length; column++)
					System.out.print(matrix[row][column] + " ");
				System.out.print("\n");
			}

			// Print sorted array
			System.out.println("\nThe column-sorted array is: ");
			for (int row = 0; row < matrix.length; row++)
			{
				for (int column = 0; column < matrix[row].length; column++)
					System.out.print(sorted[row][column] + " ");
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}

	// Returns 2D array with each row sorted from least to greatest
	public static double[][] sortColumns(double[][] m)
	{
		double[] temp = new double[m[0].length];
		double[][] sorted = new double[m.length][m[0].length];

		for (int column = 0; column < m[0].length; column++)
		{
			// Assign values to temp[]
			for (int row = 0; row < m.length; row++)
			{
				temp[row] = m[row][column];
			}

			// Sort temp and assign its elements to sorted[][]
			java.util.Arrays.sort(temp);
			for (int row = 0; row < m.length; row++)
				sorted[row][column] = temp[row];
		}
		return sorted;
	}

}