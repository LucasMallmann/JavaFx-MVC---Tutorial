package mvcjavafx.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author mallmann
 */
public class FXMLVBoxMainController implements Initializable {

    
    @FXML
    private MenuItem menuItemRelatoriosQuantidadeProdutosEstoque;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private MenuItem menuItemCadastrosClientes;

    @FXML
    private MenuItem menuItemProcessosVendas;

    @FXML
    private MenuItem menuItemGraficosVendasPorMes;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
