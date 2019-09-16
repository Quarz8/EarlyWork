//Class: 		CS 1301/17
//Term: 		Fall 2017
//Instructor: 	Prof. Perry
//Name: 		Warren Davis
//Lab:			4_2

import java.util.Scanner;

public class WindChill 
{

	// Computes wind chill for temperatures ranging from
	// -58 and 41 degrees F and a wind speed of 2 mph or greater
	// If inputs given are invalid, print which/both are invalid
	public static void main(String[] args) 
	{
		// Scanner for user input
		Scanner s=new Scanner(System.in);
		// Prompt user to input temperature between the allowed range. Store as 'temp'
		System.out.print("Enter the temperature in Farenheit between -58°F and 41°F: ");
		double temp=s.nextDouble();
		// Prompt input of wind speed in miles per hour. Store as 'speed'
		System.out.print("Enter the wind speed greater than or equal to 2 in miles per hour: ");
		double speed=s.nextDouble();
		// Computes wind-chill temperature and stores as 'chill'
		double chill=35.74+.6215*temp-35.75*Math.pow(speed, .16)+.4275*temp*Math.pow(speed, .16);
		// Prints appropriate output
		if (temp>=-58 && temp<=41 && speed>=2)
		{
			System.out.print("The wind chill index is "+chill);
		}
		else if (temp<-58 || temp>41 && speed>=2)
		{
			System.out.print("The input temperature is not valid.");
		}
		else if (temp>=-58 && temp<=41 && speed<2)
		{
			System.out.print("The input wind speed is not valid.");
		}
		else
		{
			System.out.print("Both the input temperature and wind speed are invalid.");
		}

	}

}
