/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise2;

public class SavingsAccount extends Account
{
	// Overdraft limit of $0, as account cannot be overdrawn.
	private final double limit = 0.00;

	public SavingsAccount()
	{
	}

	public SavingsAccount(int newId, double newBalance)
	{
		super(newId, newBalance);
	}

	/** Remove amount from balance as long as it doesn't exceed limit */
	public void withdraw(double amount)
	{
		if ((super.getBalance() - amount) < limit)
			System.out.println("Cannot overdraw savings account.");
		else
			super.withdraw(amount);
	}

	/** Returns savings account information */
	public String toString()
	{
		return super.toString() + "Savings account cannot be overdrawn.\n";
	}

}
