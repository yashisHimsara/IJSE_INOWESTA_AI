package lk.zyntech.calmmind.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ReportsFormController {
    public Button btnnotificationBack;

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) btnnotificationBack.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"))));
    }

    public void ancEvaluationOnPressed(MouseEvent mouseEvent) {
    }

    public void ancHealthOnMousePressed(MouseEvent mouseEvent) throws IOException {
        Stage window =(Stage) btnnotificationBack.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/healthreports.fxml"))));
    }

    public void ancMentalHealthOnMousePressed(MouseEvent mouseEvent) throws IOException {
        Stage window =(Stage) btnnotificationBack.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/mentalhealthreport.fxml"))));
    }
}
