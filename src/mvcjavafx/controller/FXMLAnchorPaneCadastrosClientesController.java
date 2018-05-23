package mvcjavafx.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import java.util.List;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import mvcjavafx.model.domain.Cliente;

public class FXMLAnchorPaneCadastrosClientesController implements Initializable {

    @FXML
    private Label labelClienteCpf;

    @FXML
    private Label labelClienteCodigo;

    @FXML
    private Label labelClienteNome;

    @FXML
    private TableColumn<?, ?> tableColumnClienteCpf;

    @FXML
    private JFXButton botaoRemover;

    @FXML
    private JFXButton botaoAlterar;

    @FXML
    private TableColumn<?, ?> tableColumnClienteNome;

    @FXML
    private Label labelClienteTelefone;

    @FXML
    private JFXButton botaoInserir;

    @FXML
    private TableView<?> tableViewClientes;
    
    private List<Cliente> listClientes;
    private ObservableList<Cliente> observableListClientes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
