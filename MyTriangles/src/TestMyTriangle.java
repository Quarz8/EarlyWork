// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	8_3

import java.util.Scanner;

public class TestMyTriangle
{

	// Tests MyTriangle class methods using different user input
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop allows for re-runs of program
		while (true)
		{
			// Prompt user to enter 3 sides of a triangle. Store as double side1, side2,
			// side3
			System.out.print("Enter 3 sides of a triangle, spearated by spaces: ");
			double side1 = s.nextDouble(), side2 = s.nextDouble(), side3 = s.nextDouble();

			// Checks if input is valid. If so, prints area of the triangle. If not valid,
			// prints that the input is invalid.
			if (MyTriangle.isValid(side1, side2, side3))
				System.out.println("Area of the triangle:\t" + MyTriangle.area(side1, side2, side3));
			else
				System.out.println("This input is invalid.");
		}

	}

}
