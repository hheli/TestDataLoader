module testdataloader {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires org.apache.logging.log4j;
    requires org.apache.logging.log4j.core;
    
    opens ru.hheli to javafx.fxml;
    exports ru.hheli;
}
