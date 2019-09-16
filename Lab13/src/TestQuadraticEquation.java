// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			13_3

import java.util.Scanner;

public class TestQuadraticEquation
{

	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Prompt user to enter values for a, b and c
		System.out.print("Enter a value for coefficient a: ");
		double a = s.nextDouble();
		System.out.print("Enter a value for coefficient b: ");
		double b = s.nextDouble();
		System.out.print("Enter a value for coefficient c: ");
		double c = s.nextDouble();

		// Create QuadraticEquation object "equation" using user inputs
		QuadraticEquation equation = new QuadraticEquation(a, b, c);

		// Print roots (if any) of quadratic equation
		if (equation.getDiscriminant() > 0)
		{
			System.out.printf("The equation has two roots %f and %f\n", equation.getRoot1(), equation.getRoot2());
		}
		else if (equation.getDiscriminant() == 0)
			System.out.printf("The equation has one root %f\n", equation.getRoot1());
		else
			System.out.println("The equation has no roots.");
	}

}
