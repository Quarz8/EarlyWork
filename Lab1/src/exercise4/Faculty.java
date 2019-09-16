/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise4;

public class Faculty extends Employee
{
	private String officeHours = "9am-5pm";
	private String rank = "Custodian";

	public Faculty()
	{
	}

	public Faculty(String officeHours, String rank)
	{
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours()
	{
		return officeHours;
	}

	public String getRank()
	{
		return rank;
	}

	// Display class name and person's name
	public String toString()
	{
		return "This faculty member's name is " + getName();
	}
}
