/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			4
 */

package program6;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.*;

public class Exercise14_2 extends Application
{
	public void start(Stage primaryStage)
	{
		// Grid pane for tic tac toe board
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		// Get X and O images
		Image x = new Image("image/x.gif");
		Image o = new Image("image/o.gif");

		// Randomly assign images to 3x3 area in pane
		for (int row = 0; row < 3; row++)
			for (int column = 0; column < 3; column++)
			{
				int rng = (int) (Math.random() * 3); // Generates an int 0-2

				switch (rng)
				{
				case 0:
					pane.add(new ImageView(x), column, row);
					break;
				case 1:
					pane.add(new ImageView(o), column, row);
					break;
				}
			}

		// Set scene and show stage
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Exercise 14_02");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
