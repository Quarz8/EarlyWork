/*
 * Class:		CS 1302/02
 * Term:		Spring 2018
 * Name:		Warren Davis
 * Instructor:	Tejaswini Nalamothu
 * Lab:			4
 */

package program5;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.*;

public class Exercise14_1 extends Application
{
public void start(Stage primaryStage)
{
	//Create grid pane to hold images
	GridPane pane=new GridPane();
	pane.setAlignment(Pos.CENTER);
	pane.setHgap(5.5);
	pane.setVgap(5.5);
	
	// Get 4 images
	Image image1=new Image("image/flag5.gif");
	Image image2=new Image("image/flag6.gif");
	Image image3=new Image("image/flag1.gif");
	Image image4=new Image("image/flag2.gif");
	
	// Add 4 images to pane
	pane.add(new ImageView(image1),0,0);
	pane.add(new ImageView(image2),0,1);
	pane.add(new ImageView(image3),1,0);
	pane.add(new ImageView(image4),1,1);
	
	// Set scene and show stage
	Scene scene=new Scene(pane,1000,500);
	primaryStage.setTitle("Exercise 14_01");
    primaryStage.setScene(scene);
    primaryStage.show();
}

	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
