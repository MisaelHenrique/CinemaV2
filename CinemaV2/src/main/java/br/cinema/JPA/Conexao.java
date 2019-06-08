package br.cinema.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	private EntityManager em = null;
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LP4");

	// -----------------------------------------------------------------------------------------------------------
	public Conexao() {

		if (emf == null) {
			em = emf.createEntityManager();
		} 
	}

	public EntityManager getEntity() {
		return em;
	}

}
