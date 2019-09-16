/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			3
 */

package exercise2;

import java.util.Scanner;

public class TestGeometricObject
{
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner input=new Scanner(System.in);
		
		// Prompt user to enter radii for circle1 and circle2
		System.out.print("Enter radius of circle1: ");
		Circle circle1=new Circle(input.nextDouble());
		System.out.print("Enter radius of circle2: ");
		Circle circle2=new Circle(input.nextDouble());
		
		// Prompt user to enter width and length for rect1 and rect2
		System.out.print("Enter width and length of rectangle1: ");
		Rectangle rect1=new Rectangle(input.nextDouble(), input.nextDouble());
		System.out.print("Enter width and length of rectangle2: ");
		Rectangle rect2=new Rectangle(input.nextDouble(), input.nextDouble());
		
		input.close();
		
		// Find largest of the two circles and largest of the two rectangles
		System.out.print("Largest Circle is: ");
		System.out.println(GeometricObject.max(circle1, circle2)==circle1 ? "circle1" : "circle2");
		System.out.print("Largest Rectangle is: ");
		System.out.println(GeometricObject.max(rect1, rect2)==rect1 ? "rectangle1" : "rectangle2");
	}
}
