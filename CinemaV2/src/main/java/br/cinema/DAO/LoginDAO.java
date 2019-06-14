package br.cinema.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import br.cinema.model.Cliente;
import br.cinema.model.Login;

public class LoginDAO {
	
	public static Logger log = LogManager.getLogger(LoginDAO.class);

	protected EntityManager em;

	public LoginDAO() {
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

	
	public void save(Login login) {
		log.info("Salvando login");
		
		try {
			em.getTransaction().begin();
			em.persist(login);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o login" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	//---------------------------------------------------------------------------------------------------------------------------

	
	public void atualizar(Login login) {
		log.info("Salvando login");
		
		try {
			em.getTransaction().begin();
			em.merge(login);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Erro ao salvar o login" + e.getMessage());
		}finally {
			em.close();
		}
	}
	
	public Login getById(final int id) {
		return em.find(Login.class, id);
		
	}
	
	//---------------------------------------------------------------------------------------------------------------------------

	
	public void remover(Login login){
		em.getTransaction().begin();
		Login loginRemover = getById(login.getIdLogin());
		em.remove(loginRemover);
		em.getTransaction().commit();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Login> getAll(){
		return em.createQuery("FROM" + Cliente.class.getName()).getResultList();
	}

}
