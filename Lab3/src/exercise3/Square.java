/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			3
 */

package exercise3;

public class Square extends GeometricObject implements Colorable
{
	private double side;

	public Square()
	{
	}

	public Square(double side)
	{
		this.side = side;
	}

	public Square(double side, String color, boolean filled)
	{
		this.side = side;
		setColor(color);
		setFilled(filled);
	}

	/** Return length of side */
	public double getSide()
	{
		return side;
	}

	/** Set a new length of side */
	public void setWidth(double side)
	{
		this.side = side;
	}

	/** Return area */
	public double getArea()
	{
		return side * side;
	}

	/** Return perimeter */
	public double getPerimeter()
	{
		return 4 * side;
	}

	/** Displays how to color a square */
	public void howToColor()
	{
		System.out.println("Color all four sides");
	}
}
