package olamundogui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private TextField textField3;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        String resultado = "Sinal Inválido";
        try {
            if (null != textField2.getText()) switch (textField2.getText()) {
                case "+":
                    resultado = Float.toString(Float.parseFloat(textField1.getText()) + Float.parseFloat(textField3.getText()));
                    break;
                case "-":
                    resultado = Float.toString(Float.parseFloat(textField1.getText()) - Float.parseFloat(textField3.getText()));
                    break;
                case "*":
                    resultado = Float.toString(Float.parseFloat(textField1.getText()) * Float.parseFloat(textField3.getText()));
                    break;
                case "/":
                    resultado = Float.toString(Float.parseFloat(textField1.getText()) / Float.parseFloat(textField3.getText()));
                    break;
            }
        }catch (NumberFormatException erro){
            System.out.println(erro);
        }

        label.setText(resultado);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
