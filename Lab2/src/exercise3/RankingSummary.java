/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			2
 */

package exercise3;

import java.io.File;
import java.util.Scanner;

public class RankingSummary
{

	public static void main(String[] args) throws Exception
	{
		printTable();
	}

	// Reads file of corresponding year and returns String[] containing top 5 female
	// names and top 5 male names
	public static String[] readFile(int year) throws Exception
	{
		// File based on year input
		File file = new File("C:\\Users\\Warren\\babynameranking" + year + ".txt");

		Scanner read = new Scanner(file);
		String[] rankings = new String[10];

		// Stores top five names for both females and males
		for (int i = 0; i < 5; i++)
		{
			String line = read.nextLine(); // Stores next line of .txt file
			String[] temp = line.split("\t"); // Creates array of each word in line from .txt file
			rankings[i] = temp[3]; // Finds and stores female names in rankings
			rankings[i + 5] = temp[1]; // Finds and stores male names in rankings
		}
		read.close();
		return rankings;
	}

	// Prints a table of top 5 male and female names from 2010-2001
	public static void printTable() throws Exception
	{
		// Print header of table
		System.out.printf("%-8s ", "Year");
		for (int i = 0; i < 2; i++)
			for (int j = 1; j <= 5; j++)
				System.out.printf("%-11s ", "Rank " + j);
		System.out.println();

		// Print top 5 names for female and male for years 2010 down to 2001
		int year = 2010;
		while (year > 2000)
		{
			System.out.printf("%-8s ", year);
			for (int i = 0; i < 10; i++)
				System.out.printf("%-11s ", readFile(year)[i]);

			System.out.println();
			year--;
		}
	}
}