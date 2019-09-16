// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	8_2

//Defines method computeTax
public class TaxTable
{
	// Uses table 3.2 from book to calculate tax based on filing status and taxable
	// income.
	public static double computeTax(int status, double taxableIncome)
	{
		double tax = 0;

		if (status == 0) // compute tax for single filers
		{
			if (taxableIncome <= 8350)
				tax = taxableIncome * .1;
			else if (taxableIncome <= 33950)
				tax = 8350 * .1 + (taxableIncome - 8350) * .15;
			else if (taxableIncome <= 82250)
				tax = 8350 * .1 + (33950 - 8350) * .15 + (taxableIncome - 33950) * .25;
		}
		else if (status == 1) // compute tax for joint filers / widow(er)s
		{
			if (taxableIncome <= 16700)
				tax = taxableIncome * .1;
			else if (taxableIncome <= 67900)
				tax = 16700 * .1 + (taxableIncome - 16700) * .15;
		}
		else if (status == 2) // compute tax for married separate
		{
			if (taxableIncome <= 8350)
				tax = taxableIncome * .1;
			else if (taxableIncome <= 33950)
				tax = 8350 * .1 + (taxableIncome - 8350) * .15;
			else if (taxableIncome <= 68525)
				tax = 8350 * .1 + (33950 - 8350) * .15 + (taxableIncome - 33950) * .25;
		}
		else if (status == 3)// compute tax for head of household
		{
			if (taxableIncome <= 11950)
				tax = taxableIncome * .1;
			else if (taxableIncome <= 45500)
				tax = 11950 * .1 + (taxableIncome - 11950) * .15;
			else if (taxableIncome <= 117450)
				tax = 11950 * .1 + (45500 - 11950) * .15 + (taxableIncome - 45500) * .25;
		}

		return tax;

	}

	// Prints a tax table from $50,000 to $60,000 income with intervals of $50.
	public static void main(String[] args)
	{
		// Prints header of table
		System.out.printf("%-14s%-12s%-26s%-16s%s\n", "Taxable", "Single", "Married Joint", "Married", "Head of");
		System.out.printf("%-14s%-12s%-26s%-16s%s\n", "Income", "", "or Qualifying", "Separate", "a House");
		System.out.printf("%-14s%-12s%-26s%-16s%s\n", "", "", "Widow(er)", "", "");
		System.out.println("-------------------------------------------------------------------------------");

		// Prints body of table
		for (int i = 50000; i <= 60000; i += 50)
			System.out.printf("%-14d%-12d%-26d%-16d%d\n", i, Math.round(computeTax(0, i)), Math.round(computeTax(1, i)),
					Math.round(computeTax(2, i)), Math.round(computeTax(3, i)));

	}

}
