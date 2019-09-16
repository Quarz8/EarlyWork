// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Lab: 		8_1

import java.util.Scanner;

// Defines three methods max, min, and average.
public class MinMaxAvg
{
	// Returns maximum value of 3 integers
	public static int max(int x, int y, int z)
	{
		int max;

		if (x >= y && x >= z)
			max = x;
		else if (y >= z)
			max = y;
		else
			max = z;

		return max;
	}

	// Returns minimum value of 3 integers
	public static int min(int x, int y, int z)
	{
		int min;

		if (x <= y && x <= z)
			min = x;
		else if (y <= z)
			min = y;
		else
			min = z;

		return min;
	}

	// Returns average value of 3 integers
	public static double average(int x, int y, int z)
	{
		double avg = ((x + y + z) / 3.0);

		return avg;
	}

	// Reads user input of 3 integers and prints the entered inputs followed by the
	// max, min, and average of those inputs. Loops to allow user to re-run with
	// different inputs.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		while (true) // Allows for user to re-run program
		{
			// Prompts user to enter 3 integers and stores them as ints x, y, and z
			System.out.print("Please enter any three integers, separated with a space: ");
			int x = s.nextInt(), y = s.nextInt(), z = s.nextInt();

			// Prints the 3 entered integers and their max, min, and average to 11 decimal
			// places.
			System.out.println("You entered:\t" + x + "   " + y + "   " + z);
			System.out.println("Max value:\t" + max(x, y, z));
			System.out.println("Min value:\t" + min(x, y, z));
			System.out.printf("Average value:\t%1.11f\n\n", average(x, y, z));
		}
	}

}
