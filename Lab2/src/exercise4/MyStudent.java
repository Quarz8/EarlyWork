/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			2
 */

package exercise4;

import java.util.ArrayList;

public class MyStudent extends Student
{
	// Data fields
	private static ArrayList<Course> courselist = new ArrayList<Course>();

	/** Constructor */
	public MyStudent(String fName, String lName)
	{
		super(fName, lName, courselist.size());
	}

	// Determines and returns student GPA using superclass methods
	public String toString()
	{
		for (int i = 0; i < courselist.size(); i++)
		{
			String courseName = courselist.get(i).getCourseName();
			int creditHours = courselist.get(i).getCreditHours();
			char letterGrade = courselist.get(i).getLetterGrade();
			super.createCourse(courseName, creditHours, letterGrade);
		}
		return super.toString();
	}

	// Adds a course to the courselist
	public static void addCourse(String courseName, int creditHours, char letterGrade)
	{
		Course c = new Course(courseName, creditHours, letterGrade);
		courselist.add(c);
	}
}
