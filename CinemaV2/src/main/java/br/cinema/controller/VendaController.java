package br.cinema.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;

import br.cinema.DAO.FilmeDAO;
import br.cinema.DAO.VendaDAO;
import br.cinema.model.Assento;
import br.cinema.model.Filme;
import br.cinema.model.Sessao;
import br.cinema.model.Venda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class VendaController implements Initializable {

	@FXML
    private ImageView imgFilme;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblGenero;

    @FXML
    private Label lblClassificacao;

    @FXML
    private Label lblDuracao;

    @FXML
    private Label lblSinopse;
    
    @FXML
    private Label lblValor;

    @FXML
    private JFXRadioButton rb3D;

    @FXML
    private ToggleGroup sessao;

    @FXML
    private JFXRadioButton rb2D;

    @FXML
    private JFXRadioButton rbLegendado;

    @FXML
    private ToggleGroup legenda;

    @FXML
    private JFXRadioButton rbDublado;

    @FXML
    private JFXComboBox<Filme> cbFilme;

    @FXML
    private JFXComboBox<Sessao> cbHorario;

    @FXML
    private JFXComboBox<Assento> cbPoltrona;

    @FXML
    private JFXRadioButton rbEstudante;

    @FXML
    private JFXButton btnFinalizar;

    @FXML
    private JFXButton btnSair;   
    
    public void initialize(URL url, ResourceBundle rb) {
    	
    }
    
    @FXML
	private void finalizar() {
		//ConfereCampo();
		Venda novaVenda = new Venda();
		
		FilmeDAO daoTitulo = new FilmeDAO();			
		String titulo = "" + cbFilme.getValue();	
		Filme es = daoTitulo.getByName(titulo);

//		novaVenda.setFilme(cbFilme.getValue());
		
		novaVenda.setHorario(cbHorario.getValue());
		novaVenda.setPoltrona(cbPoltrona.getValue());
		novaVenda.setValor(lblValor.getText());

		VendaDAO daoVenda = new VendaDAO();
		daoVenda.save(novaVenda);

	}

    @FXML
    void close(ActionEvent event) {
    	Stage stage = (Stage) btnSair.getScene().getWindow(); //Obtendo a janela atual
        stage.close();//Fechando o Stage

    }

    @FXML
    void finalizar(ActionEvent event) {
    	//abrir a tela de finalizar venda

    }

}
