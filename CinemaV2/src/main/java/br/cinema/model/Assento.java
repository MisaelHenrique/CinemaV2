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
	private int id_Assento;
	private String tipo;
	private String poltrona;
	
	//----------------------------------------------------------------------------------------------------------------------------
	public int getId_Assento() {
		return id_Assento;
	}
	public void setId_Assento(int id_Assento) {
		this.id_Assento = id_Assento;
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
