// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Lab: 		3_4

import java.util.Scanner;

public class Practice_3_4 
{

	public static void main(String[] args) 
	{
		// Prompts user to enter x and y coordinate of a point
		// then outputs a message stating whether the point is 
		// on the origin, x axis, y-axis, or appears in a particular quadrant.
		
		Scanner s=new Scanner(System.in);
		//Ask user to input coordinates
		System.out.print("Enter an x coordinate and a y coordinate: ");
		double x=s.nextDouble();
		double y=s.nextDouble();
		//Check if point is on origin
		if(x==0&&y==0)
		{
			System.out.println("("+x+", "+y+") is the origin.");
		}
		//Check if point is on x-axis
		else if(x!=0&&y==0)
		{
			System.out.println("("+x+", "+y+") is on the x-axis.");
		}
		//Check if point is on y-axis
		else if(x==0&&y!=0)
		{
			System.out.println("("+x+", "+y+") is on the y-axis.");
		}
		//Check if point is in QI
		else if(x>0&&y>0)
		{
			System.out.println("("+x+", "+y+") is in the first quadrant.");
		}
		//Check if point is in QII
		else if(x<0&&y>0)
		{
			System.out.println("("+x+", "+y+") is in the second quadrant.");
		}
		//Check if point is in QIII
		else if(x<0&&y<0)
		{
			System.out.println("("+x+", "+y+") is in the third quadrant.");
		}
		//Point is in QIV
		else
		{
			System.out.println("("+x+", "+y+") is in the fourth quadrant.");
		}
	}
}
