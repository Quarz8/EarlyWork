// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Lab: 		3_2

import java.util.Random;

public class Practice_3_2 
{

	public static void main(String[] args) 
	{
		//Generates random number from 0-100, then
		//on separate lines, prints generated number
		//followed by corresponding letter grade
		
		//Creates RNG object
		Random rng=new Random();
		//Generates random number between 0 and 100 inclusive
		int grade=rng.nextInt(101);
		System.out.println("The number grade is:\t"+grade);
		if(grade>=90)
		{
			System.out.println("The letter grade is:\tA");
		}
		else if(grade>=80)
		{
			System.out.println("The letter grade is:\tB");
		}
		else if(grade>=70)
		{
			System.out.println("The letter grade is:\tC");
		}
		else if(grade>=60)
		{
			System.out.println("The letter grade is:\tD");
		}
		else
		{
			System.out.println("The letter grade is:\tF");
		}
	}
}
