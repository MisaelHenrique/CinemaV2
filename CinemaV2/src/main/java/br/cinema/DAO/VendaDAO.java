package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.cinema.model.Venda;

public class VendaDAO {

	public static Logger log = LogManager.getLogger(VendaDAO.class);

	protected EntityManager em;

	public VendaDAO() {
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

	// ---------------------------------------------------------------------------------------------------------------------------

	public void save(Venda venda) {
		log.info("Salvando cliente");

		try {
			em.getTransaction().begin();
			em.persist(venda);
			em.getTransaction().commit();

		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o cliente" + e.getMessage());
		} finally {
			em.close();
		}
	}

	// ---------------------------------------------------------------------------------------------------------------------------

	public void atualizar(Venda venda) {
		log.info("Salvando venda");

		try {
			em.getTransaction().begin();
			em.merge(venda);
			em.getTransaction().commit();

		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o venda" + e.getMessage());
		} finally {
			em.close();
		}
	}

	public Venda getById(final int id) {
		return em.find(Venda.class, id);

	}

	// ---------------------------------------------------------------------------------------------------------------------------

	public void remover(Venda venda) {
		em.getTransaction().begin();
		Venda vendaRemover = getById(venda.getIdVenda());
		em.remove(vendaRemover);
		em.getTransaction().commit();

	}

	@SuppressWarnings("unchecked")
	public List<Venda> getAll() {
		return em.createQuery("FROM" + Venda.class.getName()).getResultList();
	}

}
