//Class: 		CS 1301/17
//Term: 		Fall 2017
//Instructor: 	Prof. Perry
//Name: 		Warren Davis
//Lab:			5_1

import java.util.Scanner;

public class Pentagon 
{

	// Prompts user to enter length from center of a pentagon 
	// to a vertex and computes the area of the pentagon
	public static void main(String[] args) 
	{
		// Scanner for user input
		Scanner s=new Scanner(System.in);
		// Prompts user to input length (store as double length)
		System.out.print("Enter the length from the center of the pentagon to a vertex: ");
		double radius=s.nextDouble();
		// Asserts that radius must be greater than zero
		assert radius>0 : "Radius must be greater than zero.";
		// Declares double side as the length of a side of the pentagon based on given radius
		double side=2*radius*Math.sin(Math.PI/5);
		// Declares double area as the area of the pentagon rounded to 2 decimal places based on computed side
		double area=Math.round(100*((5*Math.pow(side, 2))/(4*Math.tan(Math.PI/5))))/100.0;
		// Prints rounded area of the pentagon
		System.out.print("The area of the pentagon is "+area);

	}

}
