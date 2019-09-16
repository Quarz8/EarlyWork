// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	2_3

import java.util.Scanner;

public class Distance 
{

	public static void main(String[] args) 
	{
		//Program finds distance between 2 points
		Scanner s=new Scanner(System.in);
		//Ask user for first point and store x y values
		System.out.print("Please enter x1 and y1: ");
		double x1=s.nextDouble();
		double y1=s.nextDouble();
		//Ask user for second point and store x y values
		System.out.print("Please enter x2 and y2: ");
		double x2=s.nextDouble();
		double y2=s.nextDouble();
		//Compute distance between given points
		double distance=Math.pow(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2), .5);
		//Print result
		System.out.println("The distance between the two points is "+distance);
	}

}
