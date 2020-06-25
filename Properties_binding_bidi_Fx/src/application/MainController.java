package application;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class MainController implements Initializable {
	
	@FXML
	Slider slider;
	
	@FXML
	TextField txtField;
	
	private static final double INIT_VALUE = 50;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		slider.setValue(INIT_VALUE);
		txtField.setText(new Double(INIT_VALUE).toString());
		txtField.textProperty().bindBidirectional(slider.valueProperty(), NumberFormat.getNumberInstance() );
		
	}
	
}
