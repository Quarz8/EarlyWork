// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	3_3

import java.util.Scanner;

public class BMI 
{

	// Determines bmi based on user input of weight (pounds)
	// and height (feet and inches) and prints bmi and interpretation on separate lines
	public static void main(String[] args) 
	{
		// Scanner to read user input
		Scanner s=new Scanner(System.in);
		// Ask user for weight in pounds and store
		System.out.println("Please input your weight in pounds: ");
		double pounds=s.nextDouble();
		// Ask user for height in feet and inches and store each
		System.out.println("Please input your height in feet followed by inches (separated by a space): ");
		int feet=s.nextInt();
		// Ask user for remaining height in inches and store
		int inches=s.nextInt();
		// Declare totalHeight as (feet * 12)+inches
		int totalHeight=(feet*12)+inches;
		// Declare weightInKilograms with (pounds * .45359237)
		double weightInKilograms=pounds*.45359237;
		// Declare heightInMeters with (totalHeight * .0254)
		double heightInMeters=totalHeight*.0254;
		// Declare bmi as (weightInKilograms / (heightInMeters * heightInMeters))
		double bmi=weightInKilograms/(heightInMeters*heightInMeters);
		// Print bmi
		System.out.println("BMI is "+bmi);
		// Check if bmi is <18.5
		if (bmi<18.5)
		{
			System.out.println("Underweight");
		}
		// Check if bmi is <25
		else if (bmi<25)
		{
			System.out.println("Normal");
		}
		// Check if bmi is <30
		else if (bmi<30)
		{
			System.out.println("Overweight");
		}
		// Else assume bmi is >=30 
		else
		{
			System.out.println("Obese");
		}	

	}

}
