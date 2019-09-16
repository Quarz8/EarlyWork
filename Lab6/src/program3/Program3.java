/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			6
 */

package program3;

import javafx.application.Application;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Program3 extends Application
{
	public void start(Stage primaryStage)
	{
		// BorderPane to display elements
		BorderPane pane = new BorderPane();

		// Create label to show elapsed time
		Label lbStopwatch = new Label("00:00:00");
		lbStopwatch.setStyle("-fx-font-size: 48");

		// StackPane for label
		StackPane paneForLabel = new StackPane();
		paneForLabel.getChildren().add(lbStopwatch);

		// Event handler for stopwatch animation
		EventHandler<ActionEvent> eventHandler = e ->
		{
			if (Numbers.seconds < 59)
				Numbers.seconds++;
			else if (Numbers.minutes < 59)
			{
				Numbers.seconds = 0;
				Numbers.minutes++;
			}
			else
			{
				Numbers.seconds = 0;
				Numbers.minutes = 0;
				Numbers.hours++;
			}
			lbStopwatch.setText(String.format("%02d:%02d:%02d", Numbers.hours, Numbers.minutes, Numbers.seconds));
		};

		// Create Timeline animation
		Timeline stopwatch = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
		stopwatch.setCycleCount(Timeline.INDEFINITE);

		// Buttons for stopwatch (btStartPauseResume and btClear)
		Button btSPR = new Button("Start");
		Button btClear = new Button("Clear");

		// HBox for buttons
		HBox paneForButtons = new HBox(5);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.getChildren().addAll(btSPR, btClear);

		// Set action events for buttons
		btSPR.setOnAction(e ->
		{
			if (btSPR.getText().equals("Start") || btSPR.getText().equals("Resume"))
			{

				stopwatch.play();
				btSPR.setText("Pause");
			}
			else
			{
				stopwatch.pause();
				btSPR.setText("Resume");
			}
		});

		btClear.setOnAction(e ->
		{
			stopwatch.stop();
			Numbers.seconds = 0;
			Numbers.minutes = 0;
			Numbers.hours = 0;
			btSPR.setText("Start");
			lbStopwatch.setText("00:00:00");
		});

		// Add elements to pane
		pane.setCenter(paneForLabel);
		pane.setBottom(paneForButtons);

		// Create scene and set stage
		Scene scene = new Scene(pane, 250, 125);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise16_04");
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}