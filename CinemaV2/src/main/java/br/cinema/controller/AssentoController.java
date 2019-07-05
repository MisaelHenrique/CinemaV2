package br.cinema.controller;

import br.cinema.DAO.AssentoDAO;
import br.cinema.model.Assento;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class AssentoController {

	@FXML
	private Button btnFecharAssento;

	@FXML
	private Button btnSalvarAssento;

	@FXML
	private TextField txtPoltrona;

	@FXML
	private TextField txtTipoAssento;
	
	@FXML
	private void salvarAssento(){
		if (!ConfereCampo()) {
			return;
		}
		
		Assento novoAssento = new Assento();

		novoAssento.setTipo(txtTipoAssento.getText());
		novoAssento.setPoltrona(txtPoltrona.getText());

		AssentoDAO daoAssento = new AssentoDAO();
		daoAssento.save(novoAssento);

	}

	@FXML
	private void closeAssento(){
		Stage stage = (Stage) btnFecharAssento.getScene().getWindow(); // Obtendo a janela atual
		stage.close();// Fechando o Stage

	}
	
	private boolean ConfereCampo() {
		if (txtPoltrona.getText().trim().isEmpty()) {
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe a poltrona!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();			
						
						return false;
		}

		if (txtTipoAssento.getText().trim().isEmpty()) {
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe o tipo de assento!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();			
						
						return false;
		}
		
		return true;

	}

}
