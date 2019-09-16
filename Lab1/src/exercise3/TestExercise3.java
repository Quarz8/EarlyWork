/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestExercise3
{

	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Prompt user to enter 5 integers for list1 and 5 integers for list2
		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.print("Enter five integers for list1: ");
		for (int i = 0; i < 5; i++)
			list1.add(s.nextInt());
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.print("Enter five integers for list2: ");
		for (int i = 0; i < 5; i++)
			list2.add(s.nextInt());
		s.close();

		// Test methods on the lists
		System.out.println("The max of list1 is " + Exercise3.max(list1));
		System.out.println("The sum of the elements of list2 is " + Exercise3.sum(list2));
		System.out.print("The combined list is");
		for (int i = 0; i < Exercise3.union(list1, list2).size(); i++)
			System.out.print(" " + Exercise3.union(list1, list2).get(i));
	}
}