/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			6
 */

package program6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;

public class Program6 extends Application
{
	public void start(Stage primaryStage)
	{
		// Create borderpane for ListView menu and lbMyOrder
		BorderPane pane = new BorderPane();

		// Create observable list for menu
		ObservableList<String> menuList = FXCollections.observableArrayList("Hamburger", "Hot Dog", "Chips", "Tendies",
				"Fries", "Deepfried Memes", "Drink");

		// Create ListView using menu list and add to pane
		ListView<String> menu = new ListView<>(menuList);
		menu.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		menu.setPrefWidth(150);
		pane.setLeft(menu);

		// Create labeled TextArea to show myOrder and add to a stack pane
		Text myOrder = new Text();
		Label lbMyOrder = new Label("My Order", myOrder);
		lbMyOrder.setContentDisplay(ContentDisplay.BOTTOM);

		StackPane paneForMyOrder = new StackPane();
		paneForMyOrder.getChildren().add(lbMyOrder);
		pane.setCenter(paneForMyOrder);

		// Add listener for menu selection
		menu.getSelectionModel().selectedItemProperty().addListener(ov ->
		{
			myOrder.setText(""); // Clears myOrder for new order input

			for (String s : menu.getSelectionModel().getSelectedItems())
			{
				myOrder.setText(myOrder.getText() + s + "\n");
			}
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Program6");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}