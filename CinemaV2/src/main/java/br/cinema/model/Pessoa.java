package br.cinema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa {

	@Id
	@GeneratedValue
	private int idPessoa;
	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	
	private String senha;
	private String cpf;
	private String nome;
	private String endereco;
	private String fone;
	//private Date dtNascimento;
	private String email;

	
	// -------------------------------------------------------------------------------------------
	public String getCpf() {
		Formatar fmt = new FormatarString();
		// retonar CPF com mask
		String maskCpf = "###.###.###-##";
		return fmt.cpf(cpf, maskCpf);
	}

	// -------------------------------------------------------------------------------------------
	public void setCpf(String cpf) {
		// validar CPF
		this.cpf = cpf;
	}

	// -------------------------------------------------------------------------------------------
	public String getNome() {
		// retornar fone com mask
		return nome;
	}

	// -------------------------------------------------------------------------------------------
	public void setNome(String nome) {
		this.nome = nome;
	}

	// -------------------------------------------------------------------------------------------
	public String getEndereco() {
		return endereco;
	}

	// -------------------------------------------------------------------------------------------
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// -------------------------------------------------------------------------------------------
	public String getFone() {
		return fone;
	}

	// -------------------------------------------------------------------------------------------
	public void setFone(String fone) {
		this.fone = fone;
	}

	// -------------------------------------------------------------------------------------------
	
	// -------------------------------------------------------------------------------------------
	public String getEmail() {
		return email;
	}

	// -------------------------------------------------------------------------------------------
	public void setEmail(String email) {
		// validar email aqui
		this.email = email;
	}
	
	// -------------------------------------------------------------------------------------------

	public String getSenha() {
		return senha;
	}
	
	// -------------------------------------------------------------------------------------------

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
