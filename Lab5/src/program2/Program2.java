/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			4
 */

package program2;

import javafx.application.Application;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.paint.Color;

public class Program2 extends Application
{
	public void start(Stage primaryStage)
	{
		// Pane for vertices and distance
		Pane pane = new Pane();

		// Create two circles as specified
		Circle point1 = new Circle(40, 40, 10);
		point1.setFill(Color.WHITE);
		point1.setStroke(Color.BLACK);
		Circle point2 = new Circle(120, 150, 10);
		point2.setFill(Color.WHITE);
		point2.setStroke(Color.BLACK);

		// Create line connecting the 2 circles and bind to each
		Line line = new Line(point1.getCenterX(), point1.getCenterY(), point2.getCenterX(), point2.getCenterY());
		line.startXProperty().bind(point1.centerXProperty());
		line.startYProperty().bind(point1.centerYProperty());
		line.endXProperty().bind(point2.centerXProperty());
		line.endYProperty().bind(point2.centerYProperty());

		// Find length of the line using Pythagorean Theorem
		double a = Math.abs(point2.getCenterX() - point1.getCenterX());
		double b = Math.abs(point2.getCenterY() - point1.getCenterY());
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		// Create text label displaying distance c
		Text distance = new Text((point1.getCenterX() + point2.getCenterX()) / 2,
				(point1.getCenterY() + point2.getCenterY()) / 2, Double.toString(c));
		distance.setFill(Color.INDIANRED);

		// Allow both circles to be dragged
		point1.setOnMouseDragged(e ->
		{
			point1.setCenterX(e.getX());
			point1.setCenterY(e.getY());
			distance.setX((point1.getCenterX() + point2.getCenterX()) / 2);
			distance.setY((point1.getCenterY() + point2.getCenterY()) / 2);
			distance.setText(Double.toString(Math.sqrt(Math.pow(Math.abs(point2.getCenterX() - point1.getCenterX()), 2)
					+ Math.pow(Math.abs(point2.getCenterY() - point1.getCenterY()), 2))));
		});

		point2.setOnMouseDragged(e ->
		{
			point2.setCenterX(e.getX());
			point2.setCenterY(e.getY());
			distance.setX((point1.getCenterX() + point2.getCenterX()) / 2);
			distance.setY((point1.getCenterY() + point2.getCenterY()) / 2);
			distance.setText(Double.toString(Math.sqrt(Math.pow(Math.abs(point2.getCenterX() - point1.getCenterX()), 2)
					+ Math.pow(Math.abs(point2.getCenterY() - point1.getCenterY()), 2))));
		});

		// Add shapes and label to Pane
		pane.getChildren().add(line);
		pane.getChildren().add(point1);
		pane.getChildren().add(point2);
		pane.getChildren().add(distance);

		// Create scene and set stage
		Scene scene = new Scene(pane, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Program 2");
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}