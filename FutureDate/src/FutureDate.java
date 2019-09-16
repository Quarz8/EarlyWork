//Class: 		CS 1301/17
//Term: 		Fall 2017
//Instructor: 	Prof. Perry
//Name: 		Warren Davis
//Lab:			4_2

import java.util.Scanner;

public class FutureDate 
{

	// Prompts user to enter an integer representing today's day of the week
	// (Sunday is 0, Monday is 1, etc.) Then prompts user to enter how many days have 
	// passed since today and returns the corresponding future day of the week
	public static void main(String[] args) 
	{
		// Make scanner for user input
		Scanner s=new Scanner(System.in);
		// Ask for number 0-6 and store it
		System.out.print("Enter today's day as an integer (Sunday is 0, Monday is 1, etc.): ");
		int today=s.nextInt();
		assert today>=0&&today<=6 : "That day simply doesn't exist. (Integer must be between 0 and 6)";
		// Ask for number of days passed since "today"
		System.out.print("Enter the number of days elapsed since today: ");
		int days=s.nextInt();
		assert days>0 : "Let focus on the future. (Integer must be greater than zero)";
		// Determine the future day's number
		int futureday=(days+today)%7;
		// Outputs beginning of result. Uses int value of "today" to determine output
		switch(today)
		{
			case 0: System.out.print("Today is Sunday and the future day is "); break;
			case 1: System.out.print("Today is Monday and the future day is "); break;
			case 2: System.out.print("Today is Tuesday and the future day is "); break;
			case 3: System.out.print("Today is Wednesday and the future day is "); break;
			case 4: System.out.print("Today is Thursday and the future day is "); break;
			case 5: System.out.print("Today is Friday and the future day is "); break;
			case 6: System.out.print("Today is Saturday and the future day is "); break;
		}
		// Outputs end of result. Uses int value of "futureday" to determine output
		switch(futureday)
		{
			case 0: System.out.print("Sunday."); break;
			case 1: System.out.print("Monday."); break;
			case 2: System.out.print("Tuesday."); break;
			case 3: System.out.print("Wednesday."); break;
			case 4: System.out.print("Thursday."); break;
			case 5: System.out.print("Friday."); break;
			case 6: System.out.print("Saturday."); break;
		}

	}

}
