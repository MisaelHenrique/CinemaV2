package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.cinema.model.Funcionario;

public class FuncionarioDAO {
	
	public static Logger log = LogManager.getLogger(FuncionarioDAO.class);

	protected EntityManager em;

	public FuncionarioDAO() {
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
	
	public void save(Funcionario funcionario) {
		log.info("Salvando funcionario");
		
		try {
			em.getTransaction().begin();
			em.persist(funcionario);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o funcionario" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	public void atualizar(Funcionario funcionario) {
		log.info("Salvando funcionario");
		
		try {
			em.getTransaction().begin();
			em.merge(funcionario);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o funcinario" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	public Funcionario getById(final int id) {
		return em.find(Funcionario.class, id);
		
	}
	
	public void remover(Funcionario funcionario){
		em.getTransaction().begin();
		Funcionario funcRemover = getById(funcionario.getIdPessoa() );
		em.remove(funcRemover);
		em.getTransaction().commit();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Funcionario> getAll(){
		return em.createQuery("FROM" + Funcionario.class.getName()).getResultList();
	}

}
