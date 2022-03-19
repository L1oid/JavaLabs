package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
 
 public class Controller {
	 @FXML
	 private CheckBox News_CB;

	 @FXML
	 private Label News_Widget;

	 @FXML
	 private CheckBox Time_CB;

	 @FXML
	 private Label Time_Widget;

	 @FXML
	 private CheckBox Weather_CB;

	 @FXML
	 private Label Weather_Widget;

	 @FXML
	 void click(ActionEvent event) {
		 if (News_CB.isSelected()) {
			 News_Widget.setVisible(true);
		 }
		 else News_Widget.setVisible(false);

		 if (Time_CB.isSelected()) {
			 Time_Widget.setVisible(true);
		 }
		 else Time_Widget.setVisible(false);

		 if (Weather_CB.isSelected()) {
			 Weather_Widget.setVisible(true);
		 }
		 else Weather_Widget.setVisible(false);
	 }
}