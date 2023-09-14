package lk.zyntech.calmmind.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.MagicBooleans;

import java.awt.*;
import java.io.IOException;

import static lk.zyntech.calmmind.service.Chatbot.*;

public class ChatAiFormController {

    public TextField txtChat;
    public VBox vBox;
    public ScrollPane paneChat;
    @FXML
    private AnchorPane backgroundPane;

    @FXML
    private Button btnBackai;

    @FXML
    private AnchorPane chataiPane;

    @FXML
    private AnchorPane newchatPane;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private AnchorPane sendPane;

    @FXML
    private AnchorPane userchatPane;

    @FXML
    private AnchorPane userpanalePane;

    /*public TextArea chatHistory;*/
    private Chat chatSession;

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage= (Stage) userpanalePane.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"))));
    }
    public void initialize(){
        vBox.getChildren().clear();
        MagicBooleans.trace_mode = TRACE_MODE;
        String resourcesPath = getResourcesPath();
        Bot bot = new Bot(botName, resourcesPath);
        //chatHistory.setEditable(false);
        chatSession = new Chat(bot);
    }
    private void sendMessage() {

        String userMessage = txtChat.getText();
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER_RIGHT);
        VBox vBox1 = new VBox();
        vBox1.setAlignment(Pos.CENTER_RIGHT);
        ImageView imageView = new ImageView();
        imageView.setImage(new Image("/assert/img/icons8-user-96.png"));
        imageView.setFitWidth(70);
        imageView.setFitHeight(60);
        Label label = new Label(txtChat.getText());
        label.getStyleClass().add("message-bubble-user");
        label.setPrefHeight(118);
        label.setPrefWidth(376);
        vBox1.getChildren().add(imageView);
        vBox1.getChildren().add(label);
        hBox.getChildren().add(vBox1);
        hBox.setPrefHeight(139);
        vBox.getChildren().add(hBox);
        txtChat.clear();


        String botResponse = chatSession.multisentenceRespond(userMessage);

        HBox hBox1 = new HBox();
        hBox1.setAlignment(Pos.CENTER_LEFT);
        VBox vBox11 = new VBox();
        vBox11.setAlignment(Pos.CENTER_LEFT);
        ImageView imageView1 = new ImageView();
        imageView1.setImage(new Image("/assert/img/bot-chat.png"));
        imageView1.setFitWidth(70);
        imageView1.setFitHeight(60);
        Label label1 = new Label(botResponse);
        label1.getStyleClass().add("message-bubble-bot");
        label1.setPrefHeight(118);
        label1.setPrefWidth(376);
        vBox11.getChildren().add(imageView1);
        vBox11.getChildren().add(label1);
        hBox1.getChildren().add(vBox11);
        hBox1.setPrefHeight(139);
        vBox.getChildren().add(hBox1);
        /*displayUserMessage(userMessage);
        String botResponse = chatSession.multisentenceRespond(userMessage);
        displayBotResponse(botResponse);
        txtChat.clear();*/

        paneChat.setHvalue(paneChat.getHmax());

    }
    private void displayUserMessage(String message) {
        //chatHistory.appendText("You: " + message + "\n");
    }

    private void displayBotResponse(String message) {
        //chatHistory.appendText("Serenity: " + message + "\n");
    }

    public void setOnAction(ActionEvent actionEvent) {
        sendMessage();
    }

    public void imgSendOnMouseClicked(MouseEvent mouseEvent) {
        sendMessage();
    }

    public void txtChatOnAction(ActionEvent actionEvent) {
        sendMessage();
    }
}
