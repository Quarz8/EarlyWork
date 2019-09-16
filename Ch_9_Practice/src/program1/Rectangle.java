package program1;
/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Practice:	Ch. 9
 */

public class Rectangle
{
	double width = 1;
	double height = 1;

	/** Construct 1x1 rectangle */
	Rectangle()
	{
	}

	/** Construct rectangle with specified width and height */
	Rectangle(double newWidth, double newHeight)
	{
		width = newWidth;
		height = newHeight;
	}

	/** Returns area of this rectangle */
	double getArea()
	{
		return width * height;
	}

	/** Returns perimeter of this rectangle */
	double getPerimeter()
	{
		return (width * 2) + (height * 2);
	}
	
}