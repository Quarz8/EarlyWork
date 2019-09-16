// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			7_1

import java.util.Scanner;

public class Practice_7_1
{

	// Uses while loops to read an integer number between 20 and 60, then prints the
	// entered value followed by the sum of all even integer values between 2 and
	// the entered value (including entered value if even) on a separate line. Uses
	// a while loop to validate user input before determining and printing the sum.
	// Program loops to allow user to re-run with a different input.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loops entire program to allow multiple inputs
		while (true)
		{
			// Declare int sum for later use
			int sum = 0;

			// Prompt user to input an int between 20 and 60. Store as int input
			System.out.print("Enter an integer between 20 and 60: ");
			int input = s.nextInt();

			// Validates user input as between 20 and 60
			while (input < 20 || input > 60)
			{
				System.out.print("Invalid input. Reenter an integer between 20 and 60: ");
				input = s.nextInt();
			}

			// Determines value of sum of even numbers between 2 and input
			for (int i = 2; i <= input; i += 2)
			{
				sum += i;
			}

			// Prints input and sum of even numbers between 2 and input
			System.out.println("Entered value: " + input);
			System.out.println("Sum of even numbers between 2 and " + input + " is: " + sum);
		}

	}

}
