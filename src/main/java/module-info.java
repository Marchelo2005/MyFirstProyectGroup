module com.example.miprimerproyecto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.miprimerproyecto to javafx.fxml;
    exports com.example.miprimerproyecto;
}