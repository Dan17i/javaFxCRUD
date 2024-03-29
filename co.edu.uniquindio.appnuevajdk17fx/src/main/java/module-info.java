module co.edu.uniquindio.appnuevajdk17fx.appnuevajdk17fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.appnuevajdk17fx.appnuevajdk17fx to javafx.fxml;
    exports co.edu.uniquindio.appnuevajdk17fx.appnuevajdk17fx;
}