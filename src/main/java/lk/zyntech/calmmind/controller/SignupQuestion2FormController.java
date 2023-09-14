package lk.zyntech.calmmind.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SignupQuestion2FormController {
    public Button btnNext;

    public void btnNextOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) btnNext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/signupquestion3.fxml"))));
    }
}
