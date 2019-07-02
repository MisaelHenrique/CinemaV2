package br.cinema.APP;

import java.util.TimeZone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TesteJPA {

	public static Logger log = LogManager.getLogger(TesteJPA.class.getName());

	public static void main(String[] args) {

		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("LP4");

		log.warn("Abrindo Conexão!");

		EntityManager emf = factory.createEntityManager();

	}

}
