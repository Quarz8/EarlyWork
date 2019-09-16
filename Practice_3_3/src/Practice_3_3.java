// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Lab: 		3_3

import java.text.NumberFormat;
import java.util.Scanner;

public class Practice_3_3 
{
	public static void main(String[] args) 
	{
		// Prompts user to input minutes of a call
		// then outputs call duration followed by amount due.
		// Uses currency object format.
		// Label outputs properly and line up with \t
		
		Scanner s=new Scanner(System.in);
		System.out.print("Please enter length of call in minutes:");
		//Takes user input integer and prints
		int minutes=s.nextInt();
		assert minutes>=0 : "Call duration can not be negative";
		NumberFormat fmt=NumberFormat.getCurrencyInstance();
		double fee=4.99;
		double rate=.45;
		//Prints entered duration of call
		System.out.println("\nThe duration of the call is:\t\t"+minutes+" minute(s)");
		//No call is $0
		if(minutes==0)
		{
			System.out.println("The amount dues for this call is\t"+fmt.format(0));
		}
		//Calls that are 3 minutes or less are $4.99
		else if(minutes<=3)
		{
			System.out.println("The amount due for this call is\t\t"+fmt.format(fee));
		}
		//Computes rate of extra .45 cents every minute after first 3 and prints result
		else
		{
			System.out.println("The amount due for this call is:\t"+fmt.format(fee+(rate*(minutes-3))));
		}
	}
}
