//Class: 		CS 1301/17
//Term: 		Fall 2017
//Instructor: 	Prof. Perry
//Name: 		Warren Davis
//Lab:			2_2

import java.util.Scanner;

public class Practice_2_2
{

	public static void main(String[] args)
	{
		// Declare float
		Scanner s = new Scanner(System.in);
		System.out.println("Please type a floating point number for R: ");
		float r=s.nextFloat();
		System.out.println("Please type a floating point number for F: ");
		float t=s.nextFloat();
		//Print values of floats
		System.out.println("The value of r is: "+r);
		System.out.println("The value of t is: "+t);
		s.close();
		
		//Prints sum, difference, and product of r and t
		//on separate lines respectively
		
		System.out.println("The sum of r and t is: "+(r+t));
		System.out.println("The difference of r and t is: "+(r-t));
		System.out.println("The product of r and t is: "+(r*t));
	}

}
