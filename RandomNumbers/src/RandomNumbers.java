// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	5_2

public class RandomNumbers 
{
	
	// Generates random numbers as requested by instructor. 
	// Outputs are properly labeled and on separate lines.
	// Outputs lined up with tab escape characters.
	public static void main(String[] args) 
	{
		// Part A: Generates a random integer number between 30 and 50 (inclusive) and prints
		System.out.println("Random integer between 30 and 50 (inclusive):\t\t\t\t"+(30+(int)(Math.random()*21)));
		// Part B: Generates a random integer number between 20 and -20 (inclusive) and prints
		System.out.println("Random integer between -20 and 20 (inclusive):\t\t\t\t"+(-20+(int)(Math.random()*41)));
		// Part C: Generates a random integer number between -20 and -60 (inclusive) and prints
		System.out.println("Random integer between -60 and -20 (inclusive):\t\t\t\t"+(-60+(int)(Math.random()*41)));
		// Part D: Generates a random floating-point number between 0.0 and 15.9999 (inclusive) and prints
		System.out.println("Random floating-point number between 0.0 and 15.9999 (inclusive):\t"+((float)(Math.random()*16)));

	}

}
