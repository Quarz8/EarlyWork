//Class: 		CS 1301/17
//Term: 		Fall 2017
//Instructor: 	Prof. Perry
//Name: 		Warren Davis
//Lab:			5_2

import java.util.Scanner;

public class KeyPad 
{

	// Prompts user to enter a letter and displays its corresponding number
	// with respect to the international standard letter/number mapping
	// If input is invalid, display that it is invalid
	public static void main(String[] args) 
	{
		// Scanner for user input
		Scanner s=new Scanner(System.in);
		// Prompts user to enter a letter and declares it as "char letter"
		System.out.print("Enter a letter: ");
		String letter=s.nextLine();
		// Determines corresponding number to input letter and prints result
		switch (letter.toLowerCase())
		{
		case "a" :
		case "b" :
		case "c" : System.out.print("The corresponding number is 2"); break;
		case "d" :
		case "e" :
		case "f" : System.out.print("The corresponding number is 3"); break;
		case "g" :
		case "h" :
		case "i" : System.out.print("The corresponding number is 4"); break;
		case "j" :
		case "k" :
		case "l" : System.out.print("The corresponding number is 5"); break;
		case "m" :
		case "n" :
		case "o" : System.out.print("The corresponding number is 6"); break;
		case "p" :
		case "q" :
		case "r" :
		case "s" : System.out.print("The corresponding number is 7"); break;
		case "t" :
		case "u" :
		case "v" : System.out.print("The corresponding number is 8"); break;
		case "w" :
		case "x" :
		case "y" :
		case "z" : System.out.print("The corresponding number is 9"); break;
		default : System.out.print(letter+" is an invalid input");
		}
		/* On a side note, I would like to point out that there is no assert statement
		in this program as any input the user enters is covered by the default in the above
		switch statement. As this is required according to Exercise 4.15, an assert statement
		would prove not only redundant, but actually prevent one of the example outputs from 
		being displayed at all. ¯\_(O_o)_/¯ */
		

	}

}
