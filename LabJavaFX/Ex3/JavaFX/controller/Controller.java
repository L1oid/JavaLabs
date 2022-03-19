package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.AnchorPane;
 
 public class Controller {
	 @FXML
	 private Label borsch_amount;
	 private int borsch_amount_int;

	 @FXML
	 private CheckBox borsch_cb;

	 @FXML
	 private Label borsch_price;
	 private int borsch_price_int;

	 @FXML
	 private TextField borsch_tf;

	 @FXML
	 private Button btn_order;

	 @FXML
	 private Label compote_amount;
	 private int compote_amount_int;

	 @FXML
	 private CheckBox compote_cb;

	 @FXML
	 private Label compote_price;
	 private int compote_price_int;

	 @FXML
	 private TextField compote_tf;

	 @FXML
	 private Label cutlet_amount;
	 private int cutlet_amount_int;

	 @FXML
	 private CheckBox cutlet_cb;

	 @FXML
	 private Label cutlet_price;
	 private int cutlet_price_int;

	 @FXML
	 private TextField cutlet_tf;

	 @FXML
	 private Label salad_amount;
	 private int salad_amount_int;

	 @FXML
	 private CheckBox salad_cb;

	 @FXML
	 private Label salad_price;
	 private int salad_price_int;

	 @FXML
	 private TextField salad_tf;

	 @FXML
	 private AnchorPane check_pane;

	 @FXML
	 private Label order_check_list;

	 @FXML
	 private Label order_check_sum;

	 private int sum_salade;
	 private int sum_borsch;
	 private int sum_cutlet;
	 private int sum_compote;

	 public Controller() {
		 salad_amount_int = 18;
		 borsch_amount_int = 17;
		 cutlet_amount_int = 25;
		 compote_amount_int = 20;
		 salad_price_int = 120;
		 borsch_price_int = 80;
		 cutlet_price_int = 70;
		 compote_price_int = 40;
		 sum_salade = 0;
		 sum_borsch = 0;
		 sum_cutlet = 0;
		 sum_compote = 0;
	 }

	 @FXML
	 void click_salad_cb(ActionEvent event) {
		 String temp_s = salad_tf.getText();
		 if (salad_cb.isSelected() && (temp_s == "")) {
			 salad_tf.setText("1");
		 }
	 }

	 @FXML
	 void click_salad_tf(ActionEvent event) {
		 int temp = Integer.parseInt(salad_tf.getText());
		 if(temp > salad_amount_int) {
			 salad_tf.setText(Integer.toString(salad_amount_int));
		 }
	 }

	 @FXML
	 void click_borsch_cb(ActionEvent event) {
		 String temp_s = borsch_tf.getText();
		 if (borsch_cb.isSelected() && (temp_s == "")) {
			 borsch_tf.setText("1");
		 }
	 }

	 @FXML
	 void click_borsch_tf(ActionEvent event) {
		 int temp = Integer.parseInt(borsch_tf.getText());
		 if(temp > borsch_amount_int) {
			 borsch_tf.setText(Integer.toString(borsch_amount_int));
		 }
	 }

	 @FXML
	 void click_cutlet_cb(ActionEvent event) {
		 String temp_s = cutlet_tf.getText();
		 if (cutlet_cb.isSelected() && (temp_s == "")) {
			 cutlet_tf.setText("1");
		 }
	 }

	 @FXML
	 void click_cutlet_tf(ActionEvent event) {
		 int temp = Integer.parseInt(cutlet_tf.getText());
		 if(temp > cutlet_amount_int) {
			 cutlet_tf.setText(Integer.toString(cutlet_amount_int));
		 }
	 }

	 @FXML
	 void click_compote_cb(ActionEvent event) {
		 String temp_s = compote_tf.getText();
		 if (compote_cb.isSelected() && (temp_s == "")) {
			 compote_tf.setText("1");
		 }
	 }

	 @FXML
	 void click_compote_tf(ActionEvent event) {
		 int temp = Integer.parseInt(compote_tf.getText());
		 if(temp > compote_amount_int) {
			 compote_tf.setText(Integer.toString(compote_amount_int));
		 }
	 }

	 @FXML
	 void click_order(ActionEvent event) {
		 check_pane.setVisible(true);
		 if (salad_cb.isSelected()) {
			 String temp = order_check_list.getText();
			 sum_salade = salad_price_int * Integer.parseInt(salad_tf.getText());
			 order_check_list.setText("Salad--Amount: " + salad_tf.getText() + "--Sum: " + Integer.toString(sum_salade) + "--Rub");
		 }
		 if (borsch_cb.isSelected()) {
			 String temp = order_check_list.getText();
			 sum_borsch = borsch_price_int * Integer.parseInt(borsch_tf.getText());
			 order_check_list.setText(temp + "\n" + "Borsch--Amount: " + borsch_tf.getText() + "--Sum: " + Integer.toString(sum_borsch) + "--Rub");
		 }
		 if (cutlet_cb.isSelected()) {
			 String temp = order_check_list.getText();
			 sum_cutlet = cutlet_price_int * Integer.parseInt(cutlet_tf.getText());
			 order_check_list.setText(temp + "\n" + "Cutlet--Amount: " + cutlet_tf.getText() + "--Sum: " + Integer.toString(sum_cutlet) + "--Rub");
		 }
		 if (compote_cb.isSelected()) {
			 String temp = order_check_list.getText();
			 sum_compote = compote_price_int * Integer.parseInt(compote_tf.getText());
			 order_check_list.setText(temp + "\n" + "Compote--Amount: " + compote_tf.getText() + "--Sum: " + Integer.toString(sum_compote) + "--Rub");
		 }
		 order_check_sum.setText("Sum: " + Integer.toString(sum_salade + sum_borsch + sum_cutlet + sum_compote) + " Rub");
	 }
}