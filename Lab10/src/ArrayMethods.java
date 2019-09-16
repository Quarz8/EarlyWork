// Class:		CS 1301/17
// Term:		Fall 2017
// Instructor:	Prof. Perry
// Name:		Warren Davis
// Lab:			10_4

public class ArrayMethods
{

	// Define 4 methods and test them by creating an array of length 5 within main
	// method and filling it with random numbers between 1 and 1000. Display
	// original array followed by the smallest number in the array, greatest number
	// in the array, reversed array, and the square of each value in the array.
	public static void main(String[] args)
	{
		// Creates original random array
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = 1 + (int) (Math.random() * 1000);
		}

		// Print original array arr
		System.out.print("Original array:\t\t\t");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		// Print smallest number in arr
		System.out.println("\nSmallest number in array:\t" + arrayMin(arr));
		
		// Print greatest number in arr
		System.out.println("Greatest number in array:\t" + arrayMax(arr));
		
		// Reverse arr and prints it
		arrayReverse(arr);
		System.out.print("Reversed array:\t\t\t");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		// Reverse array again to make it normal
		arrayReverse(arr);
		
		// Squares arr and prints it
		arraySquared(arr);
		System.out.print("\nSquared array:\t\t\t");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	// Returns minimum number in array
	public static int arrayMin(int[] arr)
	{
		int min = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	// Returns greatest number in array
	public static int arrayMax(int[] arr)
	{
		int max = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	// Reverses order of values in array
	public static void arrayReverse(int[] arr)
	{
		for (int i = 0; i < arr.length / 2; i++)
		{
			// preserves value of arr[arr.length-(i+1)]
			int temp = arr[arr.length - (i + 1)];

			arr[arr.length - (i + 1)] = arr[i];
			arr[i] = temp;

		}
	}

	// Squares each value in array
	public static void arraySquared(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = (int) Math.pow(arr[i], 2);
		}
	}
}
