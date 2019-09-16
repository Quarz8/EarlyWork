/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise1;

import java.util.Scanner;

public class TestTriangle
{

	public static void main(String[] args)
	{
		// Create scanner for user input
		Scanner s = new Scanner(System.in);

		// Prompt user to enter triangle information
		System.out.println("Enter info of a triangle...");
		System.out.print("Side1: ");
		double side1 = s.nextDouble();
		System.out.print("Side2: ");
		double side2 = s.nextDouble();
		System.out.print("Side3: ");
		double side3 = s.nextDouble();
		System.out.print("Color: ");
		String color = s.next();
		System.out.print("Filled (true/false): ");
		boolean filled = s.nextBoolean();
		s.close();

		// Create triangle object using above values
		Triangle test = new Triangle(side1, side2, side3);
		test.setColor(color);
		test.setFilled(filled);

		// Display the area, perimeter, color, and fill
		System.out.println("\nArea: " + test.getArea());
		System.out.println("Perimeter: " + test.getPerimeter());
		System.out.println("Color: " + test.getColor());
		System.out.println("Filled: " + test.isFilled());
	}

}
