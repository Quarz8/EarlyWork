//Class: 		CS 1301/17
//Term: 		Fall 2017
//Instructor: 	Prof. Perry
//Name: 		Warren Davis
//Lab:			2_1

import java.util.Scanner;

public class Practice_2_1 
{

	public static void main(String[] args) 
	{
		// Ask user to define variables x, y, z
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please type an integer for X: ");
		int x = s.nextInt();
		System.out.println("Please type an integer for Y: ");
		int y = s.nextInt();
		System.out.println("Please type an integer for Z: ");
		int z = s.nextInt();
		s.close();
		
		// Define average of variables x, y, z
		
		double avg = (x+y+z)/3.0;
		
		//Print value of each variable with appropriate labels
		
		System.out.println("The value of integer X is: " + x);
		System.out.println("The value of integer Y is: " + y);
		System.out.println("The value of integer Z is: " + z);
		
		//Prints average of the three variables with labels
		
		System.out.println("The average of integers X, Y, and Z is: "+ avg);
		
	}

}
