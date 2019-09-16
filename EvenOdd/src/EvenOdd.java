// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	6_2

public class EvenOdd
{

	// Use one while loop to determine all even and odd numbers between 50 and 100.
	// Print even numbers and odd numbers on separate lines with numbers separated
	// by commas.
	public static void main(String[] args)
	{
		// Declare Strings evenString and oddString to store the list of numbers from
		// loop
		String evenString = "";
		String oddString = "";

		// Declare loop continuation condition int i
		int i = 50;

		// Determine evens and odds, assigns them to appropriate string
		while (i <= 100)
		{
			if (i % 2 == 0)
				evenString = evenString.concat(", " + i);
			else
				oddString = oddString.concat(", " + i);
			i++;
		}

		// Prints values with appropriate labels and formatting
		System.out.println("Even numbers between 50 and 100:\t" + evenString.substring(2));
		System.out.println("Odd numbers between 50 and 100:\t\t" + oddString.substring(2));

	}

}
