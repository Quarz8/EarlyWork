// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Lab: 		6_4

import java.util.Scanner;

public class Practice_6_4
{

	// Reads string value from the user, prints out the entered string, and then
	// prints the string one character per line. Use proper labels.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Prompt user to enter string. Stores input as String input
		System.out.print("Please enter a string: ");
		String input = s.nextLine();

		// Prints entered input
		System.out.println("\nEntered String: " + input + "\n");

		// Loop displays each character of input line by line, with proper labels.
		for (int i = 0; i < input.length(); i++)
		{
			System.out.println("Character#" + (i + 1) + ":\t" + input.charAt(i));
		}

	}

}
