module com.example.guiprogramming02 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;


    opens com.example.guiprogramming02 to javafx.fxml;
    exports com.example.guiprogramming02;
}