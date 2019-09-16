/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			4
 */

package program1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Program1 extends Application
{

	public void start(Stage primaryStage)
	{
		// Set pane for ball
		Pane pane = new Pane();

		// HBox for buttons
		HBox buttons = new HBox();
		buttons.setSpacing(10);
		buttons.setAlignment(Pos.BOTTOM_CENTER);

		// Create circle (ball) and add to pane
		Circle ball = new Circle(200, 100, 20);
		ball.setFill(Color.TRANSPARENT);
		ball.setStroke(Color.BLACK);
		pane.getChildren().add(ball);

		// Create buttons and add to HBox
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		buttons.getChildren().add(btLeft);
		buttons.getChildren().add(btRight);
		buttons.getChildren().add(btUp);
		buttons.getChildren().add(btDown);

		// BorderPane for scene
		BorderPane bPane = new BorderPane();
		bPane.setBottom(buttons);
		bPane.setCenter(pane);

		// Event handler for buttons
		btLeft.setOnAction(e ->
		{
			if (ball.getCenterX() - ball.getRadius() > 0)
				ball.setCenterX(ball.getCenterX() - ball.getRadius());
		});

		btRight.setOnAction(e ->
		{
			if (ball.getCenterX() + ball.getRadius() < pane.getWidth())
				ball.setCenterX(ball.getCenterX() + ball.getRadius());
		});

		btUp.setOnAction(e ->
		{
			if (ball.getCenterY() - ball.getRadius() > 0)
				ball.setCenterY(ball.getCenterY() - ball.getRadius());
		});

		btDown.setOnAction(e ->
		{
			if (ball.getCenterY() + ball.getRadius() < pane.getHeight())
				ball.setCenterY(ball.getCenterY() + ball.getRadius());
		});

		// Create scene and set stage
		Scene scene = new Scene(bPane, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Program 1");
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		System.out.println(javafx.scene.text.Font.getFamilies());
		launch(args);
	}
}