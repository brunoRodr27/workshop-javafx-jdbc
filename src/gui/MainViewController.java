package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem itemMenuVendedor;
	@FXML
	private MenuItem itemMenuDepartamento;
	@FXML
	private MenuItem itemMenuAjuda;
	
	@FXML
	public void onItemMenuVendedorAction() {
		System.out.println("onItemMenuVendedorAction");
	}
	
	@FXML
	public void onItemMenuDepartamentoAction() {
		System.out.println("onItemMenuDepartamentoAction");
	}

	
	@FXML
	public void onItemMenuAjudaAction() {
		System.out.println("onItemMenuAjudaAction");
	}


	@Override
	public void initialize(URL uri, ResourceBundle br) {
		
	}

}
