/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Practice:	2
 */
public class Practice_02
{
	// Create a student object. A student is a name(String), id number(int), and a
	// gpa(double). Include default and custom constructors, getters and
	// setters for all instance variables, an equals method, and a toString()
	// method.

	// Declare variables name, id, and gpa
	private String name = "Warren Davis";
	private int id = 100054525;
	private double gpa = 3.7;

	// Default constructor
	Practice_02()
	{
	};

	// Parameterized constructor (name, id, gpa)
	Practice_02(String newName, int newId, double newGpa)
	{
		name = newName;
		id = newId;
		gpa = newGpa;
	};

	// Getter methods for variables name, id and, gpa.
	public String getName()
	{
		return name;
	}

	public int getId()
	{
		return id;
	}

	public double getGpa()
	{
		return gpa;
	}

	// Setter methods for variables name, id, and gpa.
	public void setName(String newName)
	{
		name = newName;
	}

	public void setId(int newId)
	{
		id = newId;
	}

	public void setGpa(double newGpa)
	{
		gpa = newGpa;
	}

	// Equals method returns true if name, id, and gpa are equal
	public boolean equals(Practice_02 student)
	{
		if (name.equals(student.name) && id == student.id && gpa == student.gpa)
			return true;
		else
			return false;
	}

	// toString method returns a String containing relevant data on student with
	// proper labeling.
	public String toString()
	{
		return ("This student's name is " + name + ". Their ID# is " + id + " and they currently have a GPA of " + gpa
				+ ".");
	}
}
