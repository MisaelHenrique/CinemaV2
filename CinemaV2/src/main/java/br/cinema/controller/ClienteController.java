package br.cinema.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;

import br.cinema.DAO.CidadeDAO;
import br.cinema.DAO.ClienteDAO;
import br.cinema.DAO.EstadoDAO;
import br.cinema.model.Cidade;
import br.cinema.model.Cliente;
import br.cinema.model.Endereco;
import br.cinema.model.Estado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class ClienteController {

	@FXML
	private Button bntSalvarCliente;

	@FXML
	private Button btnFecharCliente;

	@FXML
	private JFXDatePicker txtDataNascimentoCliente = new JFXDatePicker();


	@FXML
	private JFXTextField txtCpfCliente;

	@FXML
	private JFXTextField txtNomeCliente;

	@FXML
	private JFXTextField txtCEP;

	@FXML
	private JFXTextField txtRuaCliente;

	@FXML
	private JFXTextField txtNumeroRua;

	@FXML
	private JFXTextField txtBairro;

	@FXML
	private JFXComboBox<Estado> cbEstado;

	@FXML
	private JFXComboBox<Cidade> cbCidade;

	@FXML
	private JFXTextField txtFoneCliente;

	@FXML
	private JFXRadioButton rdbEstudante;

	@FXML
	private ToggleGroup tipoCliente;

	@FXML
	private JFXTextField txtEmailCliente;

	@FXML
	private JFXPasswordField txtSenha;

	@FXML
	private JFXRadioButton rdbPrata;

	@FXML
	private JFXRadioButton rdbOuro;

	@FXML
	private JFXRadioButton rdbDiamante;

	@FXML
	private void salvar() {
		if (!ConfereCampo()) {
			return;
		}
		Cliente novoCliente = new Cliente();
		Endereco novoEndereco = new Endereco();

		EstadoDAO daoEstado = new EstadoDAO();
		String valor = "" + cbEstado.getValue();
		Estado es = daoEstado.getByName(valor);

		CidadeDAO daoCidade = new CidadeDAO();
		String valor2 = "" + cbCidade.getValue();
		Cidade cid = daoCidade.getByName(valor2);

		novoEndereco.setNomeRua(txtRuaCliente.getText());
		novoEndereco.setBairro(txtBairro.getText());
		novoEndereco.setNumero(txtNumeroRua.getText());
		novoEndereco.setCep(txtCEP.getText());

		novoCliente.setNome(txtNomeCliente.getText());
		novoCliente.setCpf(txtCpfCliente.getText());
		novoCliente.setEmail(txtEmailCliente.getText());
		novoCliente.setFone(txtFoneCliente.getText());
		novoCliente.setDataNascimento(txtDataNascimentoCliente.getValue());

		RadioButton radio = (RadioButton) tipoCliente.getSelectedToggle();
		novoCliente.setEstudante(radio.getText());

		// novoCliente.setIdPessoa(Integer.parseInt(txtIdPessoa.getText())); Caso
		// atributo seja Inteiro, usar o parse para converter a String para Int

		ClienteDAO daoCli = new ClienteDAO();
		daoCli.save(novoCliente);

	}

	@FXML
	private void close() {
		Stage stage = (Stage) btnFecharCliente.getScene().getWindow(); // Obtendo a janela atual
		stage.close();// Fechando o Stage

	}

	private void AtribuiViewToModel() {

	}

	@FXML
	void selecionaEstado(ActionEvent event) {
		CidadeDAO daoCidade = new CidadeDAO();
		EstadoDAO daoEstado = new EstadoDAO();

		String valor = "" + cbEstado.getValue();
		Estado estadoSelecionado = daoEstado.getByName(valor);

		System.out.println(estadoSelecionado.getIdEstado());

		// LOG.info(daoCidade.getCidadesById().size());

		ObservableList<Cidade> cities = FXCollections
				.observableArrayList(daoCidade.getCidadesById(daoEstado.getById(estadoSelecionado.getIdEstado())));

		cbCidade.setItems(cities);

	}

	void selecionaCidade(ActionEvent event) {
		CidadeDAO daoCidade = new CidadeDAO();
		EstadoDAO daoEstado = new EstadoDAO();

		String valor2 = "" + cbCidade.getValue();
		Cidade cidadeSelecionada = daoCidade.getByName(valor2);

		System.out.println(cidadeSelecionada.getIdCidade());

		ObservableList<Cidade> cities = FXCollections
				.observableArrayList(daoCidade.getCidadesById(daoEstado.getById(cidadeSelecionada.getIdCidade())));

		cbCidade.setItems(cities);

	}

	private boolean ConfereCampo() {
		if (txtNomeCliente.getText().trim().isEmpty()) {
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe o Nome!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();
			return false;
		}

		if (txtCpfCliente.getText().trim().equals("")) {
				Alert msg = new
				Alert(AlertType.ERROR);
					msg.setContentText("Informe o CPF!!");
					msg.setHeaderText("Erro na autenticação");
					msg.show();
			return false;
	}
		
		if (txtRuaCliente.getText().trim().isEmpty()) {
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe o Nome da rua!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();			return false;
		}
		if (txtNumeroRua.getText().trim().equals("")) {
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe o numero!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();			return false;
		}

		if (txtBairro.getText().trim().equals("")) {
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe o bairro!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();			return false;
		}
		if (txtCEP.getText().trim().equals("")) {
			Alert msg = new
					Alert(AlertType.ERROR);
						msg.setContentText("Informe o CEP!!");
						msg.setHeaderText("Erro na autenticação");
						msg.show();			return false;
		}
		return true;
}

	private void AtribuitoModelToView() {// Listar e alterar
		Cliente novoCliente = new Cliente();
		Endereco novoEndereco = new Endereco();
		Estado novoEstado = new Estado();
		Cidade novaCidade = new Cidade();

		txtNomeCliente.setText(novoCliente.getNome());
		txtCpfCliente.setText(novoCliente.getCpf());
		txtDataNascimentoCliente.setValue(novoCliente.getDataNascimento());
		txtRuaCliente.setText(novoEndereco.getNomeRua());
		txtNumeroRua.setText(novoEndereco.getNumero());
		txtBairro.setText(novoEndereco.getBairro());
		txtCEP.setText(novoEndereco.getCep());

		cbEstado.setStyle(novoEstado.getUfEstado());
		cbCidade.setStyle(novaCidade.getCidade());

		txtFoneCliente.setText(novoCliente.getFone());
		
		rdbEstudante.setStyle(novoCliente.getTipoCliente());
		rdbOuro.setStyle(novoCliente.getTipoCliente());
		rdbPrata.setStyle(novoCliente.getTipoCliente());
		rdbDiamante.setStyle(novoCliente.getTipoCliente());
		
		txtEmailCliente.setText(novoCliente.getEmail());
		txtSenha.setText(novoCliente.getSenha());
	}

}
