package Controller;

import Main.App;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class RegisterController {
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("Secondary");
    }
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField idField;
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