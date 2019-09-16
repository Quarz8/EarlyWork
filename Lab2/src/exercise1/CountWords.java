/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			2
 */

package exercise1;

import java.net.URL;
import java.util.Scanner;

public class CountWords
{
	public static void main(String[] args)
	{
		// Word count variable
		int count = 0;

		try
		{
			URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");

			Scanner s = new Scanner(url.openStream());

			while (s.hasNext())
			{
				s.next();
				count++;
			}
			// Print word count results
			System.out.println("Word count: " + count);
			s.close();
		}
		catch (java.net.MalformedURLException ex)
		{
			System.out.println("Invalid URL: " + ex.getMessage());
			ex.printStackTrace();
		}
		catch (java.io.IOException ex)
		{
			System.out.println("IO Error: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}