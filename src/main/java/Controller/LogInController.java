package Controller;

import Main.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LogInController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    @FXML
    private TextField emailField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button registerButton;
    @FXML
    private void switchToRegister() throws IOException {
        App.setRoot("Register");
    }
    @FXML
    private void switchToHome() throws IOException {
        App.setRoot("Home");
    }
}