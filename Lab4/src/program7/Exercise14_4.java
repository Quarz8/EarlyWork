/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			4
 */

package program7;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

public class Exercise14_4 extends Application
{
	public void start(Stage primaryStage)
	{
		// VBox pane for text
		VBox pane = new VBox(15);
		pane.setStyle("-fx-background-color: transparent");
		pane.setAlignment(Pos.CENTER);
		pane.setRotate(90);

		// Create text labels in specified font and size
		Label l1 = new Label("Java");
		l1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		Label l2 = new Label("Java");
		l2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		Label l3 = new Label("Java");
		l3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		Label l4 = new Label("Java");
		l4.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		Label l5 = new Label("Java");
		l5.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		
		// Set random colors and opacities to texts
		l1.setTextFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
		l2.setTextFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
		l3.setTextFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
		l4.setTextFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
		l5.setTextFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));

		// Add text labels to VBox
		pane.getChildren().add(l1);
		pane.getChildren().add(l2);
		pane.getChildren().add(l3);
		pane.getChildren().add(l4);
		pane.getChildren().add(l5);
		
		// Set scene and show stage
		Scene scene = new Scene(pane, 250, 75);
		primaryStage.setTitle("Exercise 14_04");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
