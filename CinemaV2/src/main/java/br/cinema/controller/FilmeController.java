package br.cinema.controller;

import javax.swing.JOptionPane;

import br.cinema.model.Filme;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FilmeController {

	@FXML
	private TextField txtTitulo;

	@FXML
	private TextField txtDuracao;

	@FXML
	private TextField txtClassificacao;

	@FXML
	private TextField txtGenero;

	@FXML
	private TextField txtSinopse;

	@FXML
	private Button btnSalvarFilme;

	@FXML
	private Button btnFecharFilme;

	@FXML
	private void close() {
		Stage stage = (Stage) btnFecharFilme.getScene().getWindow(); // Obtendo a janela atual
		stage.close();// Fechando o Stage

	}
	
	@FXML
	private void salvar() {
		if (!ConfereCampo()) {
			return;
		}
		Filme novoFilme = new Filme();

		novoFilme.setTitulo(txtTitulo.getText());
		novoFilme.setDuracao(txtDuracao.getText());
		novoFilme.setClassificacao(txtClassificacao.getText());
		novoFilme.setGenero(txtGenero.getText());
		novoFilme.setSinopse(txtSinopse.getText());

	}
	
	private boolean ConfereCampo() {
		if (txtTitulo.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe o titulo!!");
			return false;
		}

		if (txtDuracao.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe a duração!!");
			return false;
		}
		if (txtClassificacao.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe a classificação!!");
			return false;
		}
		if (txtGenero.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe o genero!!");
			return false;
		}
		if (txtSinopse.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe a sinopse!!");
			return false;
		}

		return true;
	}


}
