package lk.zyntech.calmmind.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class LoginFormController {

    public TextField user_name;
    public PasswordField password;
    @FXML
    private AnchorPane rootNode;

    @FXML
    void btnSignupOnAction(ActionEvent event) throws IOException {

        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) this.rootNode.getScene().getWindow();

        stage.setTitle("Item Form");
        stage.setScene(scene);

    }

    public void signUpOnAction(ActionEvent actionEvent) throws IOException {
        rootNode.getChildren().clear();
        Stage stage = (Stage) rootNode.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/create_form.fxml"))));

    }

    public void loginOnAction(ActionEvent actionEvent)  {
        try {
            geoToDashboard();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void passwordOnAction(ActionEvent actionEvent) {
        try {
            geoToDashboard();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void geoToDashboard() throws IOException {
        String user = user_name.getText();
        String passwordText = password.getText();
        if (passwordText.equals("123")) {
                rootNode.getScene().getWindow().hide();
                Stage stage = new Stage();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"))));
                /*stage.centerOnScreen();*/
                stage.show();
                stage.setFullScreen(true);
        } else {
            password.setStyle("-fx-border-color: red; -fx-border-radius: 10px;-fx-background-radius: 10px");
        }
    }
}
