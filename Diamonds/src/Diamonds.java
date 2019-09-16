// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	6_4

public class Diamonds
{

	// Use nested loops to print a diamond and an hourglass separated by a line as
	// shown in the example
	public static void main(String[] args)
	{

		int spaces = 4; // First line of loop has 4 spaces
		int stars = 1; // First line of loop has 1 asterisk

		// Loop for first half of first shape (5 lines)
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < spaces; j++)
			{
				System.out.print(" ");
			}
			spaces--; // 1 less space per line
			for (int j = 0; j < stars; j++)
			{
				System.out.print("*");
			}
			stars += 2; // 2 more asterisks per line
			System.out.print("\n");
		}

		spaces = 1; // First line of loop has 1 space
		stars = 7; // First line of loop has 7 asterisks

		// Loop for second half of first shape (4 lines)
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < spaces; j++)
			{
				System.out.print(" ");
			}
			spaces++; // 1 more space per line
			for (int j = 0; j < stars; j++)
			{
				System.out.print("*");
			}
			stars -= 2; // 2 less asterisks per line
			System.out.print("\n");
		}

		// Separates the 2 shapes with empty lines
		System.out.print("\n");

		spaces = 0; // First line of loop has 0 spaces
		stars = 9; // First line of loop has 9 asterisks

		// Loop for first half of second shape (5 lines)
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < spaces; j++)
			{
				System.out.print(" ");
			}
			spaces++; // 1 more space per line
			for (int j = 0; j < stars; j++)
			{
				System.out.print("*");
			}
			stars -= 2; // 2 less asterisks per line
			System.out.print("\n");
		}

		spaces = 3; // First line of loop has 3 spaces
		stars = 3; // First line of loop has 3 asterisks

		// Loop for second half of second shape (4 lines)
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < spaces; j++)
			{
				System.out.print(" ");
			}
			spaces--; // 1 less space per line
			for (int j = 0; j < stars; j++)
			{
				System.out.print("*");
			}
			stars += 2; // 2 more asterisks per line
			System.out.print("\n");
		}

	}

}
