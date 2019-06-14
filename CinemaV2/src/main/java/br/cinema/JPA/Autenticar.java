package br.cinema.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.cinema.APP.TesteJPA;
import br.cinema.model.Cliente;

public class Autenticar {
	
	public static Logger LOG = LogManager.getLogger(TesteJPA.class.getName());
	public EntityManager em = null;
	
	public void Autenticar() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("LP4");

		LOG.warn("Abrindo Conexão!");

		em = factory.createEntityManager();


	}

	public boolean ValidarLogin(String user, String pwd) {
		String sql = "FROM cliente c WHERE LIKE c.email = : email and c.senha = :senha";
		
		Query qLogin = em.createQuery(sql);
		qLogin.setParameter(0, user);
		qLogin.setParameter(1, pwd);
		List<Cliente> clienteLogin = qLogin.getResultList();
		
		if(clienteLogin.size() > 0) return true;
		
		
		return false;
		
	}
}
