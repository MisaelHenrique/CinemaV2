package br.cinema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_assento")
public class Assento {
	
	@Id
	@GeneratedValue
	private int idAssento;
	private String tipo;
	private String poltrona;
	
	//----------------------------------------------------------------------------------------------------------------------------
	public int getIdAssento() {
		return idAssento;
	}
	//----------------------------------------------------------------------------------------------------------------------------
	public void setIdAssento(int id_Assento) {
		this.idAssento = id_Assento;
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
	public String getPoltrona() {
		return poltrona;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public void setPoltrona(String poltrona) {
		this.poltrona = poltrona;
	}

}
