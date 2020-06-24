package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable{

	@FXML
	TreeView <String> treeView;
	
	Image icon = new Image(
			getClass().getResourceAsStream("/img/carpeta.png"));
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TreeItem<String> root = new TreeItem<>("Root",new ImageView(icon));
		root.setExpanded(true);
		
		
		TreeItem<String> nodeA = new TreeItem<>("node A",new ImageView(icon));
		TreeItem<String> nodeB = new TreeItem<>("node B",new ImageView(icon));
		TreeItem<String> nodeC = new TreeItem<>("node C",new ImageView(icon));
		/*root.getChildren().add(nodeA);
		root.getChildren().add(nodeB);
		root.getChildren().add(nodeC);*/
		root.getChildren().addAll(nodeA,nodeB,nodeC);
		
		
		
		TreeItem<String> nodeA1 = new TreeItem<>("node A_1",new ImageView(icon));
		TreeItem<String> nodeB1 = new TreeItem<>("node B_1",new ImageView(icon));
		TreeItem<String> nodeC1 = new TreeItem<>("node C_1",new ImageView(icon));
		nodeA.getChildren().addAll(nodeA1,nodeB1,nodeC1);
		//nodeA.setExpanded(true);
		
		treeView.setRoot(root); 
		
	}
	
	public void mouseClick(MouseEvent event) {
		if(event.getClickCount() == 2) {
			TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
			System.out.println(item.getValue());//Print Selected item name
		}
		
	}

}
