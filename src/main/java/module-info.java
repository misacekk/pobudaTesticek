module com.example.pobudatesticek {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pobudatesticek to javafx.fxml;
    exports com.example.pobudatesticek;
}