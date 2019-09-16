// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			13_1

public class TotalArea
{
	/** Main method */
	public static void main(String[] args)
	{
		// Declare circleArray
		CircleWithPrivateDataFields[] circleArray;

		// Create circleArray
		circleArray = createCircleArray();

		// Print circleArray and total areas of the circles
		printCircleArray(circleArray);

		// Print the smallest and largest radii of the circles in the array
		minMax(circleArray);
	}

	/** Create an array of Circle objects */
	public static CircleWithPrivateDataFields[] createCircleArray()
	{
		CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];

		for (int i = 0; i < circleArray.length; i++)
		{
			circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
		}

		// Return Circle array
		return circleArray;
	}

	/** Print an array of circles and their total area */
	public static void printCircleArray(CircleWithPrivateDataFields[] circleArray)
	{
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for (int i = 0; i < circleArray.length; i++)
		{
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
		}

		System.out.println("---------------------------------------------");

		// Compute and display the result
		System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circleArray));
	}

	/** Add circle areas */
	public static double sum(CircleWithPrivateDataFields[] circleArray)
	{
		// Initialize sum
		double sum = 0;

		// Add areas to sum
		for (int i = 0; i < circleArray.length; i++)
			sum += circleArray[i].getArea();

		return sum;
	}

	/** Print the smallest and largest radii on separate lines */
	public static void minMax(CircleWithPrivateDataFields[] circleArray)
	{
		// Set first radius in array as both min and max
		double min = circleArray[0].getRadius();
		double max = circleArray[0].getRadius();

		// Compare radii of circleArray to current min max and replaces when necessary
		for (int i = 1; i < circleArray.length; i++)
		{
			min = (circleArray[i].getRadius() < min) ? circleArray[i].getRadius() : min;
			max = (circleArray[i].getRadius() > max) ? circleArray[i].getRadius() : max;
		}

		// Print min and max radii
		System.out.printf("The smallest circle has a radius = %f\n", min);
		System.out.printf("The largest circle has a radius = %f\n", max);
	}
}
