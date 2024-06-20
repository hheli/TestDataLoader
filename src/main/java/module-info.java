module testdataloader {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    
    opens ru.hheli to javafx.fxml;
    exports ru.hheli;
}
