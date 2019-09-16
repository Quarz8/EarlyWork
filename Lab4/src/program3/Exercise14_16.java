/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			4
 */

package program3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Exercise14_16 extends Application
{

	public void start(Stage primaryStage)
	{
		Pane pane = new Pane();

		// Used to space lines in 3x3 grid
		double divider = 3;

		// Create and add vertical lines
		for (int i = 0; i < 2; i++)
		{
			Line line = new Line();
			line.setStroke(Color.RED);
			line.startXProperty().bind(pane.widthProperty().divide(divider));
			line.startYProperty().bind(pane.layoutYProperty());
			line.endXProperty().bind(line.startXProperty());
			line.endYProperty().bind(pane.heightProperty());
			pane.getChildren().add(line);
			divider /= 2;
		}
		// Reset divider
		divider = 3;

		// Create and add horizontal lines
		for (int i = 0; i < 2; i++)
		{
			Line line = new Line();
			line.setStroke(Color.BLUE);
			line.startXProperty().bind(pane.layoutXProperty());
			line.startYProperty().bind(pane.heightProperty().divide(divider));
			line.endXProperty().bind(pane.widthProperty());
			line.endYProperty().bind(pane.heightProperty().divide(divider));
			pane.getChildren().add(line);
			divider /= 2;
		}

		// Set scene and show stage
		primaryStage.setScene(new Scene(pane, 400, 400));
		primaryStage.setTitle("Exercise 14_16");
		primaryStage.show();
	}

	public static void main(String args)
	{
		Application.launch(args);
	}
}
