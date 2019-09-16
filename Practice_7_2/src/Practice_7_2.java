// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			7_2

import java.util.Scanner;

public class Practice_7_2
{

	// Reads a sentence from the user and prints out the entered sentence. The
	// sentence is then printed one word per line, using blank space as the
	// delimiter. Use proper labels for output. Program loops to allow for different
	// inputs.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loops program to allow user to re-run
		while (true)
		{
			// Prompts user to enter a sentence. Stores input as String sentence
			System.out.print("Enter a sentence: ");
			String sentence = s.nextLine();

			// Prints user entered sentence
			System.out.println("\nEntered String: " + sentence + "\n");

			// Removes pointless space from sentence
			String trimSentence = sentence.trim();

			// Separates sentence into words in an array based on white space
			String[] words = trimSentence.split("\\s+");

			// Loop to print words with corresponding labels
			for (int i = 0; i < words.length; i++)
			{
				// If there are no words in array, print that there are no words in this
				// sentence
				if (words[i].isEmpty())
					System.out.println("There are no words in the sentence.");
				// Otherwise, print outputs as expected
				else
					System.out.println("Word #" + (i + 1) + ":\t" + words[i]);
			}

			// Formatting
			System.out.print("\n");
		}

	}

}
