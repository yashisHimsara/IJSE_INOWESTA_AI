package lk.zyntech.calmmind.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HealthReportsFormController {
    public AnchorPane tempraturePane;

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) tempraturePane.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/reports.fxml"))));
    }
}
