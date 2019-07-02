package br.cinema.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "tb_cliente")
public class Cliente extends Pessoa {
	
	
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
