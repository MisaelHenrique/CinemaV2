package br.cinema.APP;

import java.util.TimeZone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.cinema.DAO.ClienteDAO;
import br.cinema.model.Cliente;

public class TesteJPA {

	public static Logger log = LogManager.getLogger(TesteJPA.class.getName());

	public static void main(String[] args) {

		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("LP4");

		log.warn("Abrindo Conexão!");

		EntityManager emf = factory.createEntityManager();

		
		  Cliente user = new Cliente();
		  user.setNome("beto" );
		  user.setCpf("123456789-00"); 
		  user.setEmail("beto@beto.com.br");
		  user.setEndereco(" Ruaxxxx"); 
		  user.setEstudante(false);
		  user.setSenha("12345");
		  ClienteDAO dao = new ClienteDAO(); //dao.save(user); user.setIdPessoa(1);
		  
		  
		  dao.save(user);
		  
		 

	}

}
