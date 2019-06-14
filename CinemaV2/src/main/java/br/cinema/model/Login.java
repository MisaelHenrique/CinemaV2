package br.cinema.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_login")
public class Login {
	
	@Id
	@GeneratedValue
	private int idLogin;
	private String usuario;
	private String senha;
	
	//--------------------------------------------------------------------------------------------------------------------------
	public String getUsuario() {
		return usuario;
	}
	
	//--------------------------------------------------------------------------------------------------------------------------

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	//--------------------------------------------------------------------------------------------------------------------------


	public String getSenha() {
		return senha;
	}
	//--------------------------------------------------------------------------------------------------------------------------


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//--------------------------------------------------------------------------------------------------------------------------

	public int getIdLogin() {
		return idLogin;
	}
	//--------------------------------------------------------------------------------------------------------------------------

	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}

}
