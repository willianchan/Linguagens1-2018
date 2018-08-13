/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendagui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 16.01095-7
 */
public class FXMLDocumentController implements Initializable {

    private ArrayList<Contato> ListaContatos;

    @FXML
    private Label label;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtTelefone;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        Contato c1 = new Contato(txtNome.getText());
        c1.setEmail(txtEmail.getText());
        c1.setTelefone(txtTelefone.getText());

        ListaContatos.add(c1);

        System.out.println("Contato: " + c1);
        System.out.println(ListaContatos.size());
    }

    @FXML
    private void ExibirLista(ActionEvent event) {
        for (Contato contato : ListaContatos) {
            System.out.println("" + contato);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ListaContatos = new ArrayList();
    }

}
