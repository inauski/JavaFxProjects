package application;

import java.net.URL;
import java.util.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MainController implements Initializable {

	@FXML
	public ComboBox<String> cmbSelectName;
	
	@FXML
	public Label lblName;
	
	@FXML
	public ListView<String> listView;
	
	ObservableList<String> list = FXCollections.observableArrayList("Mark", "Tom" , "Mike", "Jack");
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//cmbSelectName.setItems(list);
		
		listView.setItems(list);
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);//seleccion multiple en el listview
		
	}

	public void comboChanged(ActionEvent event) {
		cmbSelectName.getItems().addAll("Ram","Ben"); 
		//lblName.setText(cmbSelectName.getValue());
	}
	
	
	public void buttonAction(ActionEvent event) {
		//cmbSelectName.getItems().addAll("Ram","Ben"); 
		//lblName.setText(cmbSelectName.getValue());
		
		//listView.getItems().addAll("Inaki","Donald");
		
		//Print selected listView names in console
		ObservableList<String> names;
		names = listView.getSelectionModel().getSelectedItems();
		for(String name: names) {
			System.out.println(name);
		}
	}
}
