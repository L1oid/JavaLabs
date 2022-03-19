package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
 
 public class Controller {
	 int check;

	 @FXML
	 private Button btn;

	 @FXML
	 private TextField textF_1;

	 @FXML
	 private TextField textF_2;

	 public Controller() {
		 check = 0;
	 }

	 @FXML
	 void click(ActionEvent event) {
		 if (check == 0) {
			 btn.setText("<-");
			 textF_2.setText(textF_1.getText());
			 textF_1.clear();
			 check = 1;
		 }
		 else if (check == 1) {
			 btn.setText("->");
			 textF_1.setText(textF_2.getText());
			 textF_2.clear();
			 check = 0;
		 }
	 }
}