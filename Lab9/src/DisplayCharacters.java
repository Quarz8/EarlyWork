// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			9_3

//Defines method printChars
public class DisplayCharacters
{

	// Displays characters between ch1 and ch2 with the specified number of chars
	// per line.
	public static void printChars(char ch1, char ch2, int numberPerLine)
	{

		// Keeps printing until ch1 surpasses ch2
		while (ch1 <= ch2)
		{
			// Prints incrementing chars up from ch1, up to the specified number per line
			for (int i = 1; i <= numberPerLine; i++)
			{
				if (ch1 <= ch2) // Ensure chars above ch2 are not printed
					System.out.print(ch1++ + " ");
			}
			System.out.print("\n"); // moves to next line
		}
	}

	// Tests the printChars method
	public static void main(String[] args)
	{
		// test as specified in book
		printChars('1', 'Z', 10);

	}

}
