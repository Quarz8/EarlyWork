//Class: 		CS 1301/17
//Term: 		Fall 2017
//Instructor: 	Prof. Perry
//Name: 		Warren Davis
//Lab:			2_4

import java.util.Scanner;

public class Practice_2_4 
{
	public static void main(String[] args) 
	{
		// Ask for the amounts of coins
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the amount of quarters: ");
		int quarters=s.nextInt()*25;
		System.out.println("Enter the amount of dimes: ");
		int dimes=s.nextInt()*10;
		System.out.println("Enter the amount of nickels: ");
		int nickels=s.nextInt()*5;
		System.out.println("Enter the amount of pennies: ");
		int pennies=s.nextInt();
		s.close();
		
		// Add coin values for cents and dollars
		
		int dollars=(quarters+dimes+nickels+pennies)/100;
		int cents=(quarters+dimes+nickels+pennies)%100;
		
		// Print # of coins and total
		System.out.println("The values you've entered are...\nQuarters:\t"+quarters/25);
		System.out.println("Dimes:\t\t"+dimes/10);
		System.out.println("Nickels:\t"+nickels/5);
		System.out.println("Pennies:\t"+pennies);
		System.out.println("Your total is "+dollars+" dollar(s) and "+cents+" cent(s).");
	}
}
