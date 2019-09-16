/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise5;

public class TestCourse
{

	public static void main(String[] args)
	{
		// Create Course object test
		Course test = new Course("OWL 2018");

		// Invoke getCourseName()
		System.out.println("Course name is " + test.getCourseName());
		// Invoke getNumberOfStudents()
		System.out.println("Current student count: " + test.getNumberOfStudents());
		System.out.println("Adding students Beantown Uprising, Shanghai Dragons, and London Spitfire...");
		// Invoke addStudent()
		test.addStudent("Beantown Uprising");
		test.addStudent("Shanghai Dragons");
		test.addStudent("London Spitfire");
		System.out.println("Current student count: " + test.getNumberOfStudents());
		System.out.println("Attempting to drop Shanghai Dragons and xQc...");
		// Invoke dropStudent()
		test.dropStudent("Shanghai Dragons");
		test.dropStudent("xQc");
		System.out.println("Current student count: " + test.getNumberOfStudents());
		System.out.println("Printing list of current students...");
		// Invoke .getStudents()
		for (int i = 0; i < test.getNumberOfStudents(); i++)
			System.out.println(test.getStudents()[i]);
	}
}
