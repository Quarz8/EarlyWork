// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Lab: 		8_4

// Defines method computeCommission
public class ComputeCommissions
{

	// Returns commission amount based on graduated rates of 8% for the first
	// $5000, 10% for the next $5000, and 12% for anything after that.
	public static double computeCommission(double salesAmount)
	{
		double commission = 0;

		// If salesAmount is 5000 or less, calculates 8% of salesAmount and adds it to
		// commission
		if (salesAmount <= 5000)
		{
			commission += .08 * salesAmount;
		}
		// If salesAmount is 10000 or less, adds 8% of first $5000 to commission (400)
		// and removes first $5000 from salesAmount. Then adds 10% of remaining
		// salesAmount to commission as well.
		else if (salesAmount <= 10000)
		{
			commission += 400;
			salesAmount -= 5000;
			commission += .10 * salesAmount;
		}
		// If salesAmount is above 10000, adds the 8% of first $5000 and 10% of second
		// $5000 to commission (900) and removes $10000 from salesAmount. Then add 12%
		// of remaining salesAmount to commission as well.
		else
		{
			commission += 900;
			salesAmount -= 10000;
			commission += .12 * salesAmount;
		}

		return commission;

	}

	// Tests computeCommissions method by printing a table of every 5000 sales
	// amounts from 10000 to 100000 and their corresponding commission values.
	public static void main(String[] args)
	{
		// Sets salesAmount to first amount requested in table
		double salesAmount = 10000;

		// Prints top of table
		System.out.printf("%-20s %12s\n----------------------------------\n", "Sales Amount", "Commission");

		// Prints body of table
		while (salesAmount <= 100000)
		{
			System.out.printf("%-20.0f %10.1f\n", salesAmount, computeCommission(salesAmount));
			salesAmount += 5000;
		}

	}

}
