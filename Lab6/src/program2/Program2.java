/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			6
 */

package program2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Program2 extends Application
{
	public void start(Stage primaryStage)
	{
		// GridPane for labeled text fields
		GridPane pane = new GridPane();
		pane.setVgap(5);
		pane.setHgap(5);
		pane.setAlignment(Pos.CENTER);

		// Create text fields for miles and kilometers
		TextField tfMile = new TextField("0");
		tfMile.setAlignment(Pos.CENTER_RIGHT);
		TextField tfKilometer = new TextField("0");
		tfKilometer.setAlignment(Pos.CENTER_RIGHT);

		// Create labels for text fields
		Label lbMile = new Label("Mile");
		Label lbKilometer = new Label("Kilometer");

		// Add labels and text fields to pane
		pane.add(lbMile, 0, 0);
		pane.add(lbKilometer, 0, 1);
		pane.add(tfMile, 1, 0);
		pane.add(tfKilometer, 1, 1);

		// Event handlers for entering miles and kilometers
		tfMile.setOnAction(e ->
		{
			tfKilometer.setText(Double.toString(new Double(tfMile.getText()) / 0.62137119));
		});
		tfKilometer.setOnAction(e ->
		{
			tfMile.setText(Double.toString(new Double(tfKilometer.getText()) * 0.62137119));
		});

		// Create scene and set stage
		Scene scene = new Scene(pane, 250, 75);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise16_04");
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}