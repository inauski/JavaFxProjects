package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class MainController {

	@FXML
	private RadioButton rbMale;
	
	@FXML
	private RadioButton rbFemale;
	
	@FXML
	private Label lblOption;
	
	public void radioSelect(ActionEvent event) {
		
		String message = "";
		
		if(rbMale.isSelected()) {
			message += rbMale.getText() + "\n"; 
		}
		
		if(rbFemale.isSelected()) {
			message += rbFemale.getText() + "\n"; 
		}
		
		lblOption.setText(message);
	}
}
