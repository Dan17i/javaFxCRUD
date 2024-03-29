package co.edu.uniquindio.appnuevafx.appnuevafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Entonces muchachos nos fuimos!!");
    }
}