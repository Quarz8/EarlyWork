// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	10_3

import java.util.Scanner;

public class SortStrings
{
	// Prompts user to enter the list size, reads the student names into an array of
	// strings, prints the array before sorting, pass array to the sort method, and
	// prints the sorted array. Allow user to re-run.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop to allow or re-runs
		while (true)
		{
			// Prompt user to input list size, and create array of that size
			System.out.print("Enter list size: ");
			String[] list = new String[s.nextInt()];

			// Prompt user to enter names of students and assign to list[]
			for (int i = 0; i < list.length; i++)
				list[i] = s.next();

			// Prints original list with proper labels
			System.out.print("List Before Sorting: " + list[0]);
			for (int i = 1; i < list.length; i++)
				System.out.print(", " + list[i]);

			// Sort the array
			sort(list);

			// Print sorted list with proper labels
			System.out.print("\nList After Sorting: " + list[0]);
			for (int i = 1; i < list.length; i++)
				System.out.print(", " + list[i]);

			// New line for re-run formatting
			System.out.print("\n");
		}
	}

	// Modified method from listing 7.8 to sort an array of Strings by alphabetical
	// order. Ignores case.
	public static void sort(String[] list)
	{
		for (int i = 0; i < list.length - 1; i++)
		{
			String currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++)
			{
				if (currentMin.compareToIgnoreCase(list[j]) > 0) // if current min comes after list[j]
				{
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i)
			{
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}
