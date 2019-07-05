package br.cinema.controller;

import com.jfoenix.controls.JFXTextField;

import br.cinema.DAO.FormaPagamentoDao;
import br.cinema.model.FormaPagamento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class FormaDePagamentoController {
	
	@FXML
    private JFXTextField txtFormaPagamento;

	@FXML
	private Button btnFecharPagamento;

	@FXML
	private Button btnSalvarFormaPagamento;

	@FXML
	void salvarPagamento(ActionEvent event) {
		if (!ConfereCampo()) {
			return;
		}
		
		FormaPagamento novoPagamento = new FormaPagamento();

		novoPagamento.setFormaPagamento(txtFormaPagamento.getText());
		
		FormaPagamentoDao daoPagamento = new FormaPagamentoDao();
		daoPagamento.save(novoPagamento);


	}

	@FXML
	void closePagamento(ActionEvent event) {

	}

	private boolean ConfereCampo() {
		if (txtFormaPagamento.getText().trim().isEmpty()) {
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe a Forma de pagamento Dinheiro, Debito ou Crédito!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();			
						
						return false;
		}
		
		return true;

	}
}
