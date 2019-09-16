/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			7
 */

package program1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Program1 extends Application
{

	public void start(Stage primaryStage)
	{
		// GridPane for text fields, labels, and button
		GridPane pane = new GridPane();
		pane.setVgap(5);
		pane.setHgap(5);
		pane.setAlignment(Pos.CENTER);

		// Create text field for factorial input
		TextField input = new TextField("0");
		input.setAlignment(Pos.CENTER_RIGHT);

		// Create text field for factorial output
		TextField output = new TextField("0");
		output.setAlignment(Pos.CENTER_RIGHT);
		output.setEditable(false);

		// Labels for text fields
		Label lbInput = new Label("Factorial");
		Label lbOutput = new Label("Output");

		// Button to initiate factorial calculation
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
			output.setText(Long.toString(findFactorial(Integer.parseInt(input.getText()))));
		});

		// Create scene and set stage
		Scene scene = new Scene(pane, 250, 100);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Program 1");
		primaryStage.show();
	}

	// Recursive method for calculating a factorial
	public static long findFactorial(int number)
	{
		if (number <= -1)
			return -1;
		else if (number == 0)
			return 1;
		else
			return number * findFactorial(number - 1);
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}