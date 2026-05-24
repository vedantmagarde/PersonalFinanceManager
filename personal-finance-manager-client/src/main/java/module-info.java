module personal.finance.manager.client {

    requires javafx.controls;
    requires com.google.gson;

    // required for JavaFX TableView and model access
    opens org.example.models to javafx.base;

    exports org.example;
}