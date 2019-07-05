package br.cinema.controller;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.cinema.model.Filme;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FilmeController {

	@FXML
    private JFXTextField txtTitulo;

    @FXML
    private JFXTextField txtDuracao;

    @FXML
    private JFXTextField txtClassificacao;

    @FXML
    private JFXTextArea txtSinopse;

    @FXML
    private JFXTextField txtGenero;
    
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
	private void salvarFilme() {
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
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe o titulo!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();			return false;
		}

		if (txtDuracao.getText().trim().isEmpty()) {
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe a duração!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();			return false;
		}
		if (txtClassificacao.getText().trim().isEmpty()) {
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe a classificação!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();			return false;
		}
		if (txtGenero.getText().trim().isEmpty()) {
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe o genero!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();			return false;
		}
		if (txtSinopse.getText().trim().isEmpty()) {
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe a sinopse!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();			return false;
		}

		return true;
	}


}
