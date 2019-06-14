package br.cinema.controller;

import java.awt.TextField;

import br.cinema.JPA.Autenticar;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class LoginController {

	@FXML
	private TextField txtLogin;

	@FXML
	private TextField txtSenha;

	@FXML
	private Button btnLogar;

	@FXML
	private Button btnFecharLogin;

	@FXML
	void logar(ActionEvent event) {
		System.out.println("logar");
		String user = txtLogin.getText();
		String pwd = txtSenha.getText();
		
		  Autenticar aulog = new Autenticar();
		  System.out.println("Direcionar para proxima pagina");
		  
		  return aulog;
		  
	}

	// exibir um janela //Login e Senha estão incorretos

	@FXML
	void close(MouseEvent event) {
		System.exit(0);
	}

	@FXML
	void criarConta(ActionEvent event) {
		System.out.println("criar conta");
	}

}
