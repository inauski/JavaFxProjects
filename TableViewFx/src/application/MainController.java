package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable {
	
	@FXML
	private TableView<Student> table;
	
	@FXML
	private TableColumn<Student, Integer> id;
	@FXML
	private TableColumn<Student, String> name;
	@FXML
	private TableColumn<Student, String> surname;
	@FXML
	private TableColumn<Student, Integer> age;
	
	public ObservableList<Student> list = FXCollections.observableArrayList(
			new Student(1, "Mike", "Wasousky", 22),
			new Student(2, "Tom", "Nook", 45),
			new Student(3, "Iker", "Surname3", 27),
			new Student(4, "Ben", "Surname4", 26),
			new Student(5, "Leo", "Surname5", 24),
			new Student(6, "Jack", "Surname6", 23)
			);
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		id.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
		surname.setCellValueFactory(new PropertyValueFactory<Student, String>("surname"));
		age.setCellValueFactory(new PropertyValueFactory<Student, Integer>("age"));
		
		table.setItems(list);
		
	}

}
