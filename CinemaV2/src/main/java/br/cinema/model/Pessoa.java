package br.cinema.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa {

	@Id
	@GeneratedValue
	private int idPessoa;
	private String senha;
	private String cpf;
	private String nome;
	@ManyToOne
	private Endereco endereco;
	private String fone;
	private LocalDate dataNascimento;
	private String email;
	
	// -------------------------------------------------------------------------------------------
	public int getIdPessoa() {
		return idPessoa;
	}
	// -------------------------------------------------------------------------------------------
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
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

	public Endereco getEndereco() {
		return endereco;
	}
	// -------------------------------------------------------------------------------------------

	public void setEndereco(Endereco endereco) {
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
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
