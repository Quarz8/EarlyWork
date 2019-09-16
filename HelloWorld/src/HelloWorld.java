// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	1

import java.util.Scanner;

public class HelloWorld
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter your name:");
		String name = s.nextLine();
		System.out.println("Hello " + name + "!");
		s.close();
	}
}