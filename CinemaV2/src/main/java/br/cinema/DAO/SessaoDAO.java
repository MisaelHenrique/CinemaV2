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
import br.cinema.model.Sessao;

public class SessaoDAO {
	
	public static Logger log = LogManager.getLogger(SessaoDAO.class);

	protected EntityManager em;
	
	public SessaoDAO() {
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
	
	public void save(Sessao sessao) {
		log.info("Salvando sessao");
		
		try {
			em.getTransaction().begin();
			em.persist(sessao);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o cliente" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	public void atualizar(Sessao sessao) {
		log.info("Salvando sessao");
		
		try {
			em.getTransaction().begin();
			em.merge(sessao);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o cliente" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	public Sessao getById(final int id) {
		return em.find(Sessao.class, id);
		
	}
	
	public void remover(Sessao sessao){
		em.getTransaction().begin();
		Sessao sessaoRemover = getById(sessao.getIdSessao() );
		em.remove(sessaoRemover);
		em.getTransaction().commit();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Sessao> getAll(){
		return em.createQuery("FROM" + Sessao.class.getName()).getResultList();
	}

	public Sessao getByName(String horarioCombo) {
		em.getTransaction().begin();
		TypedQuery<Sessao> querySessao = em.createNamedQuery("Sessao.getIdSessao", Sessao.class);
		querySessao.setParameter("estado", horarioCombo);
		return querySessao.getSingleResult();
		
	}

}
