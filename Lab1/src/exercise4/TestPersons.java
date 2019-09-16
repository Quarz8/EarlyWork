/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise4;

public class TestPersons
{

	public static void main(String[] args)
	{
		// Create one of each object.
		Person per=new Person();
		Student stu=new Student();
		Employee emp= new Employee();
		Faculty fac=new Faculty();
		Staff sta=new Staff();
		

		// Invoke toString() method of each class
		System.out.println(per.toString());
		System.out.println(stu.toString());
		System.out.println(emp.toString());
		System.out.println(fac.toString());
		System.out.println(sta.toString());
	}

}
