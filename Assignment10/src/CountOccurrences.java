// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	10_1

import java.util.Scanner;

// Program reads integers between 1 and 100 and counts the occurrences of each. User input ends with 0.
public class CountOccurrences
{

	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop to allow user to re-run
		while (true)
		{
			// Prompts user to enter a list of integers between 1 and 100. Input ends with
			// 0.
			System.out.print("Enter the integers between 1 and 100: ");

			// Arbitrarily large number for array size, as user input size is unknown
			int[] list = new int[999999];

			// Assigns user input to array list, not including 0
			for (int i = 0; i < list.length; i++)
			{
				int number = s.nextInt();
				if (number != 0)
					list[i] = number;
				else
					break;
			}

			// Checks array list for occurrences of numbers 1-100
			for (int i = 1; i <= 100; i++)
			{
				int count = occurrences(list, i);
				if (count == 1)
					System.out.println(i + " occurs 1 time");
				else if (count > 1)
					System.out.println(i + " occurs " + count + " times");
			}
		}
	}

	// Returns count of specified number in array
	public static int occurrences(int[] list, int num)
	{
		int count = 0;

		for (int i = 0; i < list.length; i++)
			if (list[i] == num)
				count++;
		return count;
	}

}
