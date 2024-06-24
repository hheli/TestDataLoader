module ru.hheli.tdl {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    
    opens ru.hheli.tdl to javafx.fxml;
    exports ru.hheli.tdl;
}
