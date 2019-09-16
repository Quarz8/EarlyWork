/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			3
 */

package exercise1;

import java.util.*;

public class DisplayCalendar extends GregorianCalendar
{

	// Test program
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner input = new Scanner(System.in);

		// Prompt user to enter year
		System.out.print("Enter full year (e.g., 2008): ");
		int year = input.nextInt();

		// Prompt user to enter month
		System.out.print("Enter month as a number between 1 and 12: ");
		int month = input.nextInt() - 1;
		while (month < 1 || month > 12)
		{
			System.out.print("Month must be between 1 and 12: ");
			month = input.nextInt() - 1;
		}
		
		input.close();

		// Creates GregorianCalendar object based on user inputs
		GregorianCalendar calendar = new GregorianCalendar(year, month, 1);

		// Print calendar for month and year
		printMonth(calendar);
	}

	/** Print the calendar for a month and year */
	public static void printMonth(GregorianCalendar calendar)
	{
		// Print headings of the calendar
		printMonthTitle(calendar);

		// Print the body of the calendar
		printMonthBody(calendar);
	}

	/** Print month title, e.g., March 2008 */
	public static void printMonthTitle(GregorianCalendar calendar)
	{
		System.out.println("\t" + getMonthName(calendar) + ", " + calendar.get(YEAR));
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	/** Get the English name for the month */
	public static String getMonthName(GregorianCalendar calendar)
	{
		String monthName = "";

		switch (calendar.get(MONTH))
		{
		case 0:
			monthName = "January";
			break;
		case 1:
			monthName = "February";
			break;
		case 2:
			monthName = "March";
			break;
		case 3:
			monthName = "April";
			break;
		case 4:
			monthName = "May";
			break;
		case 5:
			monthName = "June";
			break;
		case 6:
			monthName = "July";
			break;
		case 7:
			monthName = "August";
			break;
		case 8:
			monthName = "September";
			break;
		case 9:
			monthName = "October";
			break;
		case 10:
			monthName = "November";
			break;
		case 11:
			monthName = "December";
			break;
		}

		return monthName;
	}

	/** Print month body */
	public static void printMonthBody(GregorianCalendar calendar)
	{
		// Get start day of the week for the first date in the month
		int startDay = calendar.get(DAY_OF_WEEK) - 1;

		// Get number of days in the month
		int numberOfDaysInMonth = calendar.getActualMaximum(DAY_OF_MONTH);

		// Pad space before the first day of the month
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");

		for (i = 1; i <= numberOfDaysInMonth; i++)
		{
			System.out.printf("%4d", i);

			if ((i + startDay) % 7 == 0)
				System.out.println();
		}

		System.out.println();
	}
}
