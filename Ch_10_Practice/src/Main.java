/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Practice:	Ch. 10
 */

public class Main
{
	// Testing the Student class
	public static void main(String[] args)
	{
		// Creating 3 different students
		Student s1=new Student("Jane", "Doe", 5);
		Student s2=new Student("John", "Smith", 5);
		Student s3=new Student("David", "Hill", 3);
		
		// Creating all courses for Students s1, s2, and s3 respectively
		s1.createCourse("Math", 4, 'A');
		s1.createCourse("English", 3, 'A');
		s1.createCourse("CS", 4, 'A');
		s1.createCourse("Chemistry", 3, 'B');
		s1.createCourse("Health", 2, 'B');
		
		s2.createCourse("Math", 4, 'B');
		s2.createCourse("English", 3, 'B');
		s2.createCourse("CS", 4, 'C');
		s2.createCourse("Chemistry", 3, 'C');
		s2.createCourse("Health", 2, 'B');
		
		s3.createCourse("Math", 4, 'C');
		s3.createCourse("English", 3, 'A');
		s3.createCourse("Health", 2, 'A');
		
		// Printing each Student object
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}