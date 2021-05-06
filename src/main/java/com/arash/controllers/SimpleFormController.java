package com.arash.controllers;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;

import java.io.IOException;

public class SimpleFormController extends BaseWindow {
    @FXML
    private Label lbl;

    @Override
    public void onCreate() throws IOException {
        super.onCreate();

        //determine root view
        Parent rootView = inflateLayout("/views/main-form.fxml", this);
        setView(rootView); // create or modify the root view

        //or

//        setView("/views/main-form.fxml"); // you can pass a fxml too
    }

    @Override
    public void onBeforeCreateView() {
        super.onBeforeCreateView();
        // fxml binding is not initialized yet
    }

    @Override
    public void onViewCreated() {
        super.onViewCreated();
        lbl.setText("This text applied in code");
    }

    @FXML
    public void handleButtonClick() {
        lbl.setText("Somebody changed me!");
    }
}