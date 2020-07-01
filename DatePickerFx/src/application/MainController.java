package application;

import java.time.LocalDate;

import com.sun.org.apache.bcel.internal.generic.LALOAD;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private DatePicker dp;
	
	@FXML
	private Label lblShowDate;
	
	public void showDate(ActionEvent event) {
		LocalDate ld = dp.getValue();
		lblShowDate.setText("Fecha elegida: " + ld.toString());
	}
}
