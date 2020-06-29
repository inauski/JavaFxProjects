package application;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MainController  implements Initializable{

	@FXML
	private ImageView myImage;
	
	@FXML
	private ListView listView;
	
	@FXML
	private Button btn;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listView.setVisible(false);
		myImage.setVisible(false);
		
	}
	public void ImportImage(ActionEvent event) throws IOException {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("C:\\Users\\Inaki Santos\\Desktop"));
		fc.getExtensionFilters().addAll(new ExtensionFilter("JPG","*.jpg"),
										new ExtensionFilter("PNG","*.png"),
										new ExtensionFilter("PDF","*.pdf"));
		File selectedFile = fc.showOpenDialog(null);
		
		//String filename = selectedFile.getAbsolutePath();
		String filename = selectedFile.getName();
		Image img = new Image(selectedFile.toURI().toString());
		
		
		if(selectedFile != null) {
			listView.setVisible(true);
			listView.getItems().add(filename);
			
			System.out.println("Java version: " + System.getProperty("java.version"));
			System.out.println("JavaFX.version: " + System.getProperty("javafx.version"));

			
			myImage.setVisible(true);
			myImage.setImage((img));
			
		}else
			System.out.println("Error");
			
		
	}
	public void CloseApp(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}

}
