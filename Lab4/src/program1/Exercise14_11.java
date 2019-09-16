/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			4
 */

package program1;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Exercise14_11 extends Application
{
	public void start(Stage primaryStage)
	{

		// Create circle for face
		Circle circle = new Circle(300, 300, 200);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.TRANSPARENT);

		Polygon triangle = new Polygon();
		triangle.setFill(Color.TRANSPARENT);
		triangle.setStroke(Color.BLACK);
		ObservableList<Double> list = triangle.getPoints();
		list.add(300.0);
		list.add(250.0);
		list.add(350.0);
		list.add(350.0);
		list.add(250.0);
		list.add(350.0);

		// Ellipses for eyes
		Ellipse e1 = new Ellipse(220, 220, 65, 50);
		Ellipse e2 = new Ellipse(380, 220, 65, 50);
		e1.setFill(Color.TRANSPARENT);
		e1.setStroke(Color.BLACK);
		e2.setFill(Color.TRANSPARENT);
		e2.setStroke(Color.BLACK);

		// Circles for pupils
		Circle p1 = new Circle(220, 220, 35);
		Circle p2 = new Circle(380, 220, 35);

		// Arc for mouth
		Arc arc = new Arc(300, 375, 115, 40, 180, 180);
		arc.setFill(Color.TRANSPARENT);
		arc.setStroke(Color.BLACK);

		// Pane and scene set in stage
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		pane.getChildren().add(triangle);
		pane.getChildren().add(e1);
		pane.getChildren().add(e2);
		pane.getChildren().add(p1);
		pane.getChildren().add(p2);
		pane.getChildren().add(arc);
		Scene scene = new Scene(pane, 600, 600);
		primaryStage.setTitle("Exercise 14_11");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
