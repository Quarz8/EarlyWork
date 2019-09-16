// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	8_3

// Defines methods isValid and area
public class MyTriangle
{
	// Checks if sum of any 2 sides is greater than the remaining side
	public static boolean isValid(double side1, double side2, double side3)
	{
		return (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
	}

	// Finds area of triangle based on its 3 sides
	public static double area(Double side1, double side2, double side3)
	{
		double s = (side1 + side2 + side3) / 2;

		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}
