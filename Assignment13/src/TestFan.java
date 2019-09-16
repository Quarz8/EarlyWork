// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	13_1

public class TestFan
{

	// Tests Fan class
	public static void main(String[] args)
	{
		// Create 2 fan objects, fan1 and fan2
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		// Make fan1 have a speed of fast, radius of 10, and be yellow. Turn it on.
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.turnOn();

		// Make fan2 have a speed of medium, leave everything else as default
		fan2.setSpeed(Fan.MEDIUM);

		// Invoke toString() method on both fans
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());

	}

}
