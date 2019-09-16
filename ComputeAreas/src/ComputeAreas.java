// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Lab: 		8_2

import java.util.Scanner;

// Defines 4 methods squareArea, rectangleArea, circleArea, and triangleArea
public class ComputeAreas
{

	// Returns area of a square
	public static double squareArea(double side)
	{
		double area = (side * side);

		return area;
	}

	// Returns area of a rectangle
	public static double rectangleArea(double width, double length)
	{
		double area = (width * length);

		return area;
	}

	// Returns area of a circle
	public static double circleArea(double radius)
	{
		double area = Math.PI * Math.pow(radius, 2);

		return area;
	}

	// Returns area of a right triangle
	public static double triangleArea(double base, double height)
	{
		double area = (base * height) / 2;

		return area;
	}

	// Reads user input for side of square, length and width of rectangle, radius of
	// circle, and base and height of triangle. Loops to allow user to re-run with
	// multiple inputs.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		while (true) // Allows for user to re-run program
		{
			// Prompt user to input side, length, width, radius, base, and height. Store as
			// doubles
			System.out.print("Enter the length of the side of a square: ");
			double side = s.nextDouble();
			System.out.print("Enter the width and length of a rectangle (separated by a space): ");
			double width = s.nextDouble(), length = s.nextDouble();
			System.out.print("Enter the radius of a circle: ");
			double radius = s.nextDouble();
			System.out.print("Enter the base and height of a triangle: ");
			double base = s.nextDouble(), height = s.nextDouble();

			// Prints user input followed its respective area.
			System.out.println("\nSquare Side =\t\t" + side);
			System.out.println("\nSquare Area =\t\t" + squareArea(side));
			System.out.println("\nRectangle Width =\t" + width);
			System.out.println("Rectangle Length =\t" + length);
			System.out.println("\nRectangle Area =\t" + rectangleArea(width, length));
			System.out.println("\nCircle Radius =\t\t" + radius);
			System.out.println("\nCircle Area =\t\t" + circleArea(radius));
			System.out.println("\nTriangle Base =\t\t" + base);
			System.out.println("Triangle Height =\t" + height);
			System.out.println("\nTriangle Area =\t\t" + triangleArea(base, height));
		}

	}

}
