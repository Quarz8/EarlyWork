// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	9_1
 
public class FeetMeters
{
	// Converts from feet to meters
	public static double footToMeter(double foot)
	{
		return .305 * foot;
	}

	// Converts from meters to feet
	public static double meterToFoot(double meter)
	{
		return 3.279 * meter;
	}

	public static void main(String[] args)
	{
		// Prints header of conversion table
		System.out.printf("%-10s%-10s%-5s%-10s%-10s\n", "Feet", "Meters", "|", "Meters", "Feet");

		// Declares doubles meters and feet
		double meters = 20.0;
		double feet = 1.0;

		// Prints body of table.
		while (feet <= 10.0)
		{
			System.out.printf("%-10.1f%-10.3f%-5s%-10.1f%-10.3f\n", feet, footToMeter(feet), "|", meters,
					meterToFoot(meters));
			feet++;
			meters += 5;
		}
	}

}
