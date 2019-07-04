package br.cinema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_venda")
public class Venda {

	@Id
	@GeneratedValue
	private int idVenda;
	@ManyToOne
	private Filme titulo;
	@ManyToOne
	private Sessao horario;
	@ManyToOne
	private Sessao valor;
	@ManyToOne
	private Assento poltrona;

	// ------------------------------------------------------------------------------------------------------------------------------------
	public int getIdVenda() {
		return idVenda;
	}

	// ------------------------------------------------------------------------------------------------------------------------------------
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	// ------------------------------------------------------------------------------------------------------------------------------------v
	public Sessao getHorario() {
		return horario;
	}
	// ------------------------------------------------------------------------------------------------------------------------------------

	public Filme getTitulo() {
		return titulo;
	}
	// ------------------------------------------------------------------------------------------------------------------------------------

	public void setTitulo(Filme titulo) {
		this.titulo = titulo;
	}
	// ------------------------------------------------------------------------------------------------------------------------------------

	public Sessao getValor() {
		return valor;
	}
	// ------------------------------------------------------------------------------------------------------------------------------------

	public void setValor(Sessao valor) {
		this.valor = valor;
	}

	// ------------------------------------------------------------------------------------------------------------------------------------
	public void setHorario(Sessao horario) {
		this.horario = horario;
	}

	// ------------------------------------------------------------------------------------------------------------------------------------
	public Assento getPoltrona() {
		return poltrona;
	}

	// ------------------------------------------------------------------------------------------------------------------------------------
	public void setPoltrona(Assento poltrona) {
		this.poltrona = poltrona;
	}

}
