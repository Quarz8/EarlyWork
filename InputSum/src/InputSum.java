// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	6_1

import java.util.Scanner;

public class InputSum
{

	// Prompts user to enter a positive integer number. If user enters -1, the
	// program will display the entered numbers followed by their sum on a separate
	// line. Use appropriate labels as shown. Program loops forever, allowing user
	// use different sets of inputs in one run.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop allows user to re-run program with a different set of inputs
		while (true)
		{
			// Declare String numbers and int sum for use in loop
			String numbers = "";
			int sum = 0;

			// Repeats prompt
			int input = 0;
			while (true)
			{
				// Prompt user to enter a positive number and store as int input
				System.out.print("Enter a positive integer, or -1 to see your entered numbers and their sum:\t");
				input = s.nextInt();
				assert input >= -1 : "Number entered must be -1 or greater.";
				if (input == -1)
					break;
				numbers = numbers.concat(input + ", ");
				sum += input;
			}
			// If user enters nothing before -1, prints that there were no numbers entered
			if (numbers.length() < 2)
				System.out.println("Entered Number:\tNone");

			// Prints list of entered numbers, without the ", " at the end
			else
				System.out.println("Entered Number:\t" + numbers.substring(0, numbers.length() - 2));

			// Prints sum
			System.out.println("The Sum:\t" + sum);
		}
	}

}
