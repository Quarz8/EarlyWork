// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	5_1

import java.util.Scanner;

public class StringMethods 
{

	// Reads two string inputs from the user. Manipulates those strings using String class methods
	// and prints outputs with proper labels on separate lines. Outputs are lined up using tab escape characters.
	public static void main(String[] args) 
	{
		// Scanner for user input
		Scanner s=new Scanner(System.in);
		// Ask user to input string_1 and store input as string_1
		System.out.print("Input string_1: ");
		String string_1=s.nextLine();
		// Assert string_1 is at least 3 characters long
		assert string_1.length()>=3 : "String must be at least 3 characters so that a multiple character substring can be created later.";
		// Ask user to input string_2 and store input as string_2
		System.out.print("Input string_2: ");
		String string_2=s.nextLine();
		// Part A: Prints length of string_1
		System.out.println("a) Length of string_1:\t\t\t\t\t\t"+string_1.length());
		// Part B: Prints length of string_2
		System.out.println("b) Length of string_2:\t\t\t\t\t\t"+string_2.length());
		// Part C: Prints concatenation of string_1 and string_2
		System.out.println("c) Concatenation of string_1 and string_2:\t\t\t"+string_1.concat(string_2));
		// Part D: Prints whether string_1 and string_2 have same set of characters with regard to case
		System.out.print("d) Are string_1 and string_2 the same with regard to case?:\t");
		// Converts "true false" to "yes no" respectively and prints
		if (string_1.equals(string_2))
		System.out.println("Yes");
		else System.out.println("No");
		// Part E: Prints string_1 in upper case
		System.out.println("e) Conversion of string_1 to upper case:\t\t\t"+string_1.toUpperCase());
		// Part F: Prints string_2 in lower case
		System.out.println("f) Conversion of string_2 to lower case:\t\t\t"+string_2.toLowerCase());
		// Part G: Prints a valid (albeit uncreative) substring of multiple characters from string_1
		System.out.println("g) Sub-string of multiple characters from string_1:\t\t"+string_1.substring(1));

	}

}
