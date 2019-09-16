// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	11_2

import java.util.Scanner;

public class LargestRowColumn
{

	// Program randomly fills a 4x4 matrix with 0s and 1s, prints said matrix, and
	// finds the index of the first row and column with the most 1s. Loop to allow
	// for re-runs.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Variable for re-run loop
		boolean loop = true;

		// Loop to allow for re-runs
		while (loop)
		{
			// Initialize blank 4x4 matrix
			int[][] matrix = new int[4][4];

			// Assign random 0s and 1s to matrix
			for (int row = 0; row < matrix.length; row++)
				for (int column = 0; column < matrix[row].length; column++)
					matrix[row][column] = (int) (Math.random() * 2);

			// Initialize largest row and column indices
			int largestRowIndex = 0;
			int largestColumnIndex = 0;

			int maxRowSum = 0;
			int maxColumnSum = 0;
			// Search for largest row sum.
			for (int row = 0; row < matrix.length; row++)
			{
				int sum = 0;
				for (int column = 0; column < matrix[row].length; column++)
				{
					sum += matrix[row][column];
				}
				if (sum > maxRowSum)
				{
					maxRowSum = sum;
					largestRowIndex = row;
				}
			}

			// Search for largest column sum.
			for (int column = 0; column < matrix[0].length; column++)
			{
				int sum = 0;
				for (int row = 0; row < matrix.length; row++)
				{
					sum += matrix[row][column];
				}
				if (sum > maxColumnSum)
				{
					maxColumnSum = sum;
					largestColumnIndex = column;
				}
			}

			// Print matrix along with the indices of the largest row and column
			for (int row = 0; row < matrix.length; row++)
			{
				for (int column = 0; column < matrix[row].length; column++)
					System.out.print(matrix[row][column] + " ");
				System.out.print("\n");
			}
			System.out.println("The largest row index: " + largestRowIndex);
			System.out.println("The largest column index: " + largestColumnIndex);
			// Ask if user wishes to re-run
			System.out.print("Go again? (Y/N): ");
			for (;;)
			{
				String answer = s.nextLine();
				if (answer.equalsIgnoreCase("N"))
				{
					loop = false;
					break;
				}
				else if (answer.equalsIgnoreCase("Y"))
					break;
				else
					System.out.print("So... was that a yes or a no? (Y/N): ");
			}
		}
	}

}
