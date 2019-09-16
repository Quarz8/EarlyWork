/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			4
 */

package program4;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;

public class Program4 extends Application
{

	public void start(Stage primaryStage)
	{
		// Create for pane circle
		Pane pane = new Pane();

		// Create filled circle
		Circle circle = new Circle(250, 200, 10);

		// Create Move Left and Move Right buttons
		Button btLeft = new Button("Move Left");
		Button btRight = new Button("Move Right");

		// HBox for buttons
		HBox hbox = new HBox();
		hbox.setSpacing(10);
		hbox.getChildren().add(btLeft);
		hbox.getChildren().add(btRight);

		// Direction event handlers
		btLeft.setOnAction(e ->
		{
			circle.setCenterX(circle.getCenterX() - circle.getRadius());
		});

		btRight.setOnAction(e ->
		{
			circle.setCenterX(circle.getCenterX() + circle.getRadius());
		});

		pane.setOnKeyPressed(e ->
		{
			if (e.getCode() == KeyCode.UP)
				circle.setCenterY(circle.getCenterY() - circle.getRadius());
			else if (e.getCode() == KeyCode.DOWN)
				circle.setCenterY(circle.getCenterY() + circle.getRadius());
		});

		// Add nodes to pane
		pane.getChildren().add(circle);
		pane.getChildren().add(hbox);

		// Create scene and set stage
		Scene scene = new Scene(pane, 500, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Program 4");
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}