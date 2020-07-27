package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root);
			//Scene scene = new Scene(root,400,400);//si ponemos 400, 400 no se abre correctamente la ventana, su tamaño original es 800,600 (prefWidth,prefHeight)
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//System.out.println("Height " + scene.getHeight() + " \nWidth: " + scene.getWidth());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
