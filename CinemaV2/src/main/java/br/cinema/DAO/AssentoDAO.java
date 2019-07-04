package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.cinema.model.Assento;
import br.cinema.model.Filme;
import br.cinema.model.Sessao;

public class AssentoDAO {
	
	public static Logger log = LogManager.getLogger(AssentoDAO.class);

	protected EntityManager em;
	
	public AssentoDAO() {
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
	
	public void save(Assento assento) {
		log.info("Salvando assento");
		
		try {
			em.getTransaction().begin();
			em.persist(assento);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o assento" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	public void atualizar(Assento assento) {
		log.info("Salvando assento");
		
		try {
			em.getTransaction().begin();
			em.merge(assento);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o assento" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	public Assento getById(final int id) {
		return em.find(Assento.class, id);
		
	}
	
	public void remover(Assento assento){
		em.getTransaction().begin();
		Assento assRemover = getById(assento.getIdAssento());
		em.remove(assRemover);
		em.getTransaction().commit();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Assento> getAll(){
		return em.createQuery("FROM" + Assento.class.getName()).getResultList();
	}

	public Assento getByName(String assentoCombo) {
		em.getTransaction().begin();
		TypedQuery<Assento> queryAssento = em.createNamedQuery("Assento.getIdAssento", Assento.class);
		queryAssento.setParameter("estado", assentoCombo);
		return queryAssento.getSingleResult();
		
	}

}
