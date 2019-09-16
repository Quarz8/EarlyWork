// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	5_3

import java.util.Scanner;

public class MathMethods 
{

	// Uses Math class methods to perform tasks.
	// Outputs are properly labeled and lined up with tab escape characters.
	public static void main(String[] args) 
	{
		// Scanner for user input
		Scanner s=new Scanner(System.in);
		// Part A:
		// Prompt user to enter a negative integer (store as numA)
		System.out.print("Enter a negative integer:\t\t\t\t\t");
		int numA=s.nextInt();
		// Assert that numA is negative
		assert numA<0 : "Input integer must be negative.";
		// Print absolute value of numA
		System.out.println("Absolute value of given number:\t\t\t\t\t"+Math.abs(numA));
		// Part B:
		// Prompt user to enter a floating-point number representing an angle (store as numB)
		System.out.print("Enter a floating-point number representing an angle in radians:\t");
		float numB=s.nextFloat();
		// Prints sine, cosine, and tangent of numB on separate lines
		System.out.println("Sine of given angle:\t\t\t\t\t\t"+Math.sin(numB));
		System.out.println("Cosine of given angle:\t\t\t\t\t\t"+Math.cos(numB));
		System.out.println("Tangent of given angle:\t\t\t\t\t\t"+Math.tan(numB));
		// Part C:
		// Prompt user to enter a floating-point number (store as numC)
		System.out.print("Enter a floating-point number:\t\t\t\t\t");
		float numC=s.nextFloat();
		// Prints floor and ceiling values of numC
		System.out.println("Floor of given number:\t\t\t\t\t\t"+Math.floor(numC));
		System.out.println("Ceiling of given number:\t\t\t\t\t"+Math.ceil(numC));
		// Part D:
		// Prompt user to enter two floating-point numbers (store as numDx and numDy)
		System.out.print("Enter two floating point numbers (X and Y):\t\t\t");
		float numDx=s.nextFloat();
		float numDy=s.nextFloat();
		// Prints numDx raised to the power of numDy
		System.out.println("X raised to the power of Y:\t\t\t\t\t"+Math.pow(numDx, numDy));
		// Part E:
		// Prompt user to enter an integer (store as numE)
		System.out.print("Enter any integer:\t\t\t\t\t\t");
		int numE=s.nextInt();
		// Prints square root of numE
		System.out.println("Square root of given number:\t\t\t\t\t"+Math.sqrt(numE));

	}

}
