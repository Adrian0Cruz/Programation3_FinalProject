package Controller;

import Main.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class RegisterController implements Initializable{
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    @FXML
    private void switchToIndex() throws IOException {
        //App.setRoot("LogIn");
        //esto es para el index
    }
    @FXML
    private void switchToLogIn() throws IOException {
        App.setRoot("LogIn");
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
}