// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	4_4

import java.util.Scanner;

public class CompareCost 
{
	// Prompts user to enter weight and price of two packages and displays the one with the better price
	public static void main(String[] args) 
	{
		// Scanner for user input
		Scanner s=new Scanner(System.in);
		// Prompt user to enter weight and price of package 1.
		System.out.print("Enter weight and price for package 1: ");
		// Store values as doubles w1 and p1 respectively
		// Assert that each value is greater than 0
		double w1=s.nextDouble();
		assert w1>0 : "If the package is so light it's flying away, I wouldn't buy it. (Weight must be greater than 0)";
		double p1=s.nextDouble();
		assert p1>0 : "Free stuff?!? Either you're an expert couponer, or you've made a typo. (Price must be greater than 0)";
		// Prompt user to enter weight and price of package 2.
		System.out.print("Enter weight and price for package 2: ");
		// Store values as doubles w2 and p2 respectively
		// Assert that each value is greater than 0
		double w2=s.nextDouble();
		assert w2>0 : "Somehow, I think the first package was a better option... (Weight must be greater than 0)";
		double p2=s.nextDouble();
		assert p2>0 : "They say the best things in life are free, but you get what you pay for. (Price must be greater than 0)";
		// Determine value of package 1 (weight/price) and store as value1
		double value1=w1/p1;
		// Determine value of package 1 (weight/price) and store as value1
		double value2=w2/p2;
		// Compare values and print which one is higher (better) or if they are the same
		if (value1>value2)
		{
			System.out.print("Package 1 has a better price.");
		}
		if (value2>value1)
		{
			System.out.print("Package 2 has a better price.");
		}
		if (value1==value2)
		{
			System.out.print("Two packages have the same price.");
		}


	}

}
