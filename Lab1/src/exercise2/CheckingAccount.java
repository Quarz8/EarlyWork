/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise2;

public class CheckingAccount extends Account
{
	// Overdraft limit of $100
	private double limit = -100.00;

	public CheckingAccount()
	{
	}

	public CheckingAccount(int newId, double newBalance)
	{
		super(newId, newBalance);
	}

	/** Remove amount from balance as long as it doesn't exceed limit */
	public void withdraw(double amount)
	{
		if ((super.getBalance() - amount) < limit)
			System.out.println("Exceeds overdraft limit; unable to withdraw.");
		else
			super.withdraw(amount);
	}

	/** Returns checking account information */
	public String toString()
	{
		return super.toString() + "Checking account has overdraft limit of $100.00.\n";
	}
}
