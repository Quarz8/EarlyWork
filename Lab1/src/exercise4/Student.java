/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise4;

// Why and how would you ever make status a constant...
public class Student extends Person
{
	public final String FRESHMAN = "Freshman";
	public final String SOPHOMORE = "Sophomore";
	public final String JUNIOR = "Junior";
	public final String SENIOR = "Senior";
	private String status;

	public Student()
	{
	}

	public Student(String status)
	{
		this.status = status;
	}

	public String getStatus()
	{
		return status;
	}

	// Display class name and person's name
	public String toString()
	{
		return "This student's name is " + getName();
	}
}
