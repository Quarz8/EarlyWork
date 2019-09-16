// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	9_3

import java.util.Scanner;

public class PhoneKeypad
{

	// Returns corresponding number depending on char.
	// Returns 0 if char is not an uppercaseLetter
	public static int getNumber(char uppercaseLetter)
	{
		if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C')
			return 2;
		else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F')
			return 3;
		else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I')
			return 4;
		else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L')
			return 5;
		else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O')
			return 6;
		else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S')
			return 7;
		else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V')
			return 8;
		else if (uppercaseLetter >= 'W' && uppercaseLetter <= 'Z')
			return 9;
		else
			return 0; // This method has some inherent flaws.
	}

	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Allows user to re-run program.
		while (true)
		{
			// String where the final phone number will be built.
			String number = "";

			// Prompt user to enter a phone number, store as String input
			System.out.print("Enter a phone number: ");
			String input = s.nextLine();

			// Checks for any letters and replaces them withe corresponding number
			for (int i = 0; i < input.length(); i++)
			{
				if (Character.isLetter(input.charAt(i)))
					number = number + (getNumber(Character.toUpperCase(input.charAt(i))));
				else
					number = number + (input.charAt(i));
			}

			// Prints user input without letters
			System.out.println(number);
		}
	}

}
