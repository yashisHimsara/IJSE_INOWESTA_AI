package lk.zyntech.calmmind.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ContactingSpecialistFormController {
    public Button btnCancel;

    public void btnCancelOnAction(ActionEvent actionEvent) throws IOException {
        ((Stage)btnCancel.getScene().getWindow()).setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/consulter.fxml"))));
    }
}
