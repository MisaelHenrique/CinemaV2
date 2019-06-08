package br.cinema.DAO;

import javax.persistence.EntityManager;

import br.cinema.JPA.Conexao;

public class EnderecoJPA {
	
	private EntityManager em;
	
	public EnderecoJPA(){
		Conexao conn = new Conexao();
		em = conn.getEntity();
		
	}

}
