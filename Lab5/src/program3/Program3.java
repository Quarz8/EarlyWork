/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			4
 */

package program3;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.geometry.*;
import javafx.scene.shape.Ellipse;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.util.Duration;

public class Program3 extends Application
{
	public void start(Stage primaryStage)
	{
		// Create pane for car and track
		Pane pane = new Pane();

		// Create car
		ImageView car = new ImageView(new Image("car.png"));

		// Create track
		Ellipse track = new Ellipse(250, 200, 200, 100);
		track.setFill(Color.TRANSPARENT);
		track.setStroke(Color.BLACK);

		// Add car and track to pane
		pane.getChildren().add(track);
		pane.getChildren().add(car);

		// Create path transition animation
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setPath(track);
		pt.setNode(car);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.play();

		// Create Stop and Resume buttons
		Button btStop = new Button("Stop");
		Button btResume = new Button("Resume");

		// Create BorderPane for buttons and car/track pane
		BorderPane bPane = new BorderPane();
		bPane.setCenter(pane);
		bPane.setBottom(btStop);
		BorderPane.setAlignment(btStop, Pos.CENTER);
		BorderPane.setAlignment(btResume, Pos.CENTER);

		// Create event handler for stop button
		btStop.setOnAction(e ->
		{
			pt.pause();
			bPane.setBottom(btResume);
		});

		// Create event handler for resume button
		btResume.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent e)
			{
				pt.play();
				bPane.setBottom(btStop);
			}
		});

		// Create scene and set stage
		Scene scene = new Scene(bPane, 500, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Program 3");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}