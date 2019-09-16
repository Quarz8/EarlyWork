/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise6;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object>
{
	/** Not needed as it is covered by superclass */
	//public boolean isEmpty()
	//{
	//	return isEmpty();
	//}

	public int getSize()
	{
		return size();
	}
	
	public Object peek()
	{
		return get((getSize())-1);
	}
	
	public Object pop() {
		Object o=get(getSize()-1);
		remove(getSize()-1);
		return o;
	}
	
	public void push(Object o) {
		add(o);
	}
	
	public String toString() {
		return "stack: "+super.toString();
	}
}
