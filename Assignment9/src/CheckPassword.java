// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	9_2

import java.util.Scanner;

public class CheckPassword
{
	// Returns true if string is at least 8 characters.
	public static boolean checkLength(String password)
	{
		return password.length() >= 8;
	}

	// Returns true if there are no symbols in string
	public static boolean onlyLettersAndDigits(String password)
	{
		boolean valid = true;

		for (int i = 0; i < password.length(); i++)
		{
			if (!Character.isLetterOrDigit(password.charAt(i)))
				return false;
		}
		return valid;
	}

	// Returns true if there are at least 2 digits in string
	public static boolean numberOfDigits(String password)
	{
		// Count of digits in password
		int count = 0;

		for (int i = 0; i < password.length(); i++)
		{
			if (Character.isDigit(password.charAt(i)))
				count++;
		}
		return count >= 2;
	}

	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Allows user to re-run program
		while (true)
		{
			// Prompt user to enter password, store as String password.
			System.out.print("Enter a password: ");
			String password = s.nextLine();

			// Use methods to check validity of password
			if (checkLength(password) && onlyLettersAndDigits(password) && numberOfDigits(password))
				System.out.println("Valid Password\n");
			else
				System.out.println("Invalid Password\n");
		}

	}

}
