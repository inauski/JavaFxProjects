package application;

import java.io.File;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MainController {
	
	@FXML
	private Button btnSelect1;
	
	@FXML
	private Button btnSelectMulti;
	
	@FXML
	private ListView listView;
	
	public void Button1Action(ActionEvent event) {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("C:\\Users\\Inaki Santos\\Desktop"));
		fc.getExtensionFilters().addAll(
				new ExtensionFilter("Only PDF","*.pdf"));
		File selectedFile = fc.showOpenDialog(null);
		
		if(selectedFile != null) {
			//listView.getItems().add(selectedFile.getName());
			listView.getItems().add(selectedFile.getAbsoluteFile());
		}else {
			System.out.println("File is not valid");
		}
	}
	
	public void Button2ActionMulti(ActionEvent event) {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("C:"));
		fc.getExtensionFilters().addAll(
				new ExtensionFilter("Only PDF","*.pdf"));
		List<File> selectedFiles = fc.showOpenMultipleDialog(null);
		
		if(selectedFiles != null) {
			//listView.getItems().add(selectedFile.getName());
			for(int i = 0; i < selectedFiles.size(); i++) {
				listView.getItems().add(selectedFiles.get(i).getAbsolutePath());
			}
		}else {
			System.out.println("File is not valid");
		}
	}
}
