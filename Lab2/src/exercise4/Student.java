/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Practice:	Ch. 10
 */

package exercise4;

public class Student
{
	// Members of Student object
	private String firstName;
	private String lastName;
	private Course[] courses;

	// Constructor with paramaters for firstName, lastName, and length of Course[]
	// courses
	public Student(String firstName, String lastName, int numCourses)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.courses = new Course[numCourses];
	}

	// Creates a Course object and adds it to Course[] courses in Student object.
	// Will tell user if course was unable to be added.
	public void createCourse(String courseName, int creditHours, char letterGrade)
	{
		Course c = new Course(courseName, creditHours, letterGrade);
		for (int i = 0; i < courses.length; i++)
		{
			if (courses[i] == null)
			{
				courses[i] = c;
				break;
			}
			if (courses[courses.length - 1] != null)
			{
				System.out.println("Courses for this student (" + firstName + " " + lastName
						+ ") are maxed out; unable to add course.");
				break;
			}
		}
	}

	// Computes GPA of a student using all courses' credit hours and grades.
	public double computeGPA()
	{
		int totalHours = 0;
		int totalQualityPoints = 0;
		int courseHours;
		int qualityPoints;

		for (int i = 0; i < courses.length; i++)
		{
			qualityPoints = courses[i].getQualityPoints();
			courseHours = courses[i].getCreditHours();
			totalHours += courses[i].getCreditHours();
			totalQualityPoints += qualityPoints * courseHours;
		}
		return (double) totalQualityPoints / totalHours;
	}

	// Prints comprehensive data of a Student
	public String toString()
	{
		return "Student " + firstName + " " + lastName + " has a " + computeGPA() + " GPA";
	}
}
