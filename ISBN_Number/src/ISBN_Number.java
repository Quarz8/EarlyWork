// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	4_1

import java.util.Scanner;

public class ISBN_Number 
{
	// Prints ISBN-10 number based on the first 9 digits input by the user
	public static void main(String[] args) 
	{
		// Scanner for user input
		Scanner s=new Scanner(System.in);
		// Prompt user to enter 9 digits of an 
		// ISBN as an integer and store as int number
		// (Inputs of less than 9 digits will have zeroes added as placeholder digits)
		System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
		int number=s.nextInt();
		// Asserts that the integer must be less than 10 digits (placeholder zeroes are ignored)
		assert number<1000000000 : "Enter a 9 digit number.";
		// Declares int d9 as rightmost digit of number
		int d9=number%10;
		// Removes rightmost digit from number
		number=number/10;
		// Declares int d8 as rightmost digit of number
		int d8=number%10;
		// Removes next rightmost digit from number
		number=number/10;
		// Declaration of int d# and removal of digits from 
		// int number repeats until int d1 is declared
		int d7=number%10;
		number=number/10;
		int d6=number%10;
		number=number/10;
		int d5=number%10;
		number=number/10;
		int d4=number%10;
		number=number/10;
		int d3=number%10;
		number=number/10;
		int d2=number%10;
		number=number/10;
		int d1=number%10;
		// Declares int d10 as ISBN checksum formula
		int d10=((d1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11);
		// Prints final ISBN-10 number using each stored digit
		// If d10 is equal to 10, it is replaced with "X"
		if (d10==10)
		{
			System.out.print("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");
		}
		else
		{
			System.out.print("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
		}
	}
}
