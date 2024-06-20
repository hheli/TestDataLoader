package ru.hheli;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.lang.System.Logger;


public class MainApp extends Application {

    protected static final Logger logger = System.getLogger(MainApp.class.getName());

    @Override
    public void start(Stage stage) throws Exception {
        logger.log(Logger.Level.INFO, "check point {0}", "1");
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("scene.fxml"));
        Parent root=loader.load();
       // Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
        

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        
        stage.setTitle("JavaFX and Gradle");
        stage.setScene(scene);
        FXMLController controller=loader.getController();
        controller.setPrimaryStage(stage);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void init() throws Exception {
        logger.log(Logger.Level.INFO, "init() method runs in thread: "+ Thread.currentThread().getName());
        System.out.println("getRaw(): "+ this.getParameters().getRaw());
        System.out.println("getNamed(): "+ this.getParameters().getNamed().keySet());
        System.out.println("getUnnamed(): "+ this.getParameters().getUnnamed());

    }
    @Override
    public void stop() throws Exception {
        System.out.println("stop method "+ Thread.currentThread().getName());
    }

}
