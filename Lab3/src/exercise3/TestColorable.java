/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			3
 */

package exercise3;

public class TestColorable
{

	public static void main(String[] args)
	{
		GeometricObject[] shapes = new GeometricObject[5];

		// Create GeometricObjects
		Square s1 = new Square();
		Square s2 = new Square(8);
		Square s3 = new Square(9, "purple", true);
		Square s4 = new Square(420, "green", false);
		Square s5 = new Square(999);

		// Fill array with GeometricObjects... all I have are squares in this package
		shapes[0] = s1;
		shapes[1] = s2;
		shapes[2] = s3;
		shapes[3] = s4;
		shapes[4] = s5;

		// Return area and invoke howToColor method for each colorable object in array
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Area of shape #" + i + " is " + shapes[i].getArea() + ".");
			if (shapes[i] instanceof Colorable)
			{
				shapes[i].howToColor();
			}
		}
	}
}