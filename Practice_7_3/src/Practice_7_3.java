// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			7_3

public class Practice_7_3
{

	// Use nested loops to print an asterisk triangle with a base of 15
	public static void main(String[] args)
	{
		int spaces=7; //Amount of spaces in first row
		int stars=1; //Amount of stars in first row
		// Loop for the 8 rows of the triangle
		for(int i=0; i<8; i++)
		{
			for(int j=0; j<spaces; j++)
				System.out.print(" ");
			for(int j=0; j<stars; j++)
				System.out.print("*");
			spaces--; //Removes 1 space from next row
			stars+=2; // Adds 2 more stars to next row
			
			//Moves to next row or shape
			System.out.print("\n");
		}

	}

}
