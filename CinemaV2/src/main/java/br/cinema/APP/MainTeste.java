package br.cinema.APP;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MainTeste extends Application{
	
	Parent root;
	double posX,posY;
	
	@Override
	public void start(final Stage primaryStage) {
		
		try {
			
			//root = FXMLLouder
			root = FXMLLoader.load(getClass().getResource("../view/ui_login.fxml"));
			Scene scene = new Scene(root);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();		
					
			root.setOnMousePressed(new EventHandler<MouseEvent>() {

				public void handle(MouseEvent event) {
					posX = event.getSceneX();
					posY = event.getSceneY();
					
				}

				
			});
			
			root.setOnMouseDragged(new EventHandler<MouseEvent>() {

				public void handle(MouseEvent event) {
					primaryStage.setX(event.getScreenX() - posX);
					primaryStage.setY(event.getScreenY() - posY);
					
				}
			});
					
					
			
			
		} catch (Exception e) {
			
			
			
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
