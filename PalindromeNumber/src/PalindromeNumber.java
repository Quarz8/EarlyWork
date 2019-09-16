// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	3_4

import java.util.Scanner;

public class PalindromeNumber 
{
	//Determines if an input 3 digit number is a palindrome number and prints relult
	public static void main(String[] args) 
	{
		
		// Scanner to read user input
		Scanner s=new Scanner(System.in);
		// Ask user to input a 3 digit integer and store as number
		System.out.println("Input a three digit integer: ");
		int number=s.nextInt();
		// Declare digit1 as (number/100)
		int digit1=number/100;
		// Declare digit3 as (number%10)
		int digit3=number%10;
		// Check if digit1 is equal to digit3. If true, number is a palindrome. Print result
		// Since int value of "003" simply prints "3" checks have been put in place to ensure
		// outputs look correct. 
		if (digit1==digit3&&number<10)
		{
			System.out.println("00"+number+" is a palindrome.");
		}
		else if(digit1==digit3&&number<100)
		{
			System.out.println("0"+number+" is a palindrome.");
		}
		else if(digit1==digit3)
		{
			System.out.println(number+" is a palindrome.");
		}
		else if(number<10)
		{
			System.out.println("00"+number+" is not a palindrome.");
		}
		else if(number<100)
		{
			System.out.println("0"+number+" is not a palindrome.");
		}
		else
		{
			System.out.println(number+" is not a palidrome.");
		}

	}

}
