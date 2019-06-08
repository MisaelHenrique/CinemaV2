package br.cinema.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jfoenix.controls.JFXTextField;

import br.cinema.JPA.CinemaDAOException;
import br.cinema.JPA.FabricaConexao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class LoginController {
	

    @FXML
    private Button btnLogar;

    @FXML
    private JFXTextField txtLogin;

    @FXML
    private JFXTextField txtPassword;
	
	@FXML
	void logar(ActionEvent event) {
		System.out.println("logar");
		String user = txtLogin.getText();
		String pwd = txtPassword.getText();
		
		//implementar uma validação, verificar se esta vazio, trin, framework
		
		String sql = "SELECT * FROM tab_login WHERE login_usuario = ? and login_senha = ?";
		
		Connection conn;
		try {
			conn = FabricaConexao.getConnection();
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, user);
			stmt.setString(2, pwd);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("Direcionar para proxima pagina");
			}
			
			//exibir um janela
			//Login e Senha estão incorretos
			
			
		} catch (CinemaDAOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
	}
	
	@FXML
	void close(MouseEvent event) {
		System.exit(0);
	}
	
	@FXML
	void criarConta(ActionEvent event) {
		System.out.println("criar conta");
	}

}
