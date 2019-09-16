// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	12_1

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