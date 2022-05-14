package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import database.car;

public class ControllerUpdate {

    @FXML
    private TextField id;

    @FXML
    private TextField name;

    @FXML
    private TextField price;

    @FXML
    private Button ok_btn;

    @FXML
    void updateStage(ActionEvent event) {
        String idString = id.getText();
        String nameString = name.getText();
        String priceString = price.getText();
        car.updateCar(idString, nameString, priceString);
        Stage stage = (Stage) ok_btn.getScene().getWindow();
        Controller.refresh();
        stage.close();
    }

}