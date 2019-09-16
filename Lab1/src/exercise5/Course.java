/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise5;

import java.util.ArrayList;

public class Course
{
	private String courseName;
	private ArrayList<String> students = new ArrayList<>(); // Changed to ArrayList
	private int numberOfStudents;

	public Course(String courseName)
	{
		this.courseName = courseName;
	}

	// Uses simple add method for ArrayList
	public void addStudent(String student)
	{
		students.add(student);
		numberOfStudents++;
	}

	// Creates and returns String[] from ArrayList students
	public String[] getStudents()
	{
		String[] array = new String[students.size()];
		return students.toArray(array);
	}

	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}

	public String getCourseName()
	{
		return courseName;
	}

	// Same as addStudent, but must check if student can be removed (exists) before
	// decrementing numberOfStudents. If unable to drop student, prints a fail
	// message.
	public void dropStudent(String student)
	{
		if (students.contains(student))
		{
			students.remove(student);
			numberOfStudents--;
		}
		else
			System.out.println("Unable to find " + student + ". Course " + courseName + " unchanged.");
	}
}
