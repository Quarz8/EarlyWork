/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			2
 */

package exercise5;

import java.util.Scanner;
import java.net.URL;

public class ProcessDataSet
{

	public static void main(String[] args) throws Exception
	{
		// URL object creation
		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");

		// Scanner to read URL
		Scanner read = new Scanner(url.openStream());

		// Variables for total salary for each rank and total ranks
		double assistantSalary = 0;
		double associateSalary = 0;
		double fullSalary = 0;
		double totalSalary = 0;

		// Variables to record number of each rank and total ranks
		int assistants = 0;
		int associates = 0;
		int fulls = 0;
		int total = 0;

		// Read each line and record number of each faculty type and their corresponding
		// salaries
		while (read.hasNextLine())
		{
			String line = read.nextLine();
			String[] temp = line.split(" ");

			switch (temp[2])
			{
			case "assistant":
				assistantSalary += Double.parseDouble(temp[3]);
				totalSalary += Double.parseDouble(temp[3]);
				assistants++;
				total++;
				break;
			case "associate":
				associateSalary += Double.parseDouble(temp[3]);
				totalSalary += Double.parseDouble(temp[3]);
				associates++;
				total++;
				break;
			case "full":
				fullSalary += Double.parseDouble(temp[3]);
				totalSalary += Double.parseDouble(temp[3]);
				fulls++;
				total++;
				break;
			default:
				break;
			}
		}
		read.close();

		// Print total salaries for each rank and total ranks
		System.out.println("Total Salaries...");
		System.out.println("Assistant Professors: $"+assistantSalary);
		System.out.println("Associate Professors: $"+associateSalary);
		System.out.println("Full Professors: $"+fullSalary);
		System.out.println("All Faculty: $"+totalSalary);
		System.out.println();
		
		// Print average salary for each rank and total ranks
		System.out.println("Average Salaries...");
		System.out.println("Assistant Professors: $"+(assistantSalary/assistants));
		System.out.println("Associate Professors: $"+(associateSalary/associates));
		System.out.println("Full Professors: $"+(fullSalary/fulls));
		System.out.println("All Faculty: $"+(totalSalary/total));
	}

}
