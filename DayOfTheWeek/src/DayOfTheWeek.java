// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	4_2

import java.util.Scanner;

public class DayOfTheWeek 
{
	// Prompts user to enter a year, month, and
	// day of the month. Displays name of the day of the week.
	public static void main(String[] args) 
	{
		// Scanner for user input
		Scanner s=new Scanner(System.in);
		// Prompt user to enter year and store input
		System.out.print("Enter year: (e.g., 2012): ");
		int year=s.nextInt();
		// Prompt user to enter month and store input
		System.out.print("Enter month: 1-12: ");
		int month=s.nextInt();
		// Assert that month must be between 1-12
		assert month>0&&month<13 : month+" is not a valid month.";
		// Prompt user to enter day of the month and store input
		System.out.print("Enter the day of the month: 1-31: ");
		int dayOfMonth=s.nextInt();
		// Assert that day of month must be between 1-31
		assert dayOfMonth>0&&dayOfMonth<32 : dayOfMonth+" is not a valid day.";
		// Changes months 1 and 2 to 13 and 14 respectively 
		// and rolls year back by 1 in accordance to Zeller's congruence algorithm
		if(month==1)
		{
			month=13;
			year-=1;
		}
		else if (month==2)
		{
			month=14;
			year-=1;
		}
		// Declares day of the week based on Zeller's congruence algorithm
		int dayOfWeek=(dayOfMonth+(26*(month+1))/10+(year%100)+(year%100)/4+(year/100)/4+5*(year/100))%7;
		// Uses int result from dayOfWeek to determine proper output
		switch(dayOfWeek)
		{
		case 0: System.out.print("Day of the week is Saturday"); break;
		case 1: System.out.print("Day of the week is Sunday"); break;
		case 2: System.out.print("Day of the week is Monday"); break;
		case 3: System.out.print("Day of the week is Tuesday"); break;
		case 4: System.out.print("Day of the week is Wednesday"); break;
		case 5: System.out.print("Day of the week is Thursday"); break;
		case 6: System.out.print("Day of the week is Friday");
		}

	}

}
