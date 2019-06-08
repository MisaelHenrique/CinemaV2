package br.cinema.model;

import java.util.Date;

public class Pessoa {

	private int idPessoa;
	private String cpf;
	private String nome;
	private String endereco;
	private String fone;
	private Date dtNascimento;
	private String email;

	public Pessoa(String cpf, String nome, String endereco, String fone, Date dtNascimento, String email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.fone = fone;
		this.dtNascimento = dtNascimento;
		this.email = email;
	}

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
	public Date getDtNascimento() {
		return dtNascimento;
	}

	// -------------------------------------------------------------------------------------------
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	// -------------------------------------------------------------------------------------------
	public String getEmail() {
		return email;
	}

	// -------------------------------------------------------------------------------------------
	public void setEmail(String email) {
		// validar email aqui
		this.email = email;
	}

}
