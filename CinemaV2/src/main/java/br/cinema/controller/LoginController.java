package br.cinema.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import br.cinema.JPA.Autenticar;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController {

	@FXML
	private Button btnLogar;

	@FXML
	private JFXTextField txtLogin;

	@FXML
	private JFXPasswordField txtPassword;

	@FXML
	private FontAwesomeIconView btnFecharLogin;

	@FXML
	private Button btnCriarConta;
	
//---------------------------------------------------------------------------------------------------------------------------------------
	@FXML
	void logar(ActionEvent event) {
		System.out.println("logar");
		String user = txtLogin.getText();
		String pwd = txtPassword.getText();
		
//---------------------------------------------------------------------------------------------------------------------------------------		
		
		Autenticar aulog = new Autenticar();
		if (aulog.ValidarLogin(user, pwd)) {
		//	System.out.println("Direcionar para proxima pagina");
			final Stage primaryStage = new Stage();

			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/ui_index.fxml"));
				Scene scene = new Scene(root);
				// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
				// FabricaConexao.getConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Usuario e senha nao encontrado!");
			alert.setHeaderText("Erro no Login");
			alert.setContentText("Usuário ou senha incorretos!");
			alert.showAndWait();
		}

		

	}
	
//-------------------------------------------------------------------------------------------------------------------------------------


	@FXML
	void close(MouseEvent event) {
		System.exit(0);
	}
	
//--------------------------------------------------------------------------------------------------------------------------------------

	@FXML
	void criarConta(ActionEvent event) {
		
		final Stage primaryStage = new Stage();
		
		System.out.println("criar conta");
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/ui_cliente.fxml"));
			Scene scene = new Scene(root);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			// FabricaConexao.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
