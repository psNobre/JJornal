package br.ufc.jjornal.dao;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import br.ufc.jjornal.dao.interfaces.IUserDAO;
import br.ufc.jjornal.factory.JPAUtilFactory;
import br.ufc.jjornal.logger.Logger;
import br.ufc.jjornal.model.User;

@Repository
public class UserDAO implements IUserDAO {
	private static final String TAG = UserDAO.class.getName();
	

	@Override
	public User findUserByLogin(String login) {	
		EntityManager entityManager = JPAUtilFactory.geEntityManager();
		
		
		entityManager.getTransaction().begin();
		User user = entityManager.find(User.class, login);
		entityManager.getTransaction().commit();
		Logger.printLog(TAG, "Usuário encontrado com sucesso...");
		
//		User user = entityManager.createQuery("select u from usuario u where u.login = :login", User.class)
//								 .setParameter("login", login)
//								 .getSingleResult();	
//		Logger.printLog(TAG, "Usuário encontrado com sucesso...");
//		entityManager.close();	
		
		return user;
	}

	@Override
	public void salvar(User user) {	
		EntityManager entityManager = JPAUtilFactory.geEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		Logger.printLog(TAG, "Usuário persistido com sucesso..."); 
		
		entityManager.close();
	}

	
}
