package br.cinema.controller;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;

import br.cinema.DAO.SessaoDAO;
import br.cinema.model.Sessao;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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

}
