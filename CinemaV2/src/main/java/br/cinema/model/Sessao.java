package br.cinema.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_sessao")
public class Sessao {
	
	
	@Id
	@GeneratedValue
	private int idSessao;
	private LocalDate data;
	private LocalDate hora;
	private float valor;
	private String tipo;
	
	//---------------------------------------------------------------------------------------------------------------------------
	public int getIdSessao() {
		return idSessao;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public void setIdSessao(int idSessao) {
		this.idSessao = idSessao;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public LocalDate getLocalData() {
		return data;
	}
	
	//---------------------------------------------------------------------------------------------------------------------------
	public void setLocalData(LocalDate data) {
		this.data = data;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public LocalDate getHora() {
		return hora;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public void setHora(LocalDate hora) {
		this.hora = hora;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public float getValor() {
		return valor;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public void setValor(float valor) {
		this.valor = valor;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public String getTipo() {
		return tipo;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	

}
