// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			12_3

public class CircleWithStaticMembers
{
	/** The radius of the circle */
	double radius;

	/** The number of objects created */
	static int numberOfObjects = 0;

	/** Construct a circle with radius 1 */
	CircleWithStaticMembers()
	{
		radius = 1;
		numberOfObjects++;
	}

	/** Construct a circle with a specified radius */
	CircleWithStaticMembers(double newRadius)
	{
		radius = newRadius;
		numberOfObjects++;
	}

	/** Return numberOfObjects */
	static int getNumberOfObjects()
	{
		return numberOfObjects;
	}

	/** Return the area of this circle */
	double getArea()
	{
		return radius * radius * Math.PI;
	}
}
