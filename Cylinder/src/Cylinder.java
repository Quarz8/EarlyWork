// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	2_1

import java.util.Scanner;

public class Cylinder 
{

	public static void main(String[] args) 
	{
		// Gives area and volume of a cylinder based on given radius and length
		Scanner s=new Scanner(System.in);
		//Ask for user input for radius and length
		System.out.println("Please enter both the radius then the length of the cylinder separated by a space: ");
		double radius=s.nextDouble();
		double length=s.nextDouble();
		//Calculates area
		double area=radius*radius*Math.PI;
		//Calculates volume
		double volume=area*length;
		//Print results
		System.out.println("The base area is "+area);
		System.out.println("The volume is "+volume);

	}

}
