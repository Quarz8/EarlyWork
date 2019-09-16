// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	6_3

import java.util.Scanner;

public class PasswordTest
{

	// Checks if user entered string is a “good password”. Good passwords contain at
	// least 8 characters, at least one lower-case letter, at least one upper-case
	// letter, at least one digit, and at least one character that is neither a
	// letter nor a digit. Print entered password and verdict (valid/invalid) on
	// separate lines with labels and lined up with escape characters.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop for repeated usage of program.
		while (true)
		{
			// Prompts user to enter a password. Store input as String pass
			System.out.print("Enter a password for security evaluation (not a scam):\t");
			String pass = s.nextLine();

			// Declare all booleans for a strong password (except length)
			boolean hasLowerCase = false;
			boolean hasUpperCase = false;
			boolean hasDigit = false;
			boolean hasSymbol = false;

			// Loop to check each char in String pass to see if it meets the 4 booleans
			for (int i = 0; i < pass.length(); i++)
			{
				if (Character.isLowerCase(pass.charAt(i)))
					hasLowerCase = true;
				if (Character.isUpperCase(pass.charAt(i)))
					hasUpperCase = true;
				if (Character.isDigit(pass.charAt(i)))
					hasDigit = true;
				if (Character.isLetterOrDigit(pass.charAt(i)))
					hasSymbol = true;
			}

			// Prints entered password with labels and formatting
			System.out.println("Entered Password:\t" + pass);

			// Final check of validity of password, then prints result
			if (pass.length() >= 8 && hasLowerCase && hasUpperCase && hasDigit && hasSymbol)
				System.out.println("Verdict:\t\tValid");
			else
				System.out.println("Verdict:\t\tInvalid");
		}

	}

}
