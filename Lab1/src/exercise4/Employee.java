/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise4;

public class Employee extends Person
{
	private int office = 0;
	private double salary = 7.25;
	private MyDate dateHired = new MyDate();

	public Employee()
	{
	}

	public Employee(int office, double salary, MyDate dateHired)
	{
		super();
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	public int getOffice()
	{
		return office;
	}

	public double getSalary()
	{
		return salary;
	}

	public MyDate getDateHired()
	{
		return dateHired;
	}

	// Display class name and person's name
	public String toString()
	{
		return "This employee's name is " + getName();
	}
}
