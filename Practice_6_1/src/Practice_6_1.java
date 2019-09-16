// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Lab: 		6_1

public class Practice_6_1
{

	// Uses a while loop to determine and print the sum if all values between 1 and
	// 100.
	public static void main(String[] args)
	{
		// Declare int i=1 for loop continuation condition
		int i = 1;

		// Declare int sum=0
		int sum = 0;

		// While i is less than 100, add value of i to sum, then increment i
		while (i <= 100)
		{
			sum += i++;
		}

		// Print final value of sum
		System.out.print("The sum of all digits between 1 and 100 is: " + sum);

	}

}
