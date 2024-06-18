package ru.hheli;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FXMLController {

    @FXML
    private Label label;

    public void initialize() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
    }

    @FXML
    private Button button1;

    private int n=0;

    private Stage primaryStage;
    @FXML
    protected void onClick(ActionEvent event){

        System.out.println(primaryStage.getTitle());
        n++;
        if(n>3) Platform.exit();
        Scene scene=primaryStage.getScene();
        System.out.println(scene.getX() +" "+ scene.getY());
        button1.setText("pressed at"+primaryStage.getX());

    }
    public void setPrimaryStage(Stage primaryStage){
        this.primaryStage=primaryStage;
    }
}
