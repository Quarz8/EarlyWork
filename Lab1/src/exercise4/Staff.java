/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise4;

public class Staff extends Employee
{
	private String title = "The Unused";

	public Staff()
	{
	}

	public Staff(String title)
	{
		this.title = title;
	}

	public String getTitle()
	{
		return title;
	}

	// Display class name and person's name
	public String toString()
	{
		return "This staff member's name is " + getName();
	}

}
