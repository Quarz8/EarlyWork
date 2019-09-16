// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			13_3
public class QuadraticEquation
{
	/** The three coefficients of a quadratic equation */
	private double a;
	private double b;
	private double c;

	/** Construct a quadratic equation with specified coefficients */
	QuadraticEquation(double newA, double newB, double newC)
	{
		a = newA;
		b = newB;
		c = newC;
	}

	/** Return coefficient a */
	public double getA()
	{
		return a;
	}

	/** Return coefficient b */
	public double getB()
	{
		return b;
	}

	/** Return coefficient c */
	public double getC()
	{
		return c;
	}

	/** Returns discriminant (B^(2)-4ac) */
	public double getDiscriminant()
	{
		return Math.pow(b, 2) - 4 * a * c;
	}

	/** Returns first root of quadratic equation */
	public double getRoot1()
	{
		if (getDiscriminant() < 0)
			return 0;
		return (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
	}

	/** Returns second root of quadratic equation */
	public double getRoot2()
	{
		if (getDiscriminant() < 0)
			return 0;
		return (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
	}

}
