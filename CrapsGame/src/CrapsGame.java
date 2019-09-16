// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Assignment:	8_4

// Defines method rollDie
public class CrapsGame
{

	// Returns a random number between 1 and 6
	public static int rollDie()
	{
		return 1 + (int) (Math.random() * 6);
	}

	// Simulates a game of craps with one player.
	public static void main(String[] args)
	{
		// Roll the dice
		int roll1 = rollDie(), roll2 = rollDie();

		// Sum of the 2 die rolls
		int sum = roll1 + roll2;

		// Declare int point for potential later use
		int point;

		// Print the results of the first roll
		System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + sum);

		// Check if sum of first rolls was craps (lose)
		if (sum == 2 || sum == 3 || sum == 12)
			System.out.println("You lose");

		// Check if sum of rolls was a natural (win)
		else if (sum == 7 || sum == 11)
			System.out.println("You win");

		// If neither craps nor natural, enter point phase
		else
		{
			point = sum;
			do
			{
				// print point value
				System.out.println("point is " + point);
				// re-roll dice
				roll1 = rollDie();
				roll2 = rollDie();
				// new sum of new 2 die rolls
				sum = roll1 + roll2;
				System.out.println("You rolled " + roll1 + " + " + roll2 + " = " + sum);
				//Check if new sum equals 7 (lose)
				if (sum==7)
					System.out.println("You lose");
				//Check if new sum equals point (win)
				else if (sum==point)
					System.out.println("You win");
			} while (sum != 7 && sum != point);
		}

	}

}
