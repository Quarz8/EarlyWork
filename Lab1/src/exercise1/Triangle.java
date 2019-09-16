/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise1;

public class Triangle extends GeometricObject
{
	/** Data fields */
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	/** No-arg constructor */
	public Triangle()
	{
	}

	/** Constructor with specified sides */
	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/** Accessor methods for data fields */
	public double getSide1()
	{
		return side1;
	}

	public double getSide2()
	{
		return side2;
	}

	public double getSide3()
	{
		return side3;
	}

	/** Returns area of triangle */
	public double getArea()
	{
		// Half of triangle's perimeter
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	/** Returns perimeter of triangle */
	public double getPerimeter()
	{
		return side1 + side2 + side3;
	}

	/** Returns string description for triangle */
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side 3 = " + side3;
	}
}