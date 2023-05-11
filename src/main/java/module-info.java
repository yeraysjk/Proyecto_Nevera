module yeray.priede.proyecto_nevera {
    requires javafx.controls;
    requires javafx.fxml;


    opens yeray.priede.proyecto_nevera to javafx.fxml;
    exports yeray.priede.proyecto_nevera;
}