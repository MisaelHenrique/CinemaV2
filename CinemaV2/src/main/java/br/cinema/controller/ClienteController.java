package br.cinema.controller;

import javax.swing.JOptionPane;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;

import br.cinema.DAO.ClienteDAO;
import br.cinema.model.Cidade;
import br.cinema.model.Cliente;
import br.cinema.model.Endereco;
import br.cinema.model.Estado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ClienteController {

	@FXML
	private TextField txtTipoCliente;

	@FXML
	private TextField txtEstudante;

	@FXML
	private TextField txtValidade;

	@FXML
	private Button bntSalvarCliente;

	@FXML
	private Button btnFecharCliente;

	@FXML
	private TextField txtCpfCliente;

	@FXML
	private TextField txtNomeCliente;

	@FXML
	private TextField txtEnderecoCliente;

	@FXML
	private TextField txtFoneCliente;

	@FXML
	private JFXDatePicker txtDataNascimentoCliente;

	@FXML
	private TextField txtEmailCliente;

	@FXML
	private TextField txtCep;
	
	@FXML
	private TextField txtNomeRua;
	
	@FXML
	private TextField txtNumero;
	
	@FXML
	private TextField txtBairro;
	
	@FXML
	private JFXComboBox<Cidade> comboCidade;

	@FXML
	private JFXComboBox<Estado> comboEstado;





	@FXML
	private void salvar() {
		ConfereCampo();
		Cliente novoCliente = new Cliente();
		Endereco novoEndereco = new Endereco();
		
		novoEndereco.setNomeRua(txtNomeRua.getText());
		novoEndereco.setBairro(txtBairro.getText());
		novoEndereco.setNumero(txtNumero.getText());
		novoEndereco.setCep(txtCep.getText());

		novoCliente.setNome(txtNomeCliente.getText());
		novoCliente.setCpf(txtCpfCliente.getText());
		novoCliente.setEmail(txtEmailCliente.getText());
		novoCliente.setFone(txtFoneCliente.getText());
		novoCliente.setTipoCliente(txtTipoCliente.getText());
		novoCliente.setDataNascimento(txtDataNascimentoCliente.getValue());
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

	private void ConfereCampo() {
		if (txtNomeCliente.getText().trim().isEmpty()) {

			JOptionPane.showMessageDialog(null, "Informe o nome!!");

			return;
		}

		if (txtCpfCliente.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Informe o CPF!!");
			return;
		}
		if (txtEmailCliente.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Informe o e-mail!!");
			return;
		}
		if (txtFoneCliente.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Informe o telefone!!");
			return;
		}
		if (txtEnderecoCliente.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Informe o endereco: rua/numero/bairro/cidade!!");
			return;
		}
		if (txtTipoCliente.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Informe o tipo de cliente!!");
			return;
		}
		if (txtDataNascimentoCliente.getValue().equals("")) {
			JOptionPane.showMessageDialog(null, "Informe data de nascimento!!");
			return;
		}
	}
	
	private void AtribuiViewToModel() {
		
	}

}
