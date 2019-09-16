// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Lab: 		8_3

import java.util.Scanner;

// Defines methods reverse and isPalindrome
public class PalindromeInteger
{
	// Returns number in reverse
	public static int reverse(int number)
	{
		int reversed = 0;

		while (number != 0)
		{
			reversed = reversed * 10 + (number % 10);
			number /= 10;
		}
		return reversed;
	}

	// Returns true if number is the same forwards and backwards.
	public static boolean isPalindrome(int number)
	{
		return reverse(number) == number;
	}

	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop allows for user to re-run with different inputs
		while (true)
		{
			// Prompts user to enter an integer that doesn't contain leading zeros.
			System.out.print("Please enter an interger that does not start with zero: ");
			String input = s.next();

			// Asserts that there are no leading zeros in the user's input
			assert input.charAt(0) != '0' : "Input must not contain leading zeros.";

			// Converts input String to an integer for use in reverse and isPalindrome
			// methods.
			int number = Integer.parseInt(input);

			// Prints whether input number is a palindrome or not
			if (isPalindrome(number))
				System.out.println(number + " is a palindrome.\n");
			else
				System.out.println(number + " is not a palindrome.\n");
		}
	}

}
