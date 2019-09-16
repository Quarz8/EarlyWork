// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	2_2

import java.util.Scanner;

public class SumDigits 
{
	public static void main(String[] args) 
	{
		// Program reads an integer between 0 and 1000 and
		//adds all digits in the integer
		Scanner s=new Scanner(System.in);
		//Starts sum as 0
		int sum=0;
		//Ask for user input and stores it
		System.out.print("Please enter an interger between 0 and 1000: ");
		int input=s.nextInt();
		//Adds rightmost digit of input to sum, then removes rightmost digit from input
		sum+=input%10;
		input=input/10;
		//Adds rightmost digit of input to sum, then removes rightmost digit from input
		sum+=input%10;
		input=input/10;
		//Adds rightmost digit of input to sum, then removes rightmost digit from input
		sum+=input%10;
		input=input/10;
		//Adds rightmost digit of input to sum, then removes rightmost digit from input
		sum+=input%10;
		input=input/10;
		//Print sum of digits from user input
		System.out.println("The sum of these digits is "+sum);
	}
}
