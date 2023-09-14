package lk.zyntech.calmmind.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class ConsulterFormController {
    public Button btnNormal;

    public void btnSpecialistOnAction(ActionEvent actionEvent) {
        setWindow("contactingSpecialist");
    }

    public void btnNormalOnAction(ActionEvent actionEvent) {

    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        setWindow("dashboard");
    }

    public void setWindow(String url){
        Stage window =(Stage) btnNormal.getScene().getWindow();
        try {
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/"+url+".fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
