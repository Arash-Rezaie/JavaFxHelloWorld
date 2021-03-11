package com.arash;

import com.arash.controllers.FormController;
import com.arash.controllers.MainFormController;
import javafx.application.Application;
import javafx.stage.Stage;

public class UiLauncher extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //do not forget to call this method at first
        FormController.setPrimaryStage(primaryStage);

        MainFormController mfc = new MainFormController();
        mfc.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
