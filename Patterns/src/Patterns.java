// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	7_2

public class Patterns
{

	// Use nested loops to display the 4 given patterns. Divide code into four
	// sections and use proper labels and formatting as needed.
	public static void main(String[] args)
	{
		int numColumns; // A single column in this case is 1 space and 1 number
		int spaceColumns; // A single column in this case is 2 spaces
		// int rows; // Each pattern has 6 rows, so this is unnecessary

		System.out.println("Pattern A"); // Label for first pattern

		numColumns = 1; // Columns of digits in first row

		for (int i = 0; i < 6; i++) // Number of rows
		{
			for (int j = 0; j < numColumns; j++) // Number of numColumns
				System.out.print((j + 1) + " ");
			numColumns++; // Plus 1 numColumn per row
			System.out.print("\n");
		}

		// -----------------------------------------------------------------------------

		System.out.println("\nPattern B"); // Label and spacing for second pattern

		numColumns = 6; // Columns of digits in first row
		spaceColumns = 0; // Columns of spaces in first row

		for (int i = 0; i < 6; i++) // Number of rows
		{
			for (int j = 0; j < numColumns; j++) // Number of numColumns
				System.out.print((j + 1) + " ");
			numColumns--; // Minus 1 numColumn per row
			System.out.print("\n");
		}

		// -----------------------------------------------------------------------------

		System.out.println("\nPattern C"); // Label...

		numColumns = 1; // Columns of digits in first row
		spaceColumns = 5; // Columns of spaces in first row

		for (int i = 0; i < 6; i++) // Number of rows
		{
			int number = 6; // Tweak to fix numbers in this pattern

			for (int j = 0; j < spaceColumns; j++) // Number of spaceColumns
			{
				System.out.print("  ");
				number--;
			}
			for (int j = 0; j < numColumns; j++) // Number of numColumns
				System.out.print((number--) + " ");
			numColumns++; // Plus 1 numColumn per row
			spaceColumns--; // Minus 1 spaceColumn per row
			System.out.print("\n");
		}

		// -----------------------------------------------------------------------------

		System.out.println("\nPattern D"); // Label...

		numColumns = 6; // Columns of digits in first row
		spaceColumns = 0; // Columns of spaces in first row

		for (int i = 0; i < 6; i++) // Number of rows
		{
			for (int j = 0; j < spaceColumns; j++) // Number of spaceColumns
				System.out.print("  ");
			for (int j = 0; j < numColumns; j++) // Number of numColumns
				System.out.print((j + 1) + " ");
			numColumns--; // Plus 1 numColumn per row
			spaceColumns++; // Minus 1 spaceColumn per row
			System.out.print("\n");
		}

	}

}
