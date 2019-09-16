// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	10_4

import java.util.Scanner;

public class StrictlyIdenticalArrays
{

	// Prompts user to enter a list of integers and displays whether the two are
	// identical (have the same contents). First number in the input represents the
	// number of elements in the list and is not actually part of the list
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Allows for re-runs of program
		while (true)
		{
			// Prompt user to enter list1, assign int values to list1[]
			// First int represents the array size.
			System.out.print("Enter list1: ");
			int[] list1 = new int[s.nextInt()];
			for (int i = 0; i < list1.length; i++)
				list1[i] = s.nextInt();

			// Prompt user to enter list2, assign int values to list2[]
			// First int represents the array size.
			System.out.print("Enter list2: ");
			int[] list2 = new int[s.nextInt()];
			for (int i = 0; i < list2.length; i++)
				list2[i] = s.nextInt();

			// Print whether input lists are identical
			if (equals(list1, list2))
				System.out.println("Two lists are strictly identical");
			else
				System.out.println("Two lists are not strictly identical");
		}
	}

	public static boolean equals(int[] list1, int[] list2)
	{
		// Check if lengths of arrays are equal
		if (list1.length != list2.length)
			return false;

		// Check if each value in array is equal
		for (int i = 0; i < list1.length; i++)
		{
			int num1 = list1[i];
			int num2 = list2[i];
			if (num1 != num2)
				return false;
		}
		// Arrays must be identical by this point
		return true;
	}
}
