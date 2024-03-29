module co.edu.uniquindio.appnuevafx.appnuevafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.appnuevafx.appnuevafx to javafx.fxml;
    exports co.edu.uniquindio.appnuevafx.appnuevafx;

    opens co.edu.uniquindio.appnuevafx.appnuevafx.controller;
    exports co.edu.uniquindio.appnuevafx.appnuevafx.controller;

    //opens co.edu.uniquindio.appnuevafx.appnuevafx.model;

}