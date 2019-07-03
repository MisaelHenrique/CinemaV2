package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.cinema.model.Estado;

public class EstadoDAO {

	public static Logger log = LogManager.getLogger(EstadoDAO.class);

	protected EntityManager em;

	public EstadoDAO() {
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

// Busca estado por id no banco de dados
	public Estado getById(final int id) {
		return em.find(Estado.class, id);
	}
	
	public Estado getByName(String estadoCombo) {
		em.getTransaction().begin();
		TypedQuery<Estado> queryEstado = em.createNamedQuery("Estado.getIdEstado", Estado.class);
		queryEstado.setParameter("estado", estadoCombo);
		return queryEstado.getSingleResult();
		
	}
	

// Salvar estado no banco de dados
	public void save(Estado estado) {
		em.getTransaction().begin();
		em.persist(estado);
		em.getTransaction().commit();
	}

// Atualizar estado no banco de dados
	public void update(Estado estado) {
		em.getTransaction().begin();
		em.merge(estado);
		em.getTransaction().commit();
	}

// Remover estado no banco de dados
	public void delete(Estado estado) {
		em.getTransaction().begin();
		Estado EstadoRemover = getById(estado.getIdEstado());
		em.remove(EstadoRemover);
		em.getTransaction().commit();
	}
	
	public List<Estado> getAll(){
		em.getTransaction().begin();
		return em.createQuery("FROM " + Estado.class.getName()).getResultList();
	}

}
