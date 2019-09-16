/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			7
 */

package program3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Program3 extends Application
{
	public void start(Stage primaryStage)
	{
		// GridPane for text fields, labels, and button
		GridPane pane = new GridPane();
		pane.setVgap(5);
		pane.setHgap(5);
		pane.setAlignment(Pos.CENTER);

		// Create text field for number input
		TextField input = new TextField("0");
		input.setAlignment(Pos.CENTER_RIGHT);

		// Create text field for sum output
		TextField output = new TextField("0");
		output.setAlignment(Pos.CENTER_RIGHT);
		output.setEditable(false);

		// Labels for text fields
		Label lbInput = new Label("Number");
		Label lbOutput = new Label("Sum Digits");

		// Button to initiate sum of digits calculation
		Button btCalc = new Button("Calculate!");
		btCalc.setAlignment(Pos.CENTER);

		// Add text fields, labels, and button to pane
		pane.add(lbInput, 0, 0);
		pane.add(lbOutput, 0, 1);
		pane.add(input, 1, 0);
		pane.add(output, 1, 1);
		pane.add(btCalc, 1, 2);

		// Use recursion to calculate factorial output on button press
		btCalc.setOnAction(e ->
		{
			output.setText(Integer.toString(sumDigits(Long.parseLong(input.getText()))));
		});

		// Create scene and set stage
		Scene scene = new Scene(pane, 250, 100);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Program 3");
		primaryStage.show();
	}

	// Recursive method for finding the sum of digits in a number
	public static int sumDigits(long number)
	{
		if (Long.toString(number).length() <= 0)
			return 0;
		else if (Long.toString(number).length() <= 1)
			return (Integer.parseInt(Long.toString(number).substring(0, 1))); // Leftmost digit
		else
			return (Integer.parseInt(Long.toString(number).substring(0, 1)) // Leftmost digit
					+ sumDigits(Long.parseLong(Long.toString(number).substring(1, Long.toString(number).length()))));
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}