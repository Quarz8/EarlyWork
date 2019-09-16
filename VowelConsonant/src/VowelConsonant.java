// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	5_4

import java.util.Scanner;

public class VowelConsonant 
{

	// Prompts user to type a letter and
	// checks whether it is a vowel or a consonant
	public static void main(String[] args) 
	{
		// Scanner for user input
		Scanner s=new Scanner(System.in);
		// Prompt user to enter a letter (store as letter)
		System.out.print("Enter a letter: ");
		String letter=s.nextLine();
		// Assert letter is exactly one character long
		assert letter.length()==1 : "Input must be one character in length.";
		// Checks if char letter is not a letter. If it is not,
		// print that letter is an invalid input
		if(!Character.isLetter(letter.charAt(0)))
			System.out.println(letter+" is an invalid input");
		// Else if letter is equal to a, e, i, o, or u (making it a vowel)
		// Then check if letter is equal to y, which is sometimes a vowel
		// If not, print that letter is a consonant by default
		else
		switch(letter.toLowerCase())
		{
		case "a" : 
		case "e" :
		case "i" :
		case "o" :
		case "u" : System.out.println(letter+" is a vowel"); break;
		case "y" : System.out.println(letter+" is a vowel... sometimes"); break;
		default : System.out.println(letter+" is a consonant");
		}

	}

}
