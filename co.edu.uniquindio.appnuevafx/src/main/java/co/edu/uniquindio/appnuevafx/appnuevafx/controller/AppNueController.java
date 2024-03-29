package co.edu.uniquindio.appnuevafx.appnuevafx.controller;

import co.edu.uniquindio.appnuevafx.appnuevafx.model.Nueva;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AppNueController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnintento;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextArea txtArea;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

    @FXML
    void btnintento(ActionEvent actionEvent) {
            AgregarNuevoIntent();
    }

    @FXML
    void initialize() {

    }

    private void AgregarNuevoIntent() {
        var nuevo= new Nueva();

        nuevo.setNombre(txtNombre.getText());
        nuevo.setApellido(txtApellido.getText());
        nuevo.setCedula(txtCedula.getText());
        nuevo.setTelefono(txtTelefono.getText());
        nuevo.setEdad(txtEdad.getText());
        nuevo.setCelular(txtCelular.getText());

        txtArea.setText(nuevo.toString());
    }


}

