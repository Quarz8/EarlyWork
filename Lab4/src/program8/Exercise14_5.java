/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			4
 */

package program8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.shape.Circle;

public class Exercise14_5 extends Application
{
	public void start(Stage primaryStage)
	{
		// Create pane to hold circle and letters
		Pane pane = new Pane();

		// Centered circle for text to wrap around
		Circle circle = new Circle(80);
		circle.setCenterX(125);
		circle.setCenterY(125);

		// Text to be used
		String phrase = "WELCOME TO JAVA ";

		// Place text letter by letter into pane in a circle
		int i = 0;
		double degree = 360 / phrase.length();
		for (double degrees = 0; i < phrase.length(); i++, degrees += degree)
		{
			double pointX = circle.getCenterX() + circle.getRadius() * Math.cos(Math.toRadians(degrees));
			double pointY = circle.getCenterY() + circle.getRadius() * Math.sin(Math.toRadians(degrees));
			Text letter = new Text(pointX, pointY, phrase.charAt(i) + "");
			letter.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
			letter.setRotate(degrees + 90);
			pane.getChildren().add(letter);
		}

		// Set scene and show stage
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("Exercise 14_05");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
