// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			7_4

import java.util.Scanner;

public class Practice_7_4
{

	// Reads a string from the user and prints out the count of each letter
	// (ignoring case). Print only the counters with values greater than 0. Use
	// proper labels for the outputs.
	public static void main(String[] args)
	{
		// Scanner for user input
		Scanner s = new Scanner(System.in);

		// Prompts user to enter a string and stores it as input
		System.out.print("Enter a string: ");
		String input = s.nextLine();

		// Prints original input with proper label
		System.out.println("\nEntered String: " + input + "\n");

		// Changes input to all upper case for simplicity
		input = input.toUpperCase();

		// Initialize Count variables as 0
		int aCount = 0, bCount = 0, cCount = 0, dCount = 0, eCount = 0, fCount = 0, gCount = 0, hCount = 0, iCount = 0,
				jCount = 0, kCount = 0, lCount = 0, mCount = 0, nCount = 0, oCount = 0, pCount = 0, qCount = 0,
				rCount = 0, sCount = 0, tCount = 0, uCount = 0, vCount = 0, wCount = 0, xCount = 0, yCount = 0,
				zCount = 0;

		// Checks each character in the string
		for (int i = 0; i < input.length(); i++)
		{
			// Adds to appropriate count if character matches
			switch (input.charAt(i))
			{
			case 'A':
				aCount++;
				break;
			case 'B':
				bCount++;
				break;
			case 'C':
				cCount++;
				break;
			case 'D':
				dCount++;
				break;
			case 'E':
				eCount++;
				break;
			case 'F':
				fCount++;
				break;
			case 'G':
				gCount++;
				break;
			case 'H':
				hCount++;
				break;
			case 'I':
				iCount++;
				break;
			case 'J':
				jCount++;
				break;
			case 'K':
				kCount++;
				break;
			case 'L':
				lCount++;
				break;
			case 'M':
				mCount++;
				break;
			case 'N':
				nCount++;
				break;
			case 'O':
				oCount++;
				break;
			case 'P':
				pCount++;
				break;
			case 'Q':
				qCount++;
				break;
			case 'R':
				rCount++;
				break;
			case 'S':
				sCount++;
				break;
			case 'T':
				tCount++;
				break;
			case 'U':
				uCount++;
				break;
			case 'V':
				vCount++;
				break;
			case 'W':
				wCount++;
				break;
			case 'X':
				xCount++;
				break;
			case 'Y':
				yCount++;
				break;
			case 'Z':
				zCount++;
				break;

			}
		}

		// If statements to print Count variable if it is above zero
		if (aCount > 0)
			System.out.println("Letter A: " + aCount);
		if (bCount > 0)
			System.out.println("Letter B: " + bCount);
		if (cCount > 0)
			System.out.println("Letter C: " + cCount);
		if (dCount > 0)
			System.out.println("Letter D: " + dCount);
		if (eCount > 0)
			System.out.println("Letter E: " + eCount);
		if (fCount > 0)
			System.out.println("Letter F: " + fCount);
		if (gCount > 0)
			System.out.println("Letter G: " + gCount);
		if (hCount > 0)
			System.out.println("Letter H: " + hCount);
		if (iCount > 0)
			System.out.println("Letter I: " + iCount);
		if (jCount > 0)
			System.out.println("Letter J: " + jCount);
		if (kCount > 0)
			System.out.println("Letter K: " + kCount);
		if (lCount > 0)
			System.out.println("Letter L: " + lCount);
		if (mCount > 0)
			System.out.println("Letter M: " + mCount);
		if (nCount > 0)
			System.out.println("Letter N: " + nCount);
		if (oCount > 0)
			System.out.println("Letter O: " + oCount);
		if (pCount > 0)
			System.out.println("Letter P: " + pCount);
		if (qCount > 0)
			System.out.println("Letter Q: " + qCount);
		if (rCount > 0)
			System.out.println("Letter R: " + rCount);
		if (sCount > 0)
			System.out.println("Letter S: " + sCount);
		if (tCount > 0)
			System.out.println("Letter T: " + tCount);
		if (uCount > 0)
			System.out.println("Letter U: " + uCount);
		if (vCount > 0)
			System.out.println("Letter V: " + vCount);
		if (wCount > 0)
			System.out.println("Letter W: " + wCount);
		if (xCount > 0)
			System.out.println("Letter X: " + xCount);
		if (yCount > 0)
			System.out.println("Letter Y: " + yCount);
		if (zCount > 0)
			System.out.println("Letter Z: " + zCount);

	}

}
