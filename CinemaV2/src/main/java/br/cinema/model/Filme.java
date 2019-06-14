package br.cinema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "tab_filme")
public class Filme {

	@Id
	@GeneratedValue
	private int idFilme;
	private String titulo;
	private int duracao;
	private String classificacao;
	private String genero;
	private String sinopse;
	
	//-------------------------------------------------------------------------------------------------------------------------
	
	public String getSinopse() {
		return sinopse;
	}
	
	//-------------------------------------------------------------------------------------------------------------------------
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	//-------------------------------------------------------------------------------------------------------------------------
	public int getIdFilme() {
		return idFilme;
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}
	
	//-------------------------------------------------------------------------------------------------------------------------
	public int getDuracao() {
		return duracao;
	}
	//------------------------------------------------------------------------------------------------------------------------
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	//---------------------------------------------------------------------------------------------------------------------------
	public String getTitulo() {
		return titulo;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	//---------------------------------------------------------------------------------------------------------------------------
	public String getClassificacao() {
		return classificacao;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public String getGenero() {
		return genero;
	}
	//---------------------------------------------------------------------------------------------------------------------------
	public void setGenero(String genero) {
		this.genero = genero;
		}
	
	
	
	
}
