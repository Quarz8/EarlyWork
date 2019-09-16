/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise2;

import java.util.Date;

public class Account
{
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated = new Date();

	/** Construct an account with ID and balance of 0 */
	Account()
	{
	}

	/** Construct an account with specified ID and balance */
	Account(int newId, double newBalance)
	{
		id = newId;
		balance = newBalance;
	}

	/** Return ID */
	public int getId()
	{
		return id;
	}

	/** Set a new ID */
	public void setId(int newId)
	{
		id = newId;
	}

	/** Return balance */
	public double getBalance()
	{
		return balance;
	}

	/** Set new balance */
	public void setBalance(double newBalance)
	{
		balance = newBalance;
	}

	/** Return annual interest rate */
	public static double getAnnualInterestRate()
	{
		return annualInterestRate;
	}

	/** Set annual interest rate */
	public static void setAnnualInterestRate(double newAnnualInterestRate)
	{
		annualInterestRate = newAnnualInterestRate;
	}

	/** Return date account was created */
	public Date getDateCreated()
	{
		return dateCreated;
	}

	/** Return monthly interest rate */
	public static double getMonthlyInterestRate()
	{
		return annualInterestRate / 12;
	}

	/** Return monthly interest */
	public double getMonthlyInterest()
	{
		return balance * (getMonthlyInterestRate() / 100);
	}

	/** Remove amount from balance */
	public void withdraw(double amount)
	{
		balance -= amount;
	}

	/** Add amount to balance */
	public void deposit(double amount)
	{
		balance += amount;
	}

	/** Returns account information */
	public String toString()
	{
		return String.format(
				"Account ID:\t\t%d\nAccount Balance:\t$%-1.2f\nInterest Rate:\t\t%-1.2f%%\n\nDate Opened:\t\t%s\n", id,
				balance, annualInterestRate, getDateCreated());
	}
}
