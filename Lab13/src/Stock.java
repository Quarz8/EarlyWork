// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			13_2

public class Stock
{
	// Symbol and name of stock
	String symbol;
	String name;

	// Stock price for previous day
	double previousClosingPrice;

	// Stock price for current time
	double currentPrice;

	/** Construct a stock with specified symbol and name */
	Stock(String newSymbol, String newName)
	{
		symbol = newSymbol;
		name = newName;
	}

	/** Returns percentage changed from previousClosingPrice to currentPrice */
	double getChangePercent()
	{
		return (currentPrice - previousClosingPrice) / previousClosingPrice;
	}
}
