package lk.zyntech.calmmind.service;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.alicebot.ab.*;
import org.alicebot.ab.utils.IOUtils;

import java.io.File;

public class Chatbot  {

    public static final boolean TRACE_MODE = false;
    public static String botName = "super";
    static Chat chatSession;

    private static Bot bot ;
    public Chatbot() {
        String resourcesPath = getResourcesPath();
        System.out.println(resourcesPath);
        MagicBooleans.trace_mode = TRACE_MODE;
        bot=new Bot("super", resourcesPath);
        chatSession = new Chat(bot);
        bot.brain.nodeStats();
        ;
    }

    public static void main(String[] args) {


    }

    public static void loadResource(){

    }


    public static String chat(String textLine){
        try {
            while (true) {
                System.out.print("You : ");
                if ((textLine == null) || (textLine.length() < 1))
                    textLine = MagicStrings.null_input;
                if (textLine.equals("q")) {
                    System.exit(0);
                } else if (textLine.equals("wq")) {
                    bot.writeQuit();
                    System.exit(0);
                } else {
                    String request = textLine;
                    if (MagicBooleans.trace_mode)
                        System.out.println(
                                "STATE=" + request + ":THAT=" + ((History) chatSession.thatHistory.get(0)).get(0)
                                        + ":TOPIC=" + chatSession.predicates.get("topic"));
                    String response = chatSession.multisentenceRespond(request);
                    while (response.contains("&lt;"))
                        response = response.replace("&lt;", "<");
                    while (response.contains("&gt;"))
                        response = response.replace("&gt;", ">");
                    return "Serenity : " + response;

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Error";
    }


    public static String getResourcesPath() {
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        path = path.substring(0, path.length() - 2);
        System.out.println(path);
        String resourcesPath = path + File.separator + "src" + File.separator + "main" + File.separator + "resources";
        return resourcesPath;
    }


}