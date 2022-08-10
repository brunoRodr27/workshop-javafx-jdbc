package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;

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
		loadView("/gui/DepartmentList.fxml");
	}

	
	@FXML
	public void onItemMenuAjudaAction() {
		loadView("/gui/About.fxml");
	}


	@Override
	public void initialize(URL uri, ResourceBundle br) {
		
	}
	
	private synchronized void loadView(String absolute) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absolute));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox)((ScrollPane) mainScene.getRoot()).getContent();
			Node mainMenu = mainVBox.getChildren().get(0);
			
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
			
		} catch (IOException e) {
			Alerts.showAlert("IOExceptio", "Erro ao carregar a pagina", e.getMessage(), AlertType.ERROR);
		}
	}

}
