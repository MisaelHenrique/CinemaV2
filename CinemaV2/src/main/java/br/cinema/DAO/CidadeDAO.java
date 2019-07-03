package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.cinema.model.Cidade;
import br.cinema.model.Estado;

public class CidadeDAO {
	public static Logger log = LogManager.getLogger(ClienteDAO.class);

	protected EntityManager em;

	public CidadeDAO() {
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

// Busca cidade por id no banco de dados
	public Cidade getById(final int id) {
		return em.find(Cidade.class, id);
	}

	public Cidade getByName(String cidadeCombo) {
		em.getTransaction().begin();
		TypedQuery<Cidade> queryCidade = em.createNamedQuery("Cidade.getIdCidade", Cidade.class);
		queryCidade.setParameter("cidade", cidadeCombo);
		return queryCidade.getSingleResult();

	}

// Salvar cidade no banco de dados
	public void save(Cidade cidade) {
		em.getTransaction().begin();
		em.persist(cidade);
		em.getTransaction().commit();
	}

// Atualizar cidade no banco de dados
	public void update(Cidade cidade) {
		em.getTransaction().begin();
		em.merge(cidade);
		em.getTransaction().commit();
	}

// Remover cidade no banco de dados
	public void delete(Cidade cidade) {
		em.getTransaction().begin();
		Cidade CidadeRemover = getById(cidade.getIdCidade());
		em.remove(CidadeRemover);
		em.getTransaction().commit();
	}

	public List<Cidade> getCidadesById(Estado idEstado) {
		TypedQuery<Cidade> query = em.createNamedQuery("Cidade.getCidades", Cidade.class);
		query.setParameter("Estado", idEstado);
		return query.getResultList();

	}
}