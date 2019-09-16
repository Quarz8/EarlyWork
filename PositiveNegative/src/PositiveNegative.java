// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	7_1

import java.util.Scanner;

public class PositiveNegative
{

	// Reads an unspecified number of integers and determines how many positive and
	// negative numbers there are, the sum of the numbers and average of the numbers
	// as a float, not including zero. Input of zero is used to end the program. If
	// only zero is entered, display “No numbers are entered except 0”
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Allows program to run multiple times
		while (true)
		{
			// Declares integers for positive/negatives counts, sum, and input count (not
			// including zero)
			int positives = 0, negatives = 0, sum = 0, count = 0;

			// Prompt user to enter integers, ending input with 0. Starts by reading first
			// input
			System.out.print("Enter an integer, the input ends if it is 0: ");
			int input = s.nextInt();

			// Checks if first number entered was 0, else continues to determine and print
			// totals and average
			if (input == 0)
				System.out.println("No numbers entered excpet 0");
			else
			{
				while (input != 0)
				{
					if (input > 0)
						positives++;
					else if (input < 0)
						negatives++;
					sum += input;
					count++;

					// Moves to next input
					input = s.nextInt();
				}
				// Prints results
				System.out.println("The number of positives is " + positives);
				System.out.println("The number of negatives is " + negatives);
				System.out.println("The total (sum) is " + sum);
				System.out.println("The average is " + ((float) sum / (float) count));
			}
		}

	}

}
