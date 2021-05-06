package com.arash;

import com.arash.controllers.SimpleFormController;
import javafx.application.Application;
import javafx.stage.Stage;

public class UiLauncher extends Application {

    @Override
    public void start(Stage primaryStage) {
        new SimpleFormController().show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
