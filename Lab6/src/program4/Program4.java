/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			6
 */

package program4;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Program4 extends Application
{
	// Declare array of strings for fruit names
	private String[] fruitNames =
	{ "Apple", "Banana", "Kiwi", "Mang0", "Orange", "Strawberry", "Tomato", "Watermelon" };

	// Declare ImageView array for fruit images
	private ImageView[] fruitImages =
	{ new ImageView("fruits/apple.png"), new ImageView("fruits/banana.png"), new ImageView("fruits/kiwi.png"),
			new ImageView("fruits/mang0.png"), new ImageView("fruits/orange.png"),
			new ImageView("fruits/strawberry.png"), new ImageView("fruits/tomato.png"),
			new ImageView("fruits/watermelon.png") };

	// Create Label array with fruitNames and fruitImages
	private Label[] fruitLabels = new Label[8];
	{
		for (int i = 0; i < 8; i++)
		{
			fruitLabels[i] = new Label(fruitNames[i], fruitImages[i]);
			fruitLabels[i].setContentDisplay(ContentDisplay.TOP);
		}
	}

	// Create combo box for selecting fruits
	private ComboBox<String> cbo = new ComboBox<>();

	public void start(Stage primaryStage)
	{
		// Add combo box and description pane to the border pane
		BorderPane pane = new BorderPane();

		// Label for combo box, add to pane
		Label lbComboBox = new Label("Select a fruit:", cbo);
		lbComboBox.setContentDisplay(ContentDisplay.RIGHT);
		BorderPane.setAlignment(lbComboBox, Pos.CENTER);
		pane.setLeft(lbComboBox);
		cbo.setValue("Apple");

		ObservableList<String> items = FXCollections.observableArrayList(fruitNames);
		cbo.getItems().addAll(items);
		pane.setCenter(fruitLabels[0]);

		// Display selected fruit
		cbo.setOnAction(ov ->
		{
			pane.setCenter(fruitLabels[items.indexOf(cbo.getValue())]);
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 500, 300);
		primaryStage.setTitle("Program4");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}