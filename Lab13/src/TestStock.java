// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			13_2

public class TestStock
{

	public static void main(String[] args)
	{
		// Create Stock object with symbol "ORCL" and name "Oracle Corporation"
		Stock stock1 = new Stock("ORCL", "Oracle Corporation");

		// Set previous closing price of stock1 to 34.5; current price to 34.35
		stock1.previousClosingPrice = 34.5;
		stock1.currentPrice = 34.35;

		// Display price-change percentage
		System.out.printf("The price-change percentage is %f%%\n\n", stock1.getChangePercent() * 100);

		// Create 2 more stock objects and test all class methods on them. Display
		// meaningful info after each method call.

		// Create stock2, Microsoft
		Stock stock2 = new Stock("MSFT", "Microsoft Corporation");
		stock2.previousClosingPrice = 83.87;
		stock2.currentPrice = 83.81;

		// Call method getChangePercent() and print info on stock2
		System.out.println("The previous closing price for " + stock2.name + " (" + stock2.symbol + ") was "
				+ stock2.previousClosingPrice);
		System.out
				.println("The current price for " + stock2.name + " (" + stock2.symbol + ") is " + stock2.currentPrice);
		System.out.printf("The price-change percentage is %f%%\n\n", stock2.getChangePercent() * 100);

		// Create stock3, Google
		Stock stock3 = new Stock("GOOGL", "Alphabet Inc Class A");
		stock3.previousClosingPrice = 1044.15;
		stock3.currentPrice = 1044.73;

		// Call method getChangePercent and print info on stock3
		System.out.println("The previous closing price for " + stock3.name + " (" + stock3.symbol + ") was "
				+ stock3.previousClosingPrice);
		System.out
				.println("The current price for " + stock3.name + " (" + stock3.symbol + ") is " + stock3.currentPrice);
		System.out.printf("The price-change percentage is %f%%\n\n", stock3.getChangePercent() * 100);
	}

}
