// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	12_1

public class TestRectangle
{
	// Test class Rectangle by creating 2 Rectangle objects. The first with a width
	// of 4 and height of 40, the second with a width of 3.5 and a height of 35.9.
	// Display the width, height, area, and perimeter of each rectangle in this
	// order.
	public static void main(String[] args)
	{
		// Creates 2 Rectangle objects with specified dimensions.
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		// Print width, height, area, and perimeter of rectangle1 with labels
		System.out.println("Width of rectangle1:\t\t" + rectangle1.width);
		System.out.println("Height of rectangle1:\t\t" + rectangle1.height);
		System.out.println("Area of rectangle1:\t\t" + rectangle1.getArea());
		System.out.println("Perimeter of rectangle1:\t" + rectangle1.getPerimeter());

		// Print width, height, area, and perimeter of rectangle2 with labels
		System.out.println("\nWidth of rectangle2:\t\t" + rectangle2.width);
		System.out.println("Height of rectangle2:\t\t" + rectangle2.height);
		System.out.println("Area of rectangle2:\t\t" + rectangle2.getArea());
		System.out.println("Perimeter of rectangle2:\t" + rectangle2.getPerimeter());
	}

}
