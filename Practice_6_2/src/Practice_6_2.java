// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Lab: 		6_2

public class Practice_6_2
{

	// Use nested loops to print a line of ********** (10) tapering to * (think
	// inverted right triangle)
	public static void main(String[] args)
	{
		// Declares int columns = 10 to represent columns of asterisks per line
		int columns = 10;

		// For 10 lines, for column columns print *, print new line at every end of
		// first loop
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			columns--;
		}

	}

}
