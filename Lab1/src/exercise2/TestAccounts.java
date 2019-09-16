/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			1
 */

package exercise2;

public class TestAccounts
{

	public static void main(String[] args)
	{
		/** Create objects Account, CheckingAccount, and SavingsAccount */
		Account acc = new Account(1111, 420.69);
		CheckingAccount check = new CheckingAccount(2222, 8.88);
		SavingsAccount save = new SavingsAccount(3333, 9999.99);

		/** Test withdraw methods on each object */
		acc.withdraw(1000);
		check.withdraw(500.69); // Attempting to withdraw past overdraft limit
		save.withdraw(10000); // Attempting to overdraw savings
		save.withdraw(9999.99);

		/** Use toString methods to print each object */
		System.out.println(acc.toString());
		System.out.println(check.toString());
		System.out.println(save.toString());
	}

}
