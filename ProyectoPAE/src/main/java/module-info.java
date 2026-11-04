module com.tuempresa.proyectopae {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tuempresa.proyectopae to javafx.fxml;
    exports com.tuempresa.proyectopae;
}