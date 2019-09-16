/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			4
 */

package program6;

import javafx.application.Application;
import javafx.scene.shape.Circle;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Program6 extends Application
{
	public void start(Stage primaryStage)
	{
		// Pane to hold circles
		Pane pane = new Pane();

		// Initial circle in center of window
		Circle circle = new Circle(250, 250, 15);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		pane.getChildren().add(circle);

		// Event handler on mouse press
		circle.setOnMousePressed(e ->
		{
			circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
			circle.setCenterX((Math.random() * 300) + 100);
			circle.setCenterY((Math.random() * 300) + 100);
		});

		// Create scene and set stage
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Program 6");
		primaryStage.setResizable(false);
		primaryStage.show();

	}

	public static void main(String[] args)
	{
		launch(args);
	}
}