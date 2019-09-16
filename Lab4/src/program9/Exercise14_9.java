/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			4
 */

package program9;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;

// The, "Use gridPane even though arc shapes don't function with gridPane alignment, so it's actually
// more hassle than it should be! Good thing we don't test any of the code in this book, or we might have 
// been really frustrated and hate CS HAHAHAHAHAHAHA!!!!"
public class Exercise14_9 extends Application
{

	private static final int RADIUS = 100;
	private static final int GAP = 10;

	public void start(Stage primaryStage) throws Exception
	{

		Pane pane = new Pane();
		int x = RADIUS + GAP;
		int y = RADIUS + GAP;

		for (int i = 0; i < 2; i++)
		{

			// drawing a 2 Circles in each row
			for (int j = 0; j < 2; j++)
			{
				// create circle
				Circle c = new Circle(RADIUS);
				c.setCenterX(x);
				c.setCenterY(y);
				c.setStroke(Color.BLACK);
				c.setFill(Color.WHITE);
				pane.getChildren().add(c);

				// create 4 arcs in each circle with 90 degree increment
				for (int k = 30; k < 360; k += 90)
				{
					Arc arc = new Arc(x, y, RADIUS - 15, RADIUS - 15, k, 30);
					arc.setFill(Color.BLACK);
					arc.setType(ArcType.ROUND);
					pane.getChildren().add(arc);
				}

				x += RADIUS * 2 + GAP;
			}
			// reset center for the next row
			x = RADIUS + GAP;
			y += RADIUS * 2 + GAP;
		}

		Scene scene = new Scene(pane, 425, 425);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise 14_09");
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}