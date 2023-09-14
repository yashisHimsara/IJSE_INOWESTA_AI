package lk.zyntech.calmmind.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class DashboardController {
    public JFXButton btnCustomerRate;

    public void aiOnAction(MouseEvent mouseEvent) {

    }

    public void btnAiOnAction(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) btnCustomerRate.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/chataiform.fxml"))));
    }

    public void btnConsultantOnAction(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) btnCustomerRate.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/consulter.fxml"))));
    }

    public void btnYourReportOnActiion(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) btnCustomerRate.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/reports.fxml"))));
    }

    public void btnOverallRatingOnAction(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) btnCustomerRate.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/overallratings.fxml"))));
    }

    public void btnLogOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) btnCustomerRate.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login_form.fxml"))));
        window.centerOnScreen();
    }
}
