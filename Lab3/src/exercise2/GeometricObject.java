/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			3
 */

package exercise2;

public abstract class GeometricObject implements Comparable<GeometricObject>
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject()
	{
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with the specified color and filled value */
	protected GeometricObject(String color, boolean filled)
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor()
	{
		return color;
	}

	/** Set a new color */
	public void setColor(String color)
	{
		this.color = color;
	}

	/**
	 * Return filled. Since filled is boolean, its getter method is named isFilled
	 */
	public boolean isFilled()
	{
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}

	/** Return a string representation of this object */
	public String toString()
	{
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();

	/**
	 * Returns a negative integer, zero, or a positive integer as this object is
	 * less than, equal to, or greater than the specified object
	 */
	public int compareTo(GeometricObject o)
	{
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	/** Returns largest of two GeometricObjects. First is returned if equal size */
	public static GeometricObject max(GeometricObject o1, GeometricObject o2)
	{
		if (o1.compareTo(o2) >= 0)
			return o1;
		else
			return o2;
	}
}
