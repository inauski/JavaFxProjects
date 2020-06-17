package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	private Label lblStatus;
	
	@FXML
	private TextField txtUsername;
	
	@FXML
	private TextField txtPassword;
	
		
	public void Login(ActionEvent event) throws Exception {
		if(txtUsername.getText().equals("user") && txtPassword.getText().equals("pass")) {
			
			lblStatus.setVisible(true);
			lblStatus.setText("Login success");
			
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show(); //mostrar ventana main
			
			((Node)(event.getSource())).getScene().getWindow().hide();//ocultar ventana login

			
			
			
		
		}else {
			lblStatus.setVisible(true);
			lblStatus.setText("Login failed");
		}
	}
	


}
