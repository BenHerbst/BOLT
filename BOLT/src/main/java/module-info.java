module com.example.bolt {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.bolt to javafx.fxml;
    exports com.example.bolt;
}