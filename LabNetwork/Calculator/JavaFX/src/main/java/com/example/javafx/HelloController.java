package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import network.Network;


public class HelloController {
    String temp_s;
    Network network;

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btn_back;

    @FXML
    private Button btn_c;

    @FXML
    private Button btn_div;

    @FXML
    private Button btn_dot;

    @FXML
    private Button btn_eq;

    @FXML
    private Button btn_minus;

    @FXML
    private Button btn_mult;

    @FXML
    private Button btn_plus;

    @FXML
    private Button btn_left_bracket;

    @FXML
    private Button btn_right_bracket;

    @FXML
    private Label window_output;

    public HelloController() {
        network = new Network();
    }

    @FXML
    void act0(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn0.getText());
    }

    @FXML
    void act1(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn1.getText());
    }

    @FXML
    void act2(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn2.getText());
    }

    @FXML
    void act3(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn3.getText());
    }

    @FXML
    void act4(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn4.getText());
    }

    @FXML
    void act5(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn5.getText());
    }

    @FXML
    void act6(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn6.getText());
    }

    @FXML
    void act7(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn7.getText());
    }

    @FXML
    void act8(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn8.getText());
    }

    @FXML
    void act9(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn9.getText());
    }

    @FXML
    void act_right_bracket(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn_right_bracket.getText());
    }

    @FXML
    void act_left_bracket(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn_left_bracket.getText());
    }

    @FXML
    void act_c(ActionEvent event) {
        window_output.setText("");
    }

    @FXML
    void act_div(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn_div.getText());
    }

    @FXML
    void act_dot(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn_dot.getText());
    }

    @FXML
    void act_minus(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn_minus.getText());
    }

    @FXML
    void act_mult(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn_mult.getText());
    }

    @FXML
    void act_plus(ActionEvent event) {
        temp_s = window_output.getText();
        window_output.setText(temp_s + btn_plus.getText());
    }

    @FXML
    void act_eq(ActionEvent event) {
        temp_s = window_output.getText();
        network.send(temp_s);
        window_output.setText(network.get());
    }
}