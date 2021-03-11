package com.arash.controllers;

import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController extends FormController {

    @Override
    public void show(Stage stage) throws IOException {
        /*
         * ! do not forget the starting '/' of resource path
         * if resource directory doesn't recognized or you wish another path then define it in build.gradle
         * */
        loadFromFxml(stage, "/views/main-form.fxml");
        stage.show();
    }
}
