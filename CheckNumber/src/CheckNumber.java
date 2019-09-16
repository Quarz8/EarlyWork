// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	3_1

import java.util.Scanner;

public class CheckNumber 
{

	// Determines whether user input is positive, negative, or zero. Prints results.
	public static void main(String[] args) 
	{
		
		// Scanner to read user input
		Scanner s=new Scanner(System.in);
		// Asks for and stores number input by user and stores as a double
		System.out.println("Please enter a number: ");
		double number=s.nextDouble();
		// Check if number equals zero
		if (number==0)
		{
			System.out.println("The number "+number+" is zero.");
		}
		// Check if number is positive
		else if (number>0)
		{
			System.out.println("The number "+number+" is positive.");
		}
		// Assume number to be negative
		else
		{
			System.out.println("The number "+number+" is negative.");
		}

	}

}
