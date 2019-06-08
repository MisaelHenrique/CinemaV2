
package br.cinema.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

//classe que conecta os elementos graficos(button, txt, etc) com a aplicaçãojava
public class Controller {

	@FXML
	private Button btnFilmeIndex;

	@FXML
	private Button btnSessaoIndex;

	@FXML
	private Button btnFecharIndex;

	@FXML
	private Button btnCadastroIndex;

	@FXML
	private Button btnAssentoIndex;

	@FXML
	private Button btnTicketIndex;

	@FXML
	private Button btnPagamentoIndex;

	@FXML
	public void openWindow(ActionEvent mouseEvent) {

		if (mouseEvent.getSource() == btnCadastroIndex) {
			loadFXML("ui_cadastro.fxml");
			// System.out.println("clicou no botão clientes");

		} else if (mouseEvent.getSource() == btnFilmeIndex) {
			loadFXML("ui_filmes.fxml");
			// System.out.println("clicou no botão filmes");

		} else if (mouseEvent.getSource() == btnSessaoIndex) {
			loadFXML("ui_sessao.fxml");
			// System.out.println("clicou no botão filmes");

		} else if (mouseEvent.getSource() == btnAssentoIndex) {
			loadFXML("ui_assento.fxml");
			// System.out.println("clicou no botão filmes");

		} else if (mouseEvent.getSource() == btnTicketIndex) {
			loadFXML("ui_ticket.fxml");
			// System.out.println("clicou no botão filmes");
		
		}else if (mouseEvent.getSource() == btnPagamentoIndex) {
			loadFXML("ui_pagamento.fxml");
			// System.out.println("clicou no botão filmes");
		}

	}

	public void loadFXML(String fxml) {

		try {
			Parent root = FXMLLoader.load(getClass().getResource(fxml));
			Scene scene = new Scene(root);
			Stage stage = new Stage();

			stage.setScene(scene);

			stage.show();

		} catch (IOException e) {

			System.out.println("Erro ao inicializar a aplicação! " + e);
			System.exit(0);

		}

	}

	// funções a serem atribuidas ou obtidas dos componentes das telas
	@FXML
	public void checkCpf(ActionEvent check) {

	}

	@FXML
	public boolean checkLogin(ActionEvent Login) {
		return true;

	}

}
