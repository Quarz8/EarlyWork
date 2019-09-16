// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	7_4

import java.util.Scanner;

public class OccurenceOfMaxNumbers
{

	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);
		// Allows user to run program multiple times
		while (true)
		{
			// Prompt user to enter integers, terminating with zero
			System.out.print("Enter integers, stopping with 0: ");

			int count = 1;
			int max = s.nextInt();

			while (max != 0)
			{
				int nextNum = s.nextInt();
				if (max < nextNum)
				{
					max = nextNum;
					count = 1;
				} else if (max == nextNum)
					count++;
				else if (nextNum == 0)
					break;
			}
			// Print outputs
			System.out.println("\nThe largest number is " + max);
			System.out.println("The occurence count of the largest number is " + count+"\n");

		}
	}
}
