import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;

public class Controller implements Initializable {

    @FXML
    private RadioButton ancienNon;

    @FXML
    private RadioButton ancienOui;

    @FXML
    private ToggleGroup accident;

    @FXML
    private Pane anciennete;

    @FXML
    private CheckBox ans;

    @FXML
    private Button btnCalculer;

    @FXML
    private TextField nbAccident;

    @FXML
    private ChoiceBox<String> choiceBox;
    private String[] permis = { "moins de 2 ans", "2 ans et plus" };

    @FXML
    private Label resultat;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choiceBox.getItems().addAll(permis);
        choiceBox.setOnAction(this::getPermis);

    }

    public void getPermis(ActionEvent event) {
        String sonPermis = choiceBox.getValue();

    }

    public boolean get25ansBox() {
        if (ans.isSelected()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean getAnciennete() {
        if (ancienOui.isSelected())
            return true;
        if (ancienNon.is) {
            return false;
        }

    }

}
