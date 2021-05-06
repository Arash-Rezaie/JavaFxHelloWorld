package com.arash.controllers;

import com.arash.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public abstract class BaseWindow {
    protected Stage stage;
    protected Scene scene;

    private static Stage createStage() {
        Stage stage = new Stage();
        return stage;
    }

    public BaseWindow() {
        stage = createStage();
        stage.setOnShowing(event -> {
            try {
                onCreate();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        stage.setOnShown(event -> onViewCreated());
    }

    public void onCreate() throws IOException {

    }

    public void setView(Parent root) {
        scene = new Scene(root);
        getStage().setScene(scene);
    }

    public void setView(String fxml) throws IOException {
        setView(inflateLayout(fxml, this));
    }

    public static Parent inflateLayout(String fxml, Object controller) throws IOException {
        URL url = Main.class.getResource(fxml);
        return FXMLLoader.load(url, null, null, param -> controller);
    }

    public void show() {
        stage.show();
    }

    public void dismiss() {
        stage.close();
    }

    public Stage getStage() {
        return stage;
    }

    public Scene getScene() {
        return scene;
    }

    @FXML
    public void initialize() {
        onBeforeCreateView();
    }

    public void onBeforeCreateView() {
    }

    public void onViewCreated() {
    }
}
