package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.cinema.model.FormaPagamento;

public class FormaPagamentoDao {
	
	public static Logger log = LogManager.getLogger(FormaPagamentoDao.class);

	protected EntityManager em;
	
	public FormaPagamentoDao() {
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
	public void save(FormaPagamento pagamento) {
		log.info("Salvando Forma de pagamento");
		
		try {
			em.getTransaction().begin();
			em.persist(pagamento);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
			log.error("Erro ao salvar Forma de pagamento" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	//---------------------------------------------------------------------------------------------------------------------------

	
	public void atualizar(FormaPagamento pagamento) {
		log.info("Salvando Forma de pagamento");
		
		try {
			em.getTransaction().begin();
			em.merge(pagamento);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar Forma de pagamento" + e.getMessage());
			em.getTransaction().rollback();

		}finally {
			em.close();
		}
	}
	
	public FormaPagamento getById(final int id) {
		return em.find(FormaPagamento.class, id);
		
	}
	
	//---------------------------------------------------------------------------------------------------------------------------

	
	public void remover(FormaPagamento pagamento){
		em.getTransaction().begin();
		FormaPagamento pagamentoRemover = getById(pagamento.getIdPagamento());
		em.remove(pagamentoRemover);
		em.getTransaction().commit();
		
	}
	//---------------------------------------------------------------------------------------------------------------------------

	
	@SuppressWarnings("unchecked")
	public List<FormaPagamento> getAll(){
		return em.createQuery("FROM" + FormaPagamento.class.getName()).getResultList();
	}

}
