package Controller;

import Main.App;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LogInController {
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("Register");
    }
    @FXML
    private TextField emailField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button registerButton;
    @FXML
    private void initialize() {
        // registerButton.setOnAction(event -> registerUser());
    }
}