//Class: 		CS 1301/17
//Term: 		Fall 2017
//Instructor: 	Prof. Perry
//Name: 		Warren Davis
//Lab:			5_3

import java.util.Scanner;
	
public class SubString 
{
	
	// Prompts user to enter two strings and reports whether
	// the second string is a substring of the first string
	public static void main(String[] args) 
	{
		// Scanner for user input
		Scanner s=new Scanner(System.in);
		// Prompts user to enter string 1 and declares it as "String s1"
		System.out.print("Enter string s1: ");
		String s1=s.nextLine();
		// Prompts user to enter string 2 and declares it as "String s2"
		System.out.print("Enter string s2: ");
		String s2=s.nextLine();
		// Checks if second string is a substring of the first
		// and prints whether or not it is so
		if(s1.contains(s2))
		{
			System.out.print(s2+" is a substring of "+s1);
		}
		else
		{
			System.out.print(s2+" is not a substring of "+s1);
		}

	}

}
