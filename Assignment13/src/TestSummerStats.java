// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	13_2

public class TestSummerStats
{

	public static void main(String[] args)
	{
		SummerStats stats = new SummerStats(4, 5);

		// Print original salaries 2D array
		for (int row = 0; row < stats.getSalaries().length; row++)
		{
			for (int column = 0; column < stats.getSalaries()[row].length; column++)
				System.out.print(stats.getSalaries()[row][column] + " ");
			System.out.println();
		}

		// Test and print class methods
		System.out.println("\nThe index of the person with the most total money is " + stats.personMostMoney());
		System.out.println(
				"The index of the year in which the single highest salary was earned is " + stats.yearHighestSalary());
		System.out.printf("The total earnings of the specified person/index (3) is %.2f", stats.personTotalMoney(3));
		System.out.printf("\nThe total earnings of all persons combined is %.2f", stats.allTotalMoney());
		System.out.println("\nThe index of the person with the highest salary for the specified year(3) is "
				+ stats.personHighestSalary(3));

		// Test and print averageSalariesPerYear() method
		System.out.print("The average salaries for each year are: ");
		for (int i = 0; i < stats.averageSalariesPerYear().length; i++)
			System.out.printf("%.2f ", stats.averageSalariesPerYear()[i]);
		System.out.println();

		// Test and print sortByRowTotals() method
		System.out.println("The stats chart sorted by total earnings per person is: ");
		for (int row = 0; row < stats.sortByRowTotals().length; row++)
		{
			for (int column = 0; column < stats.sortByRowTotals()[row].length; column++)
				System.out.printf("%.2f ", stats.sortByRowTotals()[row][column]);
			System.out.println();
		}
	}

}
