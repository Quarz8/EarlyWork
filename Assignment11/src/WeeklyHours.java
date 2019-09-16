// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	11_1

import java.util.*;

public class WeeklyHours
{
	// Returns 2D array sorted by row (Highest sum row on top). Column index 8
	// contains sum of its row.
	public static int[][] sortByRowSum(int[][] list)
	{
		int[] sums = new int[list.length];
		int[][] sorted = new int[list.length][9];

		// Assign the sums of the rows of list[][] to sums[]
		for (int i = 0; i < list.length; i++)
		{
			sums[i] = list[i][8];
		}

		// Sort sums to determine lowest-highest hours
		Arrays.sort(sums);

		// Read sums backwards and find the equivalent sum in the eighth column of
		// list[][] if last element in sums[] (largest int) matches element in 8thcolumn
		// of list, the corresponding row from list[][] is copied to the first row in
		// sorted[][]. Repeat until first element in sums[] (smallest int) is matched to
		// element in 8th column of list and the corresponding row from list[][] is
		// copied to the last row in sorted[][].
		for (int i = 0; i < sums.length; i++)
		{
			for (int j = 0; j < sums.length; j++)
			{
				if (sums[sums.length - (i + 1)] == list[j][8])
				{
					// Copy values of list[j] into sorted[i], remove list[j]'s sum value at column
					// index 8.
					// sorted[i] = Arrays.copyOf(list[j], list[j].length);
					System.arraycopy(list[j], 0, sorted[i], 0, list[j].length);
					list[j][8] = -1;
					break; // breaks out of "j" loop
				}
			}
		}
		return sorted;
	}

	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Prompt user to enter the number of employees to enter
		System.out.print("Input how many employees you wish to find the weekly hours of: ");
		int employees = s.nextInt();

		// Initialize list[][] size dependent on employees
		int[][] list = new int[employees][9];

		// Print header for user hour input
		System.out.printf("%-15s%-4s%-4s%-4s%-4s%-4s%-4s%-4s\n", "", "Su", "M", "T", "W", "Th", "F", "Sa");

		// Prompt user to enter hours into array as shown in sample input.
		for (int row = 0; row < employees; row++)
		{
			System.out.printf("%-15s", ("Employee " + row));
			for (int column = 0; column < list[row].length - 1; column++)
			{
				// Column index 0 contains employee number
				if (column == 0)
					list[row][column] = row;
				// Column 1-7 contains hours of Su-Sa
				else
				{
					list[row][column] = s.nextInt();
					assert list[row][column] >= 0 && list[row][column] <= 24 : "You can only have 0-24 hours in a day.";
				}
			}

			// Find sum of hours in row i of list[][]
			int sum = 0;
			// Sums column index 1-7 of current row
			for (int i = 1; i < list[row].length - 1; i++)
				sum += list[row][i];

			// Column index 8 contains sum of hours in row
			list[row][8] = sum;
		}

		// Create sorted version of list[][]
		int[][] sorted = sortByRowSum(list);

		// Print header of output table
		System.out.printf("\n%-15s%-15s\n", "Employee#", "Weekly Hours");
		System.out.println("--------------------------------");

		// Print body of table using column indexes 0 and 8 (employee # and weekly
		// hours)
		for (int i = 0; i < sorted.length; i++)
		{
			System.out.printf("%3s%-16d%-15d\n", "", sorted[i][0], sorted[i][8]);
		}
	}
}
