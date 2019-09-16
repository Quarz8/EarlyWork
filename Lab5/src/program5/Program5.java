/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			4
 */

package program5;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.shape.Line;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Program5 extends Application
{

	public void start(Stage primaryStage)
	{
		// Create pane for plane and path
		Pane pane = new Pane();

		// Create plane
		ImageView car = new ImageView(new Image("plane.png"));

		// Create path
		Line path = new Line(0, 0, 800, 800);
		path.setStroke(Color.TRANSPARENT);

		// Add car and track to pane
		pane.getChildren().add(car);
		pane.getChildren().add(path);

		// Create path transition animation
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setPath(path);
		pt.setNode(car);
		pt.setCycleCount(1);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);

		// Create Start and Stop buttons
		Button btStart = new Button("Start");
		Button btStop = new Button("Stop");

		// Create BorderPane for buttons and plane/path pane
		BorderPane bPane = new BorderPane();
		bPane.setCenter(pane);
		bPane.setBottom(btStart);
		BorderPane.setAlignment(btStart, Pos.CENTER);
		BorderPane.setAlignment(btStop, Pos.CENTER);

		// Create event handler for start button
		btStart.setOnAction(e ->
		{
			pt.play();
			bPane.setBottom(btStop);
		});

		// Create event handler for stop button
		btStop.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent e)
			{
				pt.stop();
				bPane.setBottom(btStart);
			}
		});

		// Create scene and set stage
		Scene scene = new Scene(bPane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Program 5");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}