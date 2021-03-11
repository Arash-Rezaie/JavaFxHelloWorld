package com.arash.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public abstract class FormController {
    private static Stage primaryStage;

    public static void setPrimaryStage(Stage stage) {
        primaryStage = Objects.requireNonNull(stage);
    }

    public abstract void show(Stage stage) throws IOException;

    public void show() throws IOException {
        show(primaryStage);
    }

    protected void loadFromFxml(Stage stage, String fxmlName) throws IOException {
        //catch fxml resource
        URL url = FormController.class.getResource(fxmlName);

        //FXMLLoader.load will instantiate another one of this class, let's prevent this
        Callback<Class<?>, Object> callback = param -> FormController.this;

        Parent root = FXMLLoader.load(url, null, null, callback);
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

    @FXML
    private void initialize() {
        onLoad();
    }

    protected void onLoad() {
        //do any thing on load
    }
}
