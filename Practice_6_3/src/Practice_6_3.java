// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Lab: 		6_3

public class Practice_6_3
{

	// Use while loop to determine and print out all even numbers between 50 and 100
	// on a single line, separated by commas. Use another while loop to print all
	// odd numbers in the same fashion. Use proper labels for each.
	public static void main(String[] args)
	{
		// Declare Strings evenString and oddString to store the list of numbers from
		// loops
		String evenString = "";
		String oddString = "";

		// Declare loop continuation conditions int i and int j
		int i = 50;
		int j = 51;

		// Use while loop to concatenate evenString into a list of every other number
		// from 50 to 100 (evens)
		while (i <= 100)
		{
			evenString = evenString.concat(i + ", ");
			i += 2;
		}

		// Use while loop to concatenate oddString into a list of every other number
		// from 51 to 99 (odds)
		while (j <= 99)
		{
			oddString = oddString.concat(j + ", ");
			j += 2;
		}

		// Print outputs with appropriate labels. Substring removes extra ", "
		System.out.println("Even numbers between 50 and 100:\t" + evenString.substring(0, evenString.length() - 2));
		System.out.println("Odd numbers between 50 and 100:\t" + oddString.substring(0, oddString.length() - 2));

	}

}
