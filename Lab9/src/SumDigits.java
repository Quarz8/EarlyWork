// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			9_1

import java.util.Scanner;

// Defines method sumDigits
public class SumDigits
{

	// Returns the sum of the digits in an integer.
	public static int sumDigits(long n)
	{
		// Gets rid of any potential negative in parameter
		n = Math.abs(n);

		// Declare sum for use in while loop
		int sum = 0;

		// Sums digits of given integer using %10 to single out the rightmost digit and
		// adds it to sum, then /10 to remove rightmost integer. Continue until integer
		// is reduced to zero.
		while (n != 0)
		{
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}

	// Test program for sumDigits method. Prompts user to input an integer and
	// displays the sum of its digits. Loops to allow user to re-run with new
	// inputs.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);
		// Loops to allow for re-runs of the program with different inputs
		while (true)
		{
			// Prompts user to enter an integer, stores the value as long number
			System.out.print("Please enter an integer: ");
			long number = s.nextLong();

			System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
		}
	}

}
