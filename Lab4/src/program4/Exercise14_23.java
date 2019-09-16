/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			4
 */

package program4;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.Scanner;

public class Exercise14_23 extends Application
{
	public void start(Stage primaryStage)
	{
		// Scanner for user input
		Scanner input = new Scanner(System.in);

		// Pane to hold rectangles and label
		Pane pane = new Pane();

		// User input for rectangle 1
		System.out.println("Enter center coordinates, width, and height of rectangle 1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();

		// Aligns input as center coordinate
		x1 = x1 - (width1 / 2);
		y1 = y1 - (height1 / 2);

		Rectangle rec1 = new Rectangle(x1, y1, width1, height1);

		rec1.setStroke(Color.BLACK);
		rec1.setFill(Color.TRANSPARENT);

		// User input for rectangle 2
		System.out.println("Enter center coordinates, width, and height of rectangle 2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		input.close();

		// Aligns input as center coordinate
		x2 = x2 - (width2 / 2);
		y2 = y2 - (height2 / 2);
		
		Rectangle rec2 = new Rectangle(x2, y2, width2, height2);
		
		rec2.setStroke(Color.BLACK);
		rec2.setFill(Color.TRANSPARENT);

		// Add rectangles to pane
		pane.getChildren().add(rec1);
		pane.getChildren().add(rec2);

		// Get bounds of rectangles
		Bounds b1 = rec1.getBoundsInLocal();
		Bounds b2 = rec2.getBoundsInLocal();

		// Check bounds of rectangles and
		// choose appropriate label to pane
		Label label = new Label();
		if (b1.contains(b2) || b2.contains(b1))
			label = new Label("One rectangle is contained in another");
		else if (b1.intersects(b2) || b2.intersects(b1))
			label = new Label("The rectangles overlap");
		else
			label = new Label("The rectangles do not overlap");

		// Add label to pane
		pane.getChildren().add(label);

		// Bring label to bottom right of pane
		label.setLayoutX(190);
		label.setLayoutY(375);

		// Set scene and show stage
		primaryStage.setScene(new Scene(pane, 400, 400));
		primaryStage.setTitle("Exercise 14_23");
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
