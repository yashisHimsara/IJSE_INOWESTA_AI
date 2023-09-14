package lk.zyntech.calmmind.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class OverallRatingsFormController {
    public AnchorPane howwasmealPane;

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) howwasmealPane.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"))));
    }
}
