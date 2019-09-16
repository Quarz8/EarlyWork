/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise6;

public class TestMyStack
{

	public static void main(String[] args)
	{
		// Create new MyStack object with automatic default constructor
		MyStack stack = new MyStack();
		// Test isEmpty() method
		System.out.println("Stack empty?: " + stack.isEmpty());
		// Test push() method
		System.out.println("Adding elements red, green, blue, and black to stack... ");
		stack.push("red");
		stack.push("green");
		stack.push("blue");
		stack.push("black");
		// Test getSize() method
		System.out.println("Current stack size is " + stack.getSize());
		// Test peek() method
		System.out.println("Top element in stack is currently: " + stack.peek());
		// Test pop() method
		System.out.println("Removed top element: "+stack.pop());
		// Test toString() method
		System.out.println(stack.toString());
	}

}
