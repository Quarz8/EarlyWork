// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			9_4

import java.util.Scanner;

// Defines method count
public class Occurrences
{

	public static int count(String str, char a)
	{
		int count = 0;

		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == a)
				count++;
		}
		return count;
	}

	// Prompts user to enter a String followed by a character and displays the
	// number of occurrences of the character in the String
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop to allow user to re-run program with new inputs
		while (true)
		{
			// Prompt user to enter a String. Store as String str
			System.out.print("Please enter a string: ");
			String str = s.nextLine();

			// Prompt user to enter a character. Store as char a
			System.out.print("Please enter a character: ");
			char a = s.nextLine().charAt(0);

			// Print result
			System.out.println(
					"The occurences of the character \'" + a + "\' in your String is:\t" + count(str, a) + "\n");
		}
	}

}
