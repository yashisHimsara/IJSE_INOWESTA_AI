package lk.zyntech.calmmind.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageFinalFormController {
    public AnchorPane backgroundPane;

    public void btnLoginPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) backgroundPane.getScene().getWindow();
        stage.close();
        Stage stage1 = new Stage();
        stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login_form.fxml"))));
        stage1.show();
    }
}
