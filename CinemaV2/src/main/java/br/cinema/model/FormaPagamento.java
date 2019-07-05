package br.cinema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FormaPagamento {
	
	@Id
	@GeneratedValue
	private int idPagamento;
	private String formaPagamento;
	
	//-------------------------------------------------------------------------------------------------
	public int getIdPagamento() {
		return idPagamento;
	}
	//-------------------------------------------------------------------------------------------------
	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}
	//-------------------------------------------------------------------------------------------------
	public String getFormaPagamento() {
		return formaPagamento;
	}
	//-------------------------------------------------------------------------------------------------
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	

}
