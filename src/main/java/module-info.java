module org.example.uiprojectpp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.uiprojectpp to javafx.fxml;
    exports org.example.uiprojectpp;
}