package br.cinema.model;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_cliente")
public class Cliente {
	
	@Id
	private int idCliente;
	@Column(name = "tipoCliente")
	private String tipoCliente;// Normal; VIP; Platinum; Ouro;
	private boolean estudante;
	private LocalDate validade;

	// -----------------------------------------------------------------------------
		//jodaTime

	// -----------------------------------------------------------------------------
	
	
	public String getTipoCliente() {
		return tipoCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	// -----------------------------------------------------------------------------
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	// -----------------------------------------------------------------------------
	public boolean isEstudante() {
		return estudante;
	}

	// -----------------------------------------------------------------------------
	public void setEstudante(boolean estudante) {
		this.estudante = estudante;
	}

	// -----------------------------------------------------------------------------
	public LocalDate getValidade() {
		return validade;
	}

	// -----------------------------------------------------------------------------
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

}
