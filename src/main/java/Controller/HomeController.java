package Controller;

import Main.App;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

/**
 * FXML Controller class
 * @author Jesús Hernández
 */
public class HomeController implements Initializable {
    @FXML
    private Spinner<Integer> spinnerAdults;
    @FXML
    private Spinner<Integer> spinnerChildren;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 2); // límites de 1 a 10, inicia en 2
        spinnerAdults.setValueFactory(valueFactory1);
        SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10, 0); // límites de 0 a 10, inicia en 0
        spinnerChildren.setValueFactory(valueFactory2);
    }
    @FXML
    private void switchToLogIn() throws IOException {
        App.setRoot("LogIn");
    }
}