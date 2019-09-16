// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	9_4

public class PalindromicPrime
{
	// Returns true if String is a palindrome by comparing first half of string to
	// second half.
	public static boolean isPalindrome(String number)
	{
		for (int i = 0; i < number.length() / 2; i++)
			if (number.charAt(i) != number.charAt(number.length() - (1 + i)))
				return false;
		return true;
	}

	// Returns true if integer is prime
	public static boolean isPrime(int num)
	{
		for (int divisor = 2; divisor <= num / 2; divisor++)
			if (num % divisor == 0)
				return false;
		return true;
	}

	public static void main(String[] args)
	{
		int num = 2; // First prime number
		String number = Integer.toString(num); // num in String form

		for (int i = 1; i <= 10; i++) // For 10 rows
		{
			int j = 1;
			while (j <= 10) // 10 numbers per row
			{
				if (isPalindrome(number) && isPrime(num))
				{
					System.out.print(num + " ");
					num++;
					number = Integer.toString(num);
					j++;
				}
				else
				{
					num++;
					number = Integer.toString(num);
				}
			}
			System.out.print("\n");
		}

	}

}
