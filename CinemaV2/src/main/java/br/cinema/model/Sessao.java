package br.cinema.model;

import java.time.LocalDate;
import java.time.LocalTime;

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
	private LocalTime hora;
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
	public LocalDate getData() {
		return data;
	}
	
	//---------------------------------------------------------------------------------------------------------------------------
	public void setData(LocalDate data) {
		this.data = data;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public LocalTime getHora() {
		return hora;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public void setHora(LocalTime localTime) {
		this.hora = localTime;
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
