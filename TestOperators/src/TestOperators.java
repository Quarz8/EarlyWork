// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	4_3

import java.util.Scanner;

public class TestOperators 
{
	// Prompts user to enter an integer and determines whether it is divisible by 5 and 6,
	// whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6 but not both
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s=new Scanner(System.in);
		// Prompt user to input an integer and store as int number
		System.out.print("Enter an integer: ");
		int number=s.nextInt();
		// Check divisibility of number by 5
		int div5=number%5;
		// Check divisibility of number by 6
		int div6=number%6;
		// Print whether number is divisible by 5 and/or 6
		System.out.println("Is "+number+" divisible by 5 and 6? "+(div5==0&&div6==0));
		System.out.println("Is "+number+" divisible by 5 or 6? "+(div5==0||div6==0));
		System.out.println("Is "+number+" divisible by 5 or 6, but not both? "+(div5==0^div6==0));

	}

}
