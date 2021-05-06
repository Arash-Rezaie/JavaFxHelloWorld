//you can remove this file to make project non-modular
module com.arash {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.arash.controllers;
    exports com.arash;
}