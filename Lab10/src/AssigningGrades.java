// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			10_1

import java.util.Scanner;

public class AssigningGrades
{
	// Use an array to store entered grades. Determine best grade. A grade is an A
	// if it is greater than or equal to the best grade -10, B is best -20, C best
	// -30, D best-40, else F. Program prompts user to enter the total number of
	// students, then prompts user to enter all of the scores, then displays the
	// grades of each student.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Loop to allow re-runs of program
		while (true)
		{
			// Prompt user to enter number of students
			System.out.print("Enter the number of students: ");
			int students = s.nextInt();

			// Ensure number of students entered is greater than 0
			while (students <= 0)
			{
				System.out.print("Number of students must be greater than 0: ");
				students = s.nextInt();
			}

			// Array to store each score in
			int[] scores = new int[students];

			// Prompt user to enter X amount of scores. Assign scores to array using for
			// loop
			System.out.print("Enter " + students + " scores: ");
			for (int i = 0; i < students; i++)
				scores[i] = s.nextInt();

			// Local variable for best grade
			int best = scores[0];

			// Find best score entered
			for (int i = 0; i < students; i++)
			{
				if (scores[i] > best)
					best = scores[i];
			}

			// List student scores with grades using the assignGrade method
			for (int i = 0; i < students; i++)
			{
				System.out.println(
						"Student " + i + " score is " + scores[i] + " and grade is " + assignGrade(scores[i], best));
			}
		}
	}

	// Returns letter grade based on student score compared to best best
	public static char assignGrade(int score, int best)
	{
		if (score >= best - 10)
			return 'A';
		else if (score >= best - 20)
			return 'B';
		else if (score >= best - 30)
			return 'C';
		else if (score >= best - 40)
			return 'D';
		else
			return 'F';
	}
}
