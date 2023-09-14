package lk.zyntech.calmmind.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.zyntech.calmmind.entity.Employee;
import lk.zyntech.calmmind.model.EmployeeModel;

import java.io.IOException;
import java.sql.SQLException;

public class CreateFormController {
    public AnchorPane createAccountPage;
    public TextField txtName;
    public TextField txtPassword;
    public TextField txtConfirmPassword;
    public TextField txtEmployeeId;
    public JFXButton btnCreateAccount;


    public void initialize(){
        setDisable(true);
    }

    public void btnCreateOnAction(ActionEvent actionEvent) {
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) createAccountPage.getScene().getWindow();
        createAccountPage.getChildren().clear();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login_form.fxml"))));
    }

    public void txtEmployeeIdOnKeyReleased(KeyEvent keyEvent) {
        try {
            Employee employee = EmployeeModel.searchEmployee(txtEmployeeId.getText());
            if(employee==null){
                setDisable(true);
            }else {
                setDisable(false);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setDisable(boolean b){
        txtName.setDisable(b);
        txtPassword.setDisable(b);
        txtConfirmPassword.setDisable(b);
        btnCreateAccount.setDisable(b);
    }

    public void btnCreateAccountOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) createAccountPage.getScene().getWindow();
        stage.close();
        Stage stage1 = new Stage();
        stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/signupquestion1.fxml"))));
        stage1.show();
    }
}
