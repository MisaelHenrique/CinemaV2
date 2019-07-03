package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.cinema.model.Cliente;
import br.cinema.model.Endereco;

public class EnderecoDAO {
	
	public static Logger log = LogManager.getLogger(ClienteDAO.class);

	protected EntityManager em;

	public EnderecoDAO() {
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
	
	//---------------------------------------------------------------------------------------------------------------------------

	
	public void save(Endereco endereco) {
		log.info("Salvando Endereco");
		
		try {
			em.getTransaction().begin();
			em.persist(endereco);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o endereco" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	//---------------------------------------------------------------------------------------------------------------------------

	
	public void atualizar(Endereco endereco) {
		log.info("Salvando endereco");
		
		try {
			em.getTransaction().begin();
			em.merge(endereco);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o endereco" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	public Endereco getById(final int id) {
		return em.find(Endereco.class, id);
		
	}
	
	//---------------------------------------------------------------------------------------------------------------------------

	
	public void remover(Endereco endereco){
		em.getTransaction().begin();
		Endereco endRemover = getById(endereco.getId());
		em.remove(endRemover);
		em.getTransaction().commit();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> getAll(){
		return em.createQuery("FROM" + Cliente.class.getName()).getResultList();
	}

}
