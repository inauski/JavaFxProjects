package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class MainController {
	
	@FXML
	private Label myMessage;//@FXML une esta clase con el main.fxml
	
	public void generateRandom(ActionEvent event) {
		Random rand = new Random();
		int myRand = rand.nextInt(50) + 1 ;
		myMessage.setText(Integer.toString(myRand));//muestra un numero random (entre 1 y 50) en la etiqueta que tenga como id 'myMessage' sino no funcionara
		//System.out.println(Integer.toString(myRand));
	}
}
