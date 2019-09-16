// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			12_3

public class TestCircleWithStaticMembers
{
	/** Main method */
	public static void main(String[] args)
	{
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " + CircleWithStaticMembers.numberOfObjects);

		// Create c1
		CircleWithStaticMembers c1 = new CircleWithStaticMembers();

		// Display c1 BEFORE c2 is created
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");

		// Create c2
		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);

		// Modify c1
		c1.radius = 9;

		// Display c1 and c2 AFTER c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");

		// Create c3
		CircleWithStaticMembers c3 = new CircleWithStaticMembers();
		
		// Create c4
		CircleWithStaticMembers c4 = new CircleWithStaticMembers();
		
		// Modify c3 and c4
		c3.radius=20;
		c4.radius=100;
		
		// Display c3 and c4 AFTER c4 was created
		System.out.println("\nAfter creating and modifying c3 and c4");
		System.out.println("c3: radius ("+c3.radius+") and number of Circle objects ("+c3.numberOfObjects+")");
		System.out.println("c4: radius ("+c4.radius+") and number of Circle objects ("+c4.numberOfObjects+")");
	}

}
