/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			2
 */

package exercise4;

import java.util.Scanner;
import java.io.*;

public class ComputeStudentGPAProgram
{

	public static void main(String[] args) throws Exception
	{
		// Student file for Irving Whitewood
		File file = new File("C:\\Users\\Warren\\grades\\Irving-Whitewood.csv");

		// Scanner to read student file
		Scanner read = new Scanner(file);

		// Determine first and last name using file name
		String fileName = file.toString();
		String[] fileNameSplit = fileName.split("grades");
		String fName = fileNameSplit[1].substring(1, fileNameSplit[1].indexOf('-'));
		String lName = fileNameSplit[1].substring(fileNameSplit[1].indexOf('-') + 1, fileNameSplit[1].indexOf('.'));

		// Adds all courses from file to MyStudent
		while (read.hasNextLine())
		{
			String line = read.nextLine();
			String[] temp = line.split(",");
			// System.out.println(temp[0]+temp[1]+temp[2]);
			String courseName = temp[0];
			int creditHours = Integer.parseInt(temp[1]);
			char letterGrade = temp[2].charAt(0);

			MyStudent.addCourse(courseName, creditHours, letterGrade);
		}

		// MyStudent object for Whitewood
		MyStudent Whitewood = new MyStudent(fName, lName);

		// Print GPA using toString method for MyStudent Whitewood
		System.out.println(Whitewood.toString());
	}
}
