// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	11_4

import java.util.Scanner;

public class IdenticalArrays
{

	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop to allow re-runs
		while (true)
		{
			// Declare list1 and list2 as 3x3 matrices
			int[][] list1 = new int[3][3];
			int[][] list2 = new int[3][3];

			// Prompt user to enter list1 and store elements into matrix
			System.out.print("Enter list1: ");
			for (int row = 0; row < list1.length; row++)
				for (int column = 0; column < list1[row].length; column++)
				{
					list1[row][column] = s.nextInt();
				}

			// Prompt user to enter list2 and store elements into matrix
			System.out.print("Enter list2: ");
			for (int row = 0; row < list2.length; row++)
				for (int column = 0; column < list2[row].length; column++)
				{
					list2[row][column] = s.nextInt();
				}

			// Display whether the 2 matrices are equal
			if (equals(list1, list2))
				System.out.println("The two arrays are identical");
			else
				System.out.println("The two arrays are not identical");
		}
	}

	// Returns true if matrices contain same elements in any order,
	public static boolean equals(int[][] m1, int[][] m2)
	{
		// Convert m1 and m2 into 1D array lists.
		int[] list1 = new int[m1.length * m1[0].length];
		int[] list2 = new int[m2.length * m2[0].length];
		int index = 0;
		for (int row = 0; row < m1.length; row++)
		{
			for (int column = 0; column < m1[0].length; column++)
			{
				list1[index] = m1[row][column];
				list2[index] = m2[row][column];
				index++;
			}
		}
		// Sort both lists
		java.util.Arrays.sort(list1);
		java.util.Arrays.sort(list2);
		// Compare each array one element at a time
		for (int i = 0; i < list1.length; i++)
		{
			int num1 = list1[i];
			int num2 = list2[i];
			if (num1 != num2)
				return false;
		}
		return true;
	}

}
