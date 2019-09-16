/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			3
 */

package exercise4;

public class TestCloneable
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		// Create 2 Course objects
		Course course1 = new Course("Quick Maths");
		Course course2 = new Course("Memeology");

		course1.addStudent("Big Shaq");
		course1.addStudent("Asnee");
		course1.addStudent("Whitney");

		course2.addStudent("Pepe");
		course2.addStudent("Wojak");
		course2.addStudent("Incel");
		course2.addStudent("Chad");
		course2.addStudent("Drumpf");

		// Display information of Course objects
		System.out.println("Course1 Name: " + course1.getCourseName());
		System.out.print("Students: ");
		for (int i = 0; course1.getStudents()[i] != null; i++)
			System.out.print(course1.getStudents()[i] + ". ");
		System.out.println();
		System.out.println("Course2 Name: " + course2.getCourseName());
		System.out.print("Students: ");
		for (int i = 0; course1.getStudents()[i] != null; i++)
			System.out.print(course1.getStudents()[i] + ". ");
		System.out.println("\n");

		// Clone each object
		Course clone1 = (Course) course1.clone();
		Course clone2 = (Course) course2.clone();

		// Display information of cloned objects
		System.out.println("Cloned Course1 Name: " + course1.getCourseName());
		System.out.print("Cloned Students: ");
		for (int i = 0; clone1.getStudents()[i] != null; i++)
			System.out.print(clone1.getStudents()[i] + ". ");
		System.out.println();
		System.out.println("Cloned Course2 Name: " + course2.getCourseName());
		System.out.print("Cloned Students: ");
		for (int i = 0; clone2.getStudents()[i] != null; i++)
			System.out.print(clone2.getStudents()[i] + ". ");
		System.out.println();
	}

}
