module com.tuempresa.proyectopae {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.tuempresa.proyectopae to javafx.fxml;
    exports com.tuempresa.proyectopae;
}