/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			2
 */

package exercise2;

import java.io.File;
import java.util.Scanner;

public class NamePopularity
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the year (2001-2010): ");
		String year = input.nextLine();

		System.out.print("Enter the gender (M/F): ");
		String gender = input.nextLine();

		System.out.print("Enter the name: ");
		String name = input.nextLine();
		input.close();

		System.out.println(readFile(year, gender, name));
	}

	// Reads file and returns String containing ranking of name in year
	public static String readFile(String year, String gender, String name)
	{
		// Create file based on user year input
		File file = new File("C:\\Users\\Warren\\babynameranking" + year + ".txt");

		int rank = -1;
		try
		{

			Scanner read = new Scanner(file);

			// Check each line for name in corresponding gender column
			while (read.hasNextLine())
			{
				String line = read.nextLine();
				String[] temp = line.split("\t");

				if (gender.equalsIgnoreCase("M") && name.equalsIgnoreCase(temp[1]))
					rank = new Integer(temp[0]);
				else if (gender.equalsIgnoreCase("F") && name.equalsIgnoreCase(temp[3]))
					rank = new Integer(temp[0]);
			}
			read.close();
		}
		catch (java.io.FileNotFoundException ex)
		{
			ex.printStackTrace();
			System.exit(-1);
		}

		if (rank == -1)
			return ("The name " + name + " is not ranked in year " + year);
		else
			return (name + " is ranked #" + rank + " in year " + year);
	}
}
