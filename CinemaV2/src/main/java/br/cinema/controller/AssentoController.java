package br.cinema.controller;

import br.cinema.DAO.AssentoDAO;
import br.cinema.model.Assento;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
		// ConfereCampo();
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

}
