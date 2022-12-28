module com.example.javaestudio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaestudio to javafx.fxml;
    exports com.example.javaestudio;
}