package br.cinema.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FuncionarioController {
	


	    @FXML
	    private Button btnFecharFuncionaro;

	    @FXML
	    private Button btnSalvarFuncionaro;

	    @FXML
	    private TextField txtTurno;

	    @FXML
	    private TextField txtDataAdmissao;

	    @FXML
	    private TextField txtFuncao;

	    @FXML
	    private TextField txtSalario;

	    @FXML
	    private TextField txtCPFFuncionaro;

	    @FXML
	    private TextField txtNomeFuncionaro;

	    @FXML
	    private TextField txtEderecoFuncionaro;

	    @FXML
	    private TextField txtTelefoneFuncionaro;

	    @FXML
	    private TextField txtDataNascimentoFuncionaro;

	    @FXML
	    private TextField txtEmailFuncionaro;

	    @FXML
	    private TextField txtCepFuncionaro;
	    
	    @FXML
	    private void closeFunc() {
	    	Stage stage = (Stage) btnFecharFuncionaro.getScene().getWindow(); //Obtendo a janela atual
	        stage.close();//Fechando o Stage
	    	
	    }

	}



