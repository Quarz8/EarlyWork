/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise4;

public class Person
{
	private String name = "Hambo Rob";
	private String address = "123 HELP";
	private String phoneNumber = "999-999-9999";
	private String email = "dasme@hotmail.com";

	public Person()
	{
	}

	public Person(String name, String address, String phoneNumber, String email)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public String getEmail()
	{
		return email;
	}

	// Display class name and person's name
	public String toString()
	{
		return "This person's name is " + getName();
	}
}
