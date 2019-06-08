package br.cinema.APP;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Teste {
	
	public static Logger log = LogManager.getLogger(Teste.class.getName());

	public static void main(String[] args) {
		

		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("LP4");
		
		log.warn("Abrindo Conexão!");
		
		EntityManager emf = factory.createEntityManager();

	}

}
