/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			3
 */

package exercise4;

public class Course implements Cloneable
{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName)
	{
		this.courseName = courseName;
	}

	public void addStudent(String student)
	{
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents()
	{
		return students;
	}

	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}

	public String getCourseName()
	{
		return courseName;
	}

	public void dropStudent(String student)
	{
		// Left as an exercise. It's not important for this...
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
