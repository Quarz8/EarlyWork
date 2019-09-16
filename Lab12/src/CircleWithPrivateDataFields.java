// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			13_1

public class CircleWithPrivateDataFields
{
	/** The radius of the circle */
	private double radius;

	/** The number of objects created */
	private static int numberOfObjects = 0;

	/** Construct a circle with radius 1 */
	CircleWithPrivateDataFields()
	{
		radius = 1;
		numberOfObjects++;
	}

	/** Construct a circle with a specified radius */
	CircleWithPrivateDataFields(double newRadius)
	{
		radius = newRadius;
		numberOfObjects++;
	}

	/** Return radius */
	public double getRadius()
	{
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double newRadius)
	{
		radius = (newRadius >= 0) ? newRadius : 0;
	}

	/** Return numberOfObjects */
	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}

	/** Return the area of this circle */
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
}
