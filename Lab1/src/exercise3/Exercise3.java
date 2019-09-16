/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise3;

import java.util.ArrayList;

public class Exercise3
{
	// Exercise 11.4
	public static Integer max(ArrayList<Integer> list)
	{
		if (list.size() == 0)
			return null;
		Integer max = list.get(0);

		for (int i = 0; i < list.size(); i++)
			if (list.get(i) > max)
				max = list.get(i);
		return max;
	}

	// Exercise 11.12
	public static Integer sum(ArrayList<Integer> list)
	{
		Integer sum = 0;

		for (int i = 0; i < list.size(); i++)
			sum += list.get(i);

		return sum;
	}

	// Exercise 11.14
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
		ArrayList<Integer> union = new ArrayList<>();

		// Append lists to union
		union.addAll(list1);
		union.addAll(list2);

		return union;
	}
}
