// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			10_3

import java.util.*;

public class IdenticalArrays
{

	// Prompts user to enter a list of integers and displays whether the two are
	// identical (have the same contents). First number in the input represents the
	// number of elements in the list and is not actually part of the list
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop to allow re-runs
		while (true)
		{
			// Prompt user to enter list1
			System.out.print("Enter list1: ");
			int[] list1 = new int[s.nextInt()];
			for (int i = 0; i < list1.length; i++)
				list1[i] = s.nextInt();

			// Prompts user to enter list2
			System.out.print("Enter list2: ");
			int[] list2 = new int[s.nextInt()];
			for (int i = 0; i < list2.length; i++)
				list2[i] = s.nextInt();

			// Print whether input lists are identical
			if (equals(list1, list2))
				System.out.println("Two lists are identical");
			else
				System.out.println("Two lists are not identical");
		}
	}

	// Determines if contents of two lists are the same by sorting each list. If
	// lists are the same afterwards, they are identical.
	public static boolean equals(int[] list1, int[] list2)
	{
		// Sort both lists
		Arrays.sort(list1);
		Arrays.sort(list2);

		return Arrays.equals(list1, list2);
	}
}
