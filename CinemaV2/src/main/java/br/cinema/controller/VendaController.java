package br.cinema.controller;

import java.awt.Label;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class VendaController {

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
    private JFXComboBox<?> cbFillme;

    @FXML
    private JFXComboBox<?> cbHorario;

    @FXML
    private JFXComboBox<?> cbPoltrona;

    @FXML
    private JFXRadioButton rbEstudante;

    @FXML
    private JFXButton btnFinalizar;

    @FXML
    private JFXButton btnSair;

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
