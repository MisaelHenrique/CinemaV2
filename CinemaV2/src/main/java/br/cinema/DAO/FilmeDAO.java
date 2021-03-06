package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.cinema.model.Estado;
import br.cinema.model.Filme;

public class FilmeDAO {
	
	public static Logger log = LogManager.getLogger(FilmeDAO.class);

	protected EntityManager em;
	
	public FilmeDAO() {
		em = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("LP4");
		if (em == null) {
			log.info("Criando conex�o");
			em = factory.createEntityManager();
		}
		return em;
	}
	
	//---------------------------------------------------------------------------------------------------------------------------
	public void save(Filme filme) {
		log.info("Salvando filme");
		
		try {
			em.getTransaction().begin();
			em.persist(filme);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
			log.error("Erro ao salvar o filme" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	//---------------------------------------------------------------------------------------------------------------------------

	
	public void atualizar(Filme filme) {
		log.info("Salvando filme");
		
		try {
			em.getTransaction().begin();
			em.merge(filme);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o filme" + e.getMessage());
			em.getTransaction().rollback();

		}finally {
			em.close();
		}
	}
	
	public Filme getById(final int id) {
		return em.find(Filme.class, id);
		
	}
	
	//---------------------------------------------------------------------------------------------------------------------------

	
	public void remover(Filme filme){
		em.getTransaction().begin();
		Filme filmeRemover = getById(filme.getIdFilme());
		em.remove(filmeRemover);
		em.getTransaction().commit();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Filme> getAll(){
		return em.createQuery("FROM" + Filme.class.getName()).getResultList();
	}

	public Filme getByName(String titulo) {
		em.getTransaction().begin();
		TypedQuery<Filme> queryFilme = em.createNamedQuery("Filme.getIdFilme", Filme.class);
		queryFilme.setParameter("estado", titulo);
		return queryFilme.getSingleResult();
	}

}
