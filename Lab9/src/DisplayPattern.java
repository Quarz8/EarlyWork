// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			9_2

import java.util.Scanner;

//Defines method displayPattern
public class DisplayPattern
{

	// Displays a pattern as shown in exercise 6.6 in book
	public static void displayPattern(int n)
	{

		// Copy of n to mess with
		int temp = n;

		// Turns temp into a String
		String base = "";// =Integer.toString(temp);

		// Finds base of pattern and stores as String base
		for (int k = 1; k <= n; k++)
		{
			if (temp == 1) // Doesn't add a space after final number, 1
				base = base.concat(Integer.toString(temp));
			else
				base = base.concat(Integer.toString(temp) + " ");
			temp--;
		}

		// Finds length of base String
		int length = base.length();

		// Prints pattern with base n. Uses printf with length to get spaces required
		for (int j = 0; j <= n - 1; j++)
		{
			if (j == 0) // Prints 1 by itself, avoids index range errors
				System.out.printf("%" + length + "s", "1");
			else if (j == n - 1) // prints base, avoids index range errors
				System.out.print(base);
			else // prints everything else in between pyramid. finds index of left most number
					// and uses it to print a substring of the base
				System.out.printf("%" + length + "s",
						base.substring(base.indexOf(" " + (Integer.toString(1 + j)) + " ")));

			System.out.print("\n"); // moves on to next line
		}
	}

	// Test for displayPattern method
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop to allow for re-run with different inputs
		while (true)
		{
			// Prompts user to enter an integer and store as int base
			System.out.print("Enter an integer to represent the base of the pattern: ");
			int base = s.nextInt();

			// Invoke the displayPattern method
			displayPattern(base);
		}

	}

	// Note:
	// Seems to break if input is too large. Even with the same input, outputs will
	// be different each time when anything around 1000+ is used for n. Hardcore.

}
