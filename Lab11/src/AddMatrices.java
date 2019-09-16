// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			11_2

import java.util.Scanner;

public class AddMatrices
{

	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop to allow re-runs
		while (true)
		{
			// Initialize 3x3 matrices matrix1 and matrix2
			double[][] matrix1 = new double[3][3];
			double[][] matrix2 = new double[3][3];

			// Prompt user to enter 3x3 matrix1
			System.out.print("Enter matrix1: ");
			for (int row = 0; row < matrix1.length; row++)
				for (int column = 0; column < matrix1[row].length; column++)
					matrix1[row][column] = s.nextDouble();

			// Prompt user to enter 3x3 matrix2
			System.out.print("Enter matrix2: ");
			for (int row = 0; row < matrix2.length; row++)
				for (int column = 0; column < matrix2[row].length; column++)
					matrix2[row][column] = s.nextDouble();

			// Initialize the sum of these matrices using addMatrix() method
			double[][] sum = addMatrix(matrix1, matrix2);

			// Print addition process
			System.out.println("The matrices are added as follows");
			for (int row = 0; row < matrix1.length; row++)
			{
				// Print matrix1
				for (int column = 0; column < matrix1[row].length; column++)
					System.out.print(matrix1[row][column] + " ");

				// Space and/or "+" between matrix1 and matrix2
				if (row == 1)
					System.out.print(" +  ");
				else
					System.out.print("    ");

				// Print matrix2
				for (int column = 0; column < matrix2[row].length; column++)
					System.out.print(matrix2[row][column] + " ");

				// Space and/or "=" between matrix2 and sum
				if (row == 1)
					System.out.print(" =  ");
				else
					System.out.print("    ");

				// Print sum of matrices
				for (int column = 0; column < sum[row].length; column++)
					System.out.print(sum[row][column] + " ");

				// New line for next row of matrices
				System.out.print("\n");
			}
		}
	}

	// Returns sum of 2 matrices.
	public static double[][] addMatrix(double[][] a, double b[][])
	{
		double[][] c = new double[a.length][a[0].length];

		for (int i = 0; i < c.length; i++)
			for (int j = 0; j < c[i].length; j++)
				c[i][j] = (a[i][j] + b[i][j]);

		return c;
	}
}
