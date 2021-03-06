package br.cinema.controller;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;

import br.cinema.DAO.SessaoDAO;
import br.cinema.model.Sessao;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class SessaoController {

	@FXML
	private JFXDatePicker txtDataSessao;

	@FXML
	private Button btnFecharSessao;

	@FXML
	private Button btnSalvarSessao;

	@FXML
	private TextField txtTipoSessao;

	@FXML
	private TextField txtValorSessao;

	@FXML
	private JFXTimePicker txtHoraSessao;
	
	@FXML
	private void salvar() {
		//ConfereCampo();
		Sessao novaSessao = new Sessao();

		novaSessao.setData(txtDataSessao.getValue());
		novaSessao.setTipo(txtTipoSessao.getText());
		novaSessao.setValor(Integer.parseInt(txtValorSessao.getText()));
		novaSessao.setHora(txtHoraSessao.getValue());

		SessaoDAO daoSessao = new SessaoDAO();
		daoSessao.save(novaSessao);

	}

	@FXML
	private void closeSessao() {
		Stage stage = (Stage) btnFecharSessao.getScene().getWindow(); // Obtendo a janela atual
		stage.close();// Fechando o Stage

	}
	
	private boolean ConfereCampo() {
		if (txtTipoSessao.getText().trim().isEmpty()) {
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe o tipo da Sessao 2D ou 3D!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();			
						
						return false;
		}

		if (txtValorSessao.getText().trim().isEmpty()) {
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe o valor da sessao!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();			
						
						return false;
		}
		
		return true;

	}

}
