/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			7
 */

package program2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Program2 extends Application
{
	public void start(Stage primaryStage)
	{
		// GridPane for text fields, labels, and button
		GridPane pane = new GridPane();
		pane.setVgap(5);
		pane.setHgap(5);
		pane.setAlignment(Pos.CENTER);

		// Create text field for string input
		TextField tfString = new TextField();
		tfString.setAlignment(Pos.CENTER_RIGHT);

		// Create text field for character input
		TextField tfChar = new TextField();
		tfChar.setAlignment(Pos.CENTER_RIGHT);

		// Create text field for charcter count output
		TextField tfOutput = new TextField("0");
		tfOutput.setAlignment(Pos.CENTER_RIGHT);
		tfOutput.setEditable(false);

		// Labels for text fields
		Label lbString = new Label("String");
		Label lbChar = new Label("Character");
		Label lbOutput = new Label("Char Count");

		// Button to initiate factorial calculation
		Button btInitiate = new Button("Initiate!");
		btInitiate.setAlignment(Pos.CENTER);

		// Add text fields, labels, and button to pane
		pane.add(lbString, 0, 0);
		pane.add(lbChar, 0, 1);
		pane.add(lbOutput, 0, 2);
		pane.add(tfString, 1, 0);
		pane.add(tfChar, 1, 1);
		pane.add(tfOutput, 1, 2);
		pane.add(btInitiate, 1, 3);

		// Use recursion to calculate factorial output on button press
		btInitiate.setOnAction(e ->
		{
			if (tfChar.getText().length() >= 1)
				tfOutput.setText(
						Integer.toString(getNumberOfCharacters(tfString.getText(), tfChar.getText().charAt(0))));
		});

		// Create scene and set stage
		Scene scene = new Scene(pane, 250, 150);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Program 2");
		primaryStage.show();
	}

	// Recursive method to return number of characters in a string
	public static int getNumberOfCharacters(String string, char character)
	{
		if (string.length() == 0)
			return 0;
		else if (string.length() <= 1 && string.charAt(0) == character)
			return 1;
		else if (string.length() >= 2 && string.charAt(0) == character)
			return 1 + getNumberOfCharacters(string.substring(1, string.length()), character);
		else
			return getNumberOfCharacters(string.substring(1, string.length()), character);
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}