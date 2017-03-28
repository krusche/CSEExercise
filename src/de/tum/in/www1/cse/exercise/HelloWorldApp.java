package de.tum.in.www1.cse.exercise;

import java.util.Date;

import de.tum.in.www1.cse.exercise.model.Trip;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloWorldApp extends Application {
	
	private String alertTitle = "CSE Exercise 2017";
		
	public String getAlertTitle() {
		return alertTitle;
	}

	public void setAlertTitle(String alertTitle) {
		this.alertTitle = alertTitle;
	}

	@Override
    public void start(Stage primaryStage) {
		
		final StackPane stackPane = new StackPane();
		final Scene scene = new Scene(stackPane, 300, 250);
		
		final Trip trip = new Trip(new Date(), "Munich");
        final Text text = new Text();
		text.setText("Have fun on your trip to " + trip.getDestination() + "!");
        
        stackPane.getChildren().add(text);

        primaryStage.setTitle(getAlertTitle());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

	public static void main(String[] args) {
        launch(args);
    }
}
