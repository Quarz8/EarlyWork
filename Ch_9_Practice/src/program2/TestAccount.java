package program2;
/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Practice:	Ch. 9
 */

public class TestAccount
{

	public static void main(String[] args)
	{
		// Create first Account with specified ID and balance
		Account account1 = new Account(1122, 20000);

		// Assign annual interest rate of 4.5% to account1
		Account.setAnnualInterestRate(4.5);

		// Withdraw $2,500 from account1
		account1.withdraw(2500);

		// Deposit $3,000 to account1
		account1.deposit(3000);

		// Print the balance, monthly interest, and date created for account1
		System.out.printf("Balance of account1:\t$%-1.2f\n", account1.getBalance());
		System.out.printf("Monthly interest of account1:\t$%-1.2f\n", account1.getMonthlyInterest());
		System.out.printf("Creation of account1:\t%s\n\n", account1.getDateCreated());

		// Create 2 more Account objects with arbitrarily different balances and IDs
		Account myAccount = new Account(34598755, 5000.08);
		Account yourAccount = new Account(42069, 5.55);

		// Test every Account class instance method on myAccount and print meaningful
		// information after each method call.
		myAccount.deposit(420);
		System.out.printf("myAccount balance after deposit:\t$%-10.2f\n", myAccount.getBalance());
		myAccount.withdraw(.02);
		System.out.printf("myAccount balance after withdrawal:\t$%-10.2f\n", myAccount.getBalance());
		System.out.printf("myAccount monthly interest:\t\t$%-1.2f\n", myAccount.getMonthlyInterest());
		myAccount.setId(2);
		System.out.printf("myAccount ID set to:\t\t\t%d\n", myAccount.getId());
		myAccount.setBalance(2754.45);
		System.out.printf("myAccount balance set to:\t\t$%-10.2f\n", myAccount.getBalance());
		System.out.println("Printing myAccount:\n" + myAccount);

		// Test every Account class instance method on yourAccount and print meaningful
		// information after each method call.
		yourAccount.deposit(69);
		System.out.printf("yourAccount balance after deposit:\t$%-10.2f\n", yourAccount.getBalance());
		yourAccount.withdraw(8);
		System.out.printf("yourAccount balance after withdrawal:\t$%-10.2f\n", yourAccount.getBalance());
		System.out.printf("yourAccount monthly interest:\t\t$%-1.2f\n", yourAccount.getMonthlyInterest());
		yourAccount.setId(3);
		System.out.printf("yourAccount ID set to:\t\t\t%d\n", yourAccount.getId());
		yourAccount.setBalance(8);
		System.out.printf("yourAccount balance set to:\t\t$%-10.2f\n", yourAccount.getBalance());
		System.out.println("Printing yourAccount:\n" + yourAccount);

	}

}