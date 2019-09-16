// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			11_1

//import java.util.Scanner;

public class SumArrayColumns
{
	// Prompts user to enter a 3-by-4 matrix and displays the sum of each column by
	// calling method sumColumns(). Program loops to allow for re-runs with
	// different inputs.
	public static void main(String[] args)
	{
		// Scanner for user input
		java.util.Scanner s = new java.util.Scanner(System.in);

		// Loop to allow for re-runs
		while (true)
		{
			// Initialize 3-by-4 matrix
			double[][] matrix = new double[3][4];

			// Prompt user to enter a 3-by-4 matrix
			System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");

			// Assign user input to matrix[][]
			for (int row = 0; row < matrix.length; row++)
			{
				for (int column = 0; column < matrix[row].length; column++)
				{
					matrix[row][column] = s.nextDouble();
				}
			}

			// Print sum of each column in matrix using sumColumn() method
			for (int i = 0; i < matrix[0].length; i++)
				System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
		}
	}

	// Method returns sum of all elements in a specified column in a matrix
	public static double sumColumn(double[][] m, int columnIndex)
	{
		double sum = 0;

		for (int i = 0; i < m.length; i++)
			sum += (m[i][columnIndex]);

		return sum;
	}
}
