//Class: 		CS 1301/17
//Term: 		Fall 2017
//Instructor: 	Prof. Perry
//Name: 		Warren Davis
//Lab:			4_1

import java.util.Scanner;

public class AddThreeNumbers 
{

	// Prompts user to answer a sum of 3 random single digit numbers
	//and returns whether the given answer was correct
	public static void main(String[] args) 
	{
		// Generate 3 numbers
		int number1=(int)(System.currentTimeMillis()%10);
		int number2=(int)(System.currentTimeMillis()/7%10);
		int number3=(int)(System.currentTimeMillis()/8%10);
		// Create a Scanner
		Scanner input=new Scanner(System.in);
		//Asks for sum of three numbers
		System.out.print("What is "+number1+" + "+number2+" + "+number3+"? ");
		//Store user's answer
		int answer=input.nextInt();
		// Prints whether answer chosen is true or false
		System.out.println(
			number1+" + "+number2+" + "+number3+" = "+answer+" is "+
			(number1+number2+number3==answer)+".");

	}

}
