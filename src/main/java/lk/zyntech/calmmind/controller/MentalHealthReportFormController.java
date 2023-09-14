package lk.zyntech.calmmind.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MentalHealthReportFormController {
    public AnchorPane backgroundPane;

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) backgroundPane.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/reports.fxml"))));
    }
}
