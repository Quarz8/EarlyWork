// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor: 	Prof. Perry
// Name: 		Warren Davis
// Lab: 		3_1

import java.util.Scanner;

public class Practice_3_1 
{

	public static void main(String[] args) 
	{
		/* Reads four grades 0-100 from user
		 * then prints, on separate lines, the entered grades followed by
		 * highest grade, lowest grade, and averages of the four grades.
		 * use escape characters to line-up outputs after labels
		 */
		Scanner s=new Scanner(System.in);
		//Ask user to enter 4 grades between 0 and 100 and store them
		System.out.println("Please enter four grades between 0 and 100: ");
		double grade1=s.nextDouble();
		assert grade1 >= 0 && grade1 <= 100 : "Must enter number between 0 and 100.";
		double grade2=s.nextDouble();
		assert grade2 >= 0 && grade2 <= 100 : "Must enter number between 0 and 100.";
		double grade3=s.nextDouble();
		assert grade3 >= 0 && grade3 <= 100 : "Must enter number between 0 and 100.";
		double grade4=s.nextDouble();
		assert grade4 >= 0 && grade4 <= 100 : "Must enter number between 0 and 100.";
		//Highest of grades
		double highest;
		//Lowest of grades
		double lowest;
		//Average of grades
		double average=(grade1+grade2+grade3+grade4)/4;
		//Determines value of highest
		if(grade1>=grade2&&grade1>=grade3&&grade1>=grade4)
		{
			highest=grade1;
		}
		else if(grade2>=grade3&&grade2>=grade4)
		{
			highest=grade2;
		}
		else if(grade3>=grade4)
		{
			highest=grade3;
		}
		else
		{
			highest=grade4;
		}
		//Determines value of lowest
		if(grade1<=grade2&&grade1<=grade3&&grade1<=grade4)
		{
			lowest=grade1;
		}
		else if(grade2<=grade3&&grade2<=grade4)
		{
			lowest=grade2;
		}
		else if(grade3<=grade4)
		{
			lowest=grade3;
		}
		else
		{
			lowest=grade4;
		}
		//Prints grade inputs, highest and lowest grade, and average of input grades
		//Results are lined up using tab escape characters
		System.out.print("\nGrade 1:\t\t\t"+grade1+"\nGrade 2:\t\t\t"+grade2+
				"\nGrade 3:\t\t\t"+grade3+"\nGrade 4:\t\t\t"+grade4);
		System.out.println("\nThe highest grade entered is:\t"+highest);
		System.out.println("The lowest grade entered is:\t"+lowest);
		System.out.println("The average of these grades is:\t"+average);
	}
}
