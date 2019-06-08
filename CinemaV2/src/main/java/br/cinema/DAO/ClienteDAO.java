package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.cinema.model.Cliente;

public class ClienteDAO {

	public static Logger log = LogManager.getLogger(ClienteDAO.class);

	protected EntityManager em;

	public ClienteDAO() {
		em = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("LP4");
		if (em == null) {
			log.info("Criando conexão");
			em = factory.createEntityManager();
		}
		return em;
	}
	
	public void save(Cliente cliente) {
		log.info("Salvando cliente");
		
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o cliente" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	public void atualizar(Cliente cliente) {
		log.info("Salvando cliente");
		
		try {
			em.getTransaction().begin();
			em.merge(cliente);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o cliente" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	public Cliente getById(final int id) {
		return em.find(Cliente.class, id);
		
	}
	
	public void remover(Cliente cliente){
		em.getTransaction().begin();
		Cliente clieRemover = getById(cliente.getIdPessoa() );
		em.remove(clieRemover);
		em.getTransaction().commit();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> getAll(){
		return em.createQuery("FROM" + Cliente.class.getName()).getResultList();
	}

}
