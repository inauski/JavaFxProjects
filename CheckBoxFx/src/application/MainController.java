package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private CheckBox cbDog;
	
	@FXML
	private CheckBox cbCat;
	
	@FXML
	private CheckBox cbCow;
	
	@FXML
	private CheckBox cbRat;
	
	@FXML
	private Label lblList;
	
	@FXML
	private Label lblCount;
	
	public void checkEvent(ActionEvent event) {
		int count = 0;
		String message = "";
		
		if(cbDog.isSelected()) {
			count++;
			message += cbDog.getText() + "\n";
		}
		
		if(cbCat.isSelected()) {
			count++;
			message += cbCat.getText() + "\n";
		}

		
		if(cbCow.isSelected()) {
			count++;
			message += cbCow.getText() + "\n";
		}

		
		if(cbRat.isSelected()) {
			count++;
			message += cbRat.getText() + "\n";
		}
		
		lblCount.setText("Items selected: " + count);
		lblList.setText(message);
	}
}
