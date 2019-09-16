/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			6
 */

package program5;

import javafx.application.Application;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Program5 extends Application
{
	public void start(Stage primaryStage)
	{
		// Create border pane for slider and circle
		BorderPane pane = new BorderPane();

		// Create circle with random color with radius 10
		Circle circ = new Circle(10, Color.color(Math.random(), Math.random(), Math.random()));

		// Create StackPane to hold circ
		StackPane circPane = new StackPane();
		circPane.getChildren().add(circ);

		// Create size slider (radius 10-200)
		Slider size = new Slider(10, 200, 10);
		size.setShowTickLabels(true);
		size.setShowTickMarks(true);

		// Bind slider value to circ radius
		circ.radiusProperty().bind(size.valueProperty());

		// Add circ and slider to border pane
		pane.setCenter(circPane);
		pane.setBottom(size);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Program5");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}