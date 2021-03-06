package br.cinema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Endereco {
	
	@Id
	@GeneratedValue
	private int id;
	private String nomeRua;
	private String numero;
	private String bairro;
	private String cep;
	@ManyToOne
	private Cidade cidade;
	
	//--------------------------------------------------------------------------------------------------------------------------------
	public int getId() {
		return id;
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	public void setId(int id) {
		this.id = id;
	}
	 	
	//--------------------------------------------------------------------------------------------------------------------------------
	public String getNomeRua() {
		return nomeRua;
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	public String getNumero() {
		return numero;
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	public void setNumero(String numero) {
		this.numero = numero;
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	public String getBairro() {
		return bairro;
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	public String getCep() {
		return cep;
	}
	//--------------------------------------------------------------------------------------------------------------------------------
	public void setCep(String cep) {
		this.cep = cep;
	}
	

}
