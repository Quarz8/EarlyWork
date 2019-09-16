// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Assignment: 	2_4

import java.util.Scanner;
import java.text.NumberFormat;

public class DrivingCost 
{
	public static void main(String[] args) 
	{
		//Calculates cost of a trip based on distance, fuel efficiency, and gas price
		Scanner s=new Scanner(System.in);
		//Ask for inputs and store them
		System.out.print("Please enter the driving distance: ");
		double distance=s.nextDouble();
		System.out.print("Please enter the car's miles per gallon: ");
		double efficiency=s.nextDouble();
		System.out.print("Please enter gas price per gallon: ");
		double price=s.nextDouble();
		//Compute total cost
		double cost=distance/efficiency*price;
		//Convert cost to currency(dollars)
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		//Print result
		System.out.print("The cost of driving is "+fmt.format(cost));
	}
}
