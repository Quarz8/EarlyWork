/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			6
 */

package program1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Program1 extends Application
{
	public void start(Stage primaryStage)
	{
		// BorderPane
		BorderPane pane = new BorderPane();

		// Create radio buttons and check box
		RadioButton rbCircle = new RadioButton("Circle");
		RadioButton rbRectangle = new RadioButton("Rectangle");
		RadioButton rbEllipse = new RadioButton("Ellipse");
		CheckBox cbFill = new CheckBox("Fill");

		// Group radio buttons
		ToggleGroup group = new ToggleGroup();
		rbCircle.setToggleGroup(group);
		rbRectangle.setToggleGroup(group);
		rbEllipse.setToggleGroup(group);

		// HBox for buttons and check box.
		HBox paneForButtons = new HBox();
		paneForButtons.setSpacing(10);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.getChildren().addAll(rbCircle, rbRectangle, rbEllipse, cbFill);

		// StackPane for shapes
		StackPane paneForShapes = new StackPane();

		// Create shapes to display (default is filled)
		Circle circle = new Circle(50);
		circle.setStroke(Color.BLACK);
		Rectangle rectangle = new Rectangle(125, 75);
		rectangle.setStroke(Color.BLACK);
		Ellipse ellipse = new Ellipse(75, 50);
		ellipse.setStroke(Color.BLACK);

		// Set eventHandlers for radio buttons
		rbCircle.setOnAction(e ->
		{
			paneForShapes.getChildren().clear();
			paneForShapes.getChildren().add(circle);
			if (!cbFill.isSelected())
				circle.setFill(Color.TRANSPARENT);

		});

		rbRectangle.setOnAction(e ->
		{
			paneForShapes.getChildren().clear();
			paneForShapes.getChildren().add(rectangle);
			if (!cbFill.isSelected())
				rectangle.setFill(Color.TRANSPARENT);

		});

		rbEllipse.setOnAction(e ->
		{
			paneForShapes.getChildren().clear();
			paneForShapes.getChildren().add(ellipse);
			if (!cbFill.isSelected())
				ellipse.setFill(Color.TRANSPARENT);

		});

		cbFill.setOnAction(e ->
		{
			if (cbFill.isSelected())
			{
				circle.setFill(Color.BLACK);
				rectangle.setFill(Color.BLACK);
				ellipse.setFill(Color.BLACK);
			}
			else
			{
				circle.setFill(Color.TRANSPARENT);
				rectangle.setFill(Color.TRANSPARENT);
				ellipse.setFill(Color.TRANSPARENT);
			}
		});

		// Add all panes to borderpane
		pane.setCenter(paneForShapes);
		pane.setBottom(paneForButtons);

		// Create scene and set stage
		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise16_02");
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}