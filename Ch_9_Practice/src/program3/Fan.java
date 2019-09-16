package program3;
/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Practice:	Ch. 9
 */

public class Fan
{
	/** Possible fan speeds */
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

	/** Current fan speed */
	private int speed = SLOW;

	/** Is fan on or not? */
	private boolean on = false;

	/** Radius of fan */
	private double radius = 5.0;

	/** Color of fan */
	private String color = "blue";

	/** Returns current speed of fan */
	public int getSpeed()
	{
		return speed;
	}

	/**
	 * Sets new fan speed. If newSpeed is greater than 3, speed is set to 3. If
	 * newSpeed is less than 1, speed is set to 1.
	 */
	public void setSpeed(int newSpeed)
	{
		if (newSpeed > 3)
			speed = 3;
		else if (newSpeed < 1)
			speed = 1;
		else
			speed = newSpeed;
	}

	/** Return whether fan is on */
	public boolean isOn()
	{
		return on;
	}

	/** Turns fan on */
	public void turnOn()
	{
		on = true;
	}

	/** Turns fan off */
	public void turnOff()
	{
		on = false;
	}

	/** Returns radius of fan */
	public double getRadius()
	{
		return radius;
	}

	/** Sets a new fan radius */
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}

	/** Returns color of fan */
	public String getColor()
	{
		return color;
	}

	/** Set new fan color */
	public void setColor(String newColor)
	{
		color = newColor;
	}

	/** Constructs a Fan object with default values */
	public Fan()
	{
	}

	/**
	 * Returns a String description of Fan. When on, returns fan speed, color, and
	 * radius. When off, return color, radius, and that the fan is off.
	 */
	public String toString()
	{
		if (on == false)
			return "Fan color is " + color + ", the fan radius is " + radius + ", and the fan is off.";
		else if (speed == SLOW)
			return ("Fan speed is set to SLOW, fan color is " + color + ", and fan radius is " + radius + ".");
		else if (speed == MEDIUM)
			return ("Fan speed is set to MEDIUM, fan color is " + color + ", and fan radius is " + radius + ".");
		else
			return ("Fan speed is set to FAST, fan color is " + color + ", and fan radius is " + radius + ".");

	}
}
