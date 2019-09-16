

// Note that people are rows and years are columns in a 2D array
public class SummerStats
{
	/** 2D array representing salaries */
	private double[][] salaries;

	/**
	 * Construct a SummerStats object. Array is filled with random numbers
	 * representing salaries 0.00 to 100000.00.
	 */
	public SummerStats(int people, int years)
	{
		salaries = new double[people][years];

		for (int row = 0; row < salaries.length; row++)
			for (int column = 0; column < salaries[row].length; column++)
				salaries[row][column] = ((int) (Math.random() * 10000001) / (double) 100);
	}

	/** A getter method for salaries */
	public double[][] getSalaries()
	{
		return salaries;
	}

	/** Returns index of person with most total earnings */
	public int personMostMoney()
	{
		double maxSum = 0;
		int maxSumIndex = 0;

		// Compare sum of each row to the next
		for (int row = 0; row < salaries.length; row++)
		{
			double sum = 0;
			for (int column = 0; column < salaries[row].length; column++)
			{
				sum += salaries[row][column];
			}
			if (sum > maxSum)
			{
				maxSum = sum;
				maxSumIndex = row;
			}
		}
		return maxSumIndex;
	}

	/** Returns index of the year containing the single highest salary */
	public int yearHighestSalary()
	{
		double maxSalary = 0;
		int highestSalaryYear = 0;

		// Compare each value in the array to the next
		for (int row = 0; row < salaries.length; row++)
			for (int column = 0; column < salaries[row].length; column++)
				if (salaries[row][column] > maxSalary)
				{
					maxSalary = salaries[row][column];
					highestSalaryYear = column;
				}

		return highestSalaryYear;
	}

	/** Returns total earnings of specified person */
	public double personTotalMoney(int person)
	{
		double totalMoney = 0;
		for (int column = 0; column < salaries[person].length; column++)
		{
			totalMoney += salaries[person][column];
		}

		return totalMoney;
	}

	/** Return total earnings of all people combined */
	public double allTotalMoney()
	{
		double totalMoney = 0;
		for (int row = 0; row < salaries.length; row++)
			for (int column = 0; column < salaries[row].length; column++)
				totalMoney += salaries[row][column];
		return totalMoney;
	}

	/** Returns index of person with highest salary for specified year */
	public int personHighestSalary(int year)
	{
		double highestSalary = 0;
		int highestSalaryIndex = 0;
		for (int row = 0; row < salaries.length; row++)
		{
			if (salaries[row][year] > highestSalary)
			{
				highestSalary = salaries[row][year];
				highestSalaryIndex = row;
			}
		}

		return highestSalaryIndex;
	}

	/** Return 1D array of average salary for each year */
	public double[] averageSalariesPerYear()
	{
		double[] averages = new double[salaries[0].length];

		for (int column = 0; column < salaries[0].length; column++)
		{
			double rowTotal = 0;
			for (int row = 0; row < salaries.length; row++)
			{
				rowTotal += salaries[row][column];
			}
			averages[column] = rowTotal / salaries.length;
		}
		return averages;
	}

	/**
	 * Returns 2D array sorted by total earnings per person, with highest total
	 * earnings on top
	 */
	public double[][] sortByRowTotals()
	{
		double[][] sorted = new double[salaries.length][salaries[0].length];

		// 1D array filled with -1.0.
		double[] ignore = new double[salaries[0].length];
		for (int i = 0; i < ignore.length; i++)
			ignore[i] = -1;

		// Create a new but identical array to salaries
		double[][] copy = new double[salaries.length][salaries[0].length];
		for (int row = 0; row < copy.length; row++)
			for (int column = 0; column < copy[row].length; column++)
				copy[row][column] = salaries[row][column];

		// Use variant of personMostMoney method for copy[][]. Once personMostMoney is
		// found, it is put in highest row in sorted set to be ignored in copy. This is
		// repeated until each row has effectively been transferred to sorted.

		for (int person = 0; person < copy.length; person++)
		{
			double maxSum = 0;
			int maxSumIndex = 0;
			// Compare sum of each row to the next
			for (int row = 0; row < copy.length; row++)
			{
				double sum = 0;
				for (int column = 0; column < copy[row].length; column++)
				{
					sum += copy[row][column];
				}
				if (sum > maxSum)
				{
					maxSum = sum;
					maxSumIndex = row;
				}

			}
			sorted[person] = copy[maxSumIndex];
			copy[maxSumIndex] = ignore;
		}
		return sorted;
	}
}
